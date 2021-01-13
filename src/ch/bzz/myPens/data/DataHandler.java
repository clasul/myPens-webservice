package ch.bzz.myCollection.data;

import ch.bzz.myCollection.model.Pen;
import ch.bzz.myCollection.model.Collection;
import ch.bzz.myCollection.service.Config;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

import static java.lang.String.join;

/**
 * Pens
 *
 * @author Clarissa Sullivan
 * @version 1.0
 * @since 15.04.20
 *
 */

public class DataHandler {
    private static final DataHandler instance = new DataHandler();
    private static Map<String, Pen> penMap = new HashMap<>();
    private static Map<String, Color> colorMap = new HashMap<>();

    private DataHandler() {
    }

    /**
     * @return the instance of this class
     */
    public static DataHandler getInstance() {
        return DataHandler.instance;
    }

    public static void readPens() {

        BufferedReader bufferedReader;
        FileReader fileReader;
        try {
            String penPath = Config.getProperty("Pen");
            fileReader = new FileReader(penPath);
            bufferedReader = new BufferedReader(fileReader);

        } catch (FileNotFoundException fileEx) {
            fileEx.printStackTrace();
            throw new RuntimeException();
        }

        try {
            String line;
            Pen pen = null;

        } catch (IOException ioEx) {
            ioEx.printStackTrace();
            throw new RuntimeException();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException ioEx) {
                ioEx.printStackTrace();
                throw new RuntimeException();
            }
        }
    }


    public static void writePens(Map<String, Pen> penMap) {
        Writer writer = null;
        FileOutputStream fileOutputStream = null;

        try {
            String penPath = Config.getProperty("penFile");
            fileOutputStream = new FileOutputStream(penPath);
            writer = new BufferedWriter(new OutputStreamWriter(fileOutputStream, "utf-8"));

            for (Map.Entry<String, Pen> penEntry : penMap.entrySet()) {
                Pen pen = penEntry.getValue();
                String contents = join(";",
                        pen.getId(),
                        pen.getType(),
                        pen.getName(),
                        pen.getColor(),
                        Integer.toString(pen.getPrice()),
                );
                writer.write(contents + '\n');
            }
        } catch (IOException ioEx) {
            ioEx.printStackTrace();
            throw new RuntimeException();

        } finally {

            try {
                if (writer != null) {
                    writer.close();
                }

                if (fileOutputStream != null) {
                    fileOutputStream.close();

                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    /**
     * Gets the penMap
     *
     * @return value of penMap
     */
    public static Map<String, Pen> getPenMap() {
        if (penMap.isEmpty()) {
            readPen();
        }
        return penMap;
    }

    /**
     * Sets the penMap
     *
     * @param penMap the value to set
     */

    public static void setPenMap(Map<String, Pen> penMap) {
        DataHandler.penMap = penMap;
    }


}

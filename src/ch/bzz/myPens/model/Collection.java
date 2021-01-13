package ch.bzz.myPens.model;

import ch.bzz.myPens.data.*;
import java.util.Map;

/**
 * Pens
 *
 * @author Clarissa Sullivan
 * @version 1.0
 * @since 07.03.20
 * 
 */
public class Collection {

    //declare variables
    private int amtPens;
    private Map<String, Pen> penMap;

    /**
     * constructor: read all the pens
     */
    public Collection() {
        penMap = DataHandler.getPenMap();
    }
    /**
     * Gets the penMap
     *
     * @return value of penMap
     */
    public Map<String, Pen> getPenMap() {

        return penMap;
    }

    /**
     * Sets the penMap
     *
     * @param penMap the value to set
     */

    public void setPenMap(Map<String, Pen> penMap) {

        this.penMap = penMap;
    }

    /**
     * Gets the amount of Pens
     *
     * @return value of amtPens
     */
    public int getAmtPens() {
        amtPens = penMap.size();
        return amtPens;
    }
}

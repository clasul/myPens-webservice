package ch.bzz.myPens.model;

/**
 * Pens
 *
 * @author Clarissa Sullivan
 * @version 1.0
 * @since 07.03.20
 * 
 */

public class Color {

	private String colorUUID;
    private Color red;
    private Color blue;
    private Color yellow;
    private Color green;

    /**
     * Gets the colorUUID
     *
     * @return value of colorUUID
     */
    public String getColorUUID() {
        return colorUUID;
    }

    /**
     * Sets the colorUUID
     *
     * @param colorUUID the value to set
     */

    public void setColorUUID(String colorUUID) {
        this.colorUUID = colorUUID;
    }

    /**
     * Gets the color
     *
     * @return value of Color
     */
    public String getColor() {
        return Color;
    }

    /**
     * Sets the color
     *
     * @param Color the value to set
     */

    public void setColor(String color) {
        this.Color = color;
    }
}

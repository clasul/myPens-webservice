package ch.bzz.myPens.model;

import java.math.BigDecimal;

/**
 * Pens
 *
 * @author Clarissa Sullivan
 * @version 1.0
 * @since 07.03.20
 * 
 */
public class Pen {
    private String penUUID;
    private String name;
    private String type;
    private BigDecimal price;
    private String id;
    private Color color;

    /**
     * Gets the penUUID
     *
     * @return value of penUUID
     */
    public String getPenUUID() {
        return penUUID;
    }

    /**
     * Sets the penUUID
     *
     * @param penUUID the value to set
     */

    public void setPenUUID(String penUUid) {
        this.penUUID = penUUID;
    }

    /**
     * Gets the name
     *
     * @return value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name
     *
     * @param name the value to set
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the type
     *
     * @return value of type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type
     *
     * @param type the value to set
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets the price
     *
     * @return value of price
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Sets the price
     *
     * @param price the value to set
     */

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * Gets the ID
     *
     * @return value of id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the ID
     *
     * @param id the value to set
     */

    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * Gets the Color
     *
     * @return value of color
     */
    public String getColor() {
        return Color;
    }

    /**
     * Sets the Color
     *
     * @param color the value to set
     */

    public void setColor(Color color) {
        this.color = Color;
    }
    
    
    
}

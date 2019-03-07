package GraphicsUnit2;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import java.awt.Color;
import java.awt.Graphics;

public class Shape {
    //instance variables

    private int xPos;
    private int yPos;
    private int width;
    private int height;
    private Color color;
    private int xSpeed;
    private int ySpeed;

    public Shape(int x, int y, int wid, int ht, Color col, int xS, int yS) {
        xPos = x;
        //finish this constructor
        yPos = y;
        width = wid;
        height = ht;
        color = col;
        xSpeed = xS;
        ySpeed = yS;
    }

    public void draw(Graphics window) {
        window.setColor(getColor());
        //window.fillRect(xPos, yPos, width, height);

        //draw whatever you want
        //    ^
        //  [ :: ]
        //    ()
        //E
        window.drawLine(getxPos(), getyPos(), getxPos() + getWidth() / 6, getyPos());

        window.drawLine(xPos, yPos, xPos, yPos + height);
        window.drawLine(xPos, yPos + height / 2, xPos + width / 6, yPos + height / 2);
        window.drawLine(xPos, yPos + height, xPos + width / 6, yPos + height);
        //L
        window.drawLine(xPos + width / 6 + 10, yPos, xPos + width / 6 + 10, yPos + height);
        window.drawLine(xPos + width / 6 + 10, yPos + height, xPos + width / 6 + 10 + width / 6, yPos + height);
        //A
        window.drawLine(xPos + width / 6 + 20 + width / 12 + width / 6, yPos, xPos + width / 6 + 20 + width / 6, yPos + height);
        window.drawLine(xPos + width / 6 + 20 + width / 12 + width / 6, yPos, xPos + width / 6 + 20 + width / 3, yPos + height);
        //I
        window.drawLine(xPos + width / 2 + 30, yPos, xPos + width / 2 + 30, yPos + height);
        //N
        window.drawLine(xPos + width / 2 + 40, yPos, xPos + width / 2 + 40, yPos + height);
        window.drawLine(xPos + width / 2 + 40, yPos, xPos + width / 2 + 40 + width / 6, yPos + height);
        window.drawLine(xPos + width / 2 + 40 + width / 6, yPos + height, xPos + width / 2 + 40 + width / 6, yPos);
        //E
        window.drawLine(xPos + width / 2 + 50 + width / 6, getyPos(), xPos + width / 2 + 50 + width / 6 + getWidth() / 6, getyPos());
        window.drawLine(xPos + width / 2 + 50 + width / 6, yPos, xPos + width / 2 + 50 + width / 6, yPos + height);
        window.drawLine(xPos + width / 2 + 50 + width / 6, yPos + height / 2, xPos + width / 2 + 50 + width / 6 + width / 6, yPos + height / 2);
        window.drawLine(xPos + width / 2 + 50 + width / 6, yPos + height, xPos + width / 2 + 50 + width / 6 + width / 6, yPos + height);
        //window.fillRect(getxPos(), getyPos(), getWidth(), getHeight());
        //window.fillRect(getxPos(), getyPos(), getHeight(), getWidth());

    }
    
    public void moveAndDraw(Graphics window){
        setxPos(getxPos()+getxSpeed());
        setyPos(getyPos()+getySpeed());
        draw(window);
    }

    //BONUS
    //add in set and get methods for all instance variables
    /**
     * @return the xPos
     */
    
    public int getxPos() {
        return xPos;
    }

    /**
     * @param xPos the xPos to set
     */
    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    /**
     * @return the yPos
     */
    public int getyPos() {
        return yPos;
    }

    /**
     * @param yPos the yPos to set
     */
    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }

    public String toString() {
        return getxPos() + " " + getyPos() + " " + getWidth() + " " + getHeight() + " " + getColor();
    }

    /**
     * @return the xSpeed
     */
    public int getxSpeed() {
        return xSpeed;
    }

    /**
     * @param xSpeed the xSpeed to set
     */
    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    /**
     * @return the ySpeed
     */
    public int getySpeed() {
        return ySpeed;
    }

    /**
     * @param ySpeed the ySpeed to set
     */
    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }
}

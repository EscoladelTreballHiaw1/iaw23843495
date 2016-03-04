/*
 * Triangle.java        0.1 4 Mar 2016
 *
 * Modelizes the program.
 *
 * Copyright 2016 Gerard Segarra <gersegarra@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Triangle {
    
    // The first side.
    private double side1;
    // The second side.
    private double side2;
    // The third side3.
    private double side3;
    
    /**
     * Constructir by default.
     */
    public Triangle() {
        this.side1 = 3;
        this.side2 = 4;
        this.side3 = 5;
    }
    
    /**
     * Constructor.
     * 
     * @param side1 is the first side.
     * @param side2 is the second side.
     * @param side3 is the third side.
     */
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    //Methods
    
    /**
     * Returns the parimeter of the trinagle.
     *
     * @return the perimeter of the trinagle.
     */
    public double perimeter() {
        return side1 + side2 + side3;
    }
    
    /**
     * Returns the area of the triangle.
     * 
     * @return the area of the triangle.
     */
    public double area() {
        double area;
        area = Math.sqrt(Math.pow(Math.pow(side1,2) + Math.pow(side2,2) + Math.pow(side3,2),2) 
                             - 2 * (Math.pow(side1,4) + Math.pow(side2,4) + Math.pow(side3,4))) / 4;
        return area;
    }
}
    
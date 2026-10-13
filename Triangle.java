import java.util.Scanner;
/**
 * Triangle is an introduction to writing classes that returns the dimensions, name, and area of three triangles.
 *
 * @author Kyra Hovey, khovey@student.sdccd.edu
 * @version v1.0
 * @since 10/9/26
 */
public class Triangle
{
    //Field Vars
    private String name;
    private double base, height;

    /** No-args constructor Triangle() introduces the field variables for name, base, and height, and sets them to placeholder values.
     */
    public Triangle()   {
        name = "unknown";
        base = 0.0;
        height = 0.0;
    }

    /** Constructor Triangle() sets the field variables name, base, and height equal to instance variables inName, inBase, inHeight. 
     * @param inName, the triangle name input by the user
     * @param inBase, the length of the triangle base input by the user
     * @param inHeight, the height of the triangle input by the user
     */
    public Triangle(String inName, double inBase, double inHeight)  {
        name = inName;
        base = inBase;
        height = inHeight;
    }

    /**
     * writeOutput() method prints out the name, base, height, and area of each triangle.
     */
    public void writeOutput()   {
        System.out.println("Triangle name is: " + name);
        System.out.println("Triangle base is: " + base);
        System.out.println("Triangle height is: " + height);
        System.out.printf("Triangle area is: %.1f\n", getArea());
        System.out.println();
    }

    /**
     * readInput() method asks the user to enter a name, base, and height for a triangle and then assigns them to vars inName, inBase, and inHeight.
     */ 
    public void readInput() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the name of this triangle?");
        name = keyboard.nextLine();
        System.out.println("What is the base of this triangle?");
        base = keyboard.nextDouble();
        System.out.println("What is the height of this triangle?");
        height = keyboard.nextDouble();
    }

    /**
     * setName() method sets the triangle name input by the user to the name var in Triangle()
     */
    public void setName(String inName)   {
        name = inName;
    }

    /**
     * setBase() method sets the base var to the inBase var input by the user
     */
    public void setBase(double inBase)   {
        base = inBase;
    }

    /**
     * setHeight() method sets the height var to the inHeight var input by the user
     */
    public void setHeight(double inHeight) {
        height = inHeight;
    }

    /**
     * getArea() method returns the area of a given triangle
     * @return gives the area of the triangle
     */
    private double getArea()    {
        return 0.5 * base * height;
    }

}
public class DocComments {
    public static void main(String[] args) {
        
    }
    /**
     * Function name: greet
     * @param greeting (String)
     * @param name (String)
     * 
     * Inside the function:
     *  1. prints the name and greeting as part of a text
     */
    public static void greet(String greeting, String name) {
        System.out.println("Hi " + name + ", " + greeting);
    }
    /**
     * Function name: calculateArea
     * @param length (double)
     * @param width (double)
     * @return (double)
     * 
     * Inside the function:
     * 1. This function calculates the area and returns it.
     */
    public static double calculateArea(double length, double width) {
        double area = length * width;
        return area;
    }
}

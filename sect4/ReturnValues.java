public class ReturnValues {
    public static void main(String[] args) {
        double areaOne = calculateArea(2.3, 3.6);
        double areaTwo = calculateArea(1.6, 2.4);
        double areaThree = calculateArea(2.6, 4.2);

        // calculateArea(-5, 2);
        System.out.println(explainArea("English"));
        explainArea("English");
        printArea(2.3, 3.6, areaOne);
        printArea(1.6, 2.4, areaTwo);
        printArea(2.6, 4.2, areaThree);


        String enlishExplanation = explainArea("English");
        String frenchExplanation = explainArea("French");
        String spanishExplanation = explainArea("Spanish");
        // String italianExplanation = explainArea("Italian");




    }

    // functions return type = double
    // two params, both doubles
    public static double calculateArea(double length, double width) {
        if (length < 0 || width < 0) {
            System.out.println("Input error. Invalid dimensions.");
            System.exit(0);
        }

        double area = length * width;
        return area;
    }
    public static String explainArea(String language) {

        // because we are returning values, don't need break in the switch cases
        switch (language) {
            case "English":
                return "Area equals length * width";
            case "French":
                return "La surface est egale a la longueur * la largeur.";
            case "Spanish":
                return "Area es igual a largo * ancho.";  
            default:
                return "I don't speak that language.";
        }
    }
    public static void printArea(double length, double width, double area) {
        System.out.println("A rectangle with a length of " + length + " and a width of " + width + " has an area of " + area + ".");
    }
}

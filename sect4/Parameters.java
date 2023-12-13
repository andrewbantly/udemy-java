public class Parameters {
    public void main (String[] args){
        double areaOne = calculateArea(2.3, 3.5);
        double areaTwo = calculateArea(1.6, 2.4);
        double areaThree = calculateArea(2.6, 4.3);
    }
    
    // functions return type = double
    // two params, both doubles
    public static double calculateArea(double length, double width) {
        double area = length * width;
        return area;
    }
}
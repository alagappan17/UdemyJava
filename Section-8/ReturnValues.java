public class ReturnValues {
    public static void main(String[] args) {
        double area = areaOfRect(100, 4);
        System.out.println("Area: " + area);
    }

    public static double areaOfRect(double len, double wid) {
        return len * wid;
    }
}

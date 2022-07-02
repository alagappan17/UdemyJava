public class ReturnValues {
    public static void main(String[] args) {
        String option = "perimeter";
        double val = measureRect(100, 4, option);
        stringPrinter(val, option);
    }

    public static double measureRect(double len, double wid, String option) {
        switch (option) {
            case "area":
                return len * wid;
            case "perimeter":
                return 2 * (len + wid);
            default:
                return 404;
        }
    }

    public static void stringPrinter(double val, String option) {
        System.out.println(option + ": " + val);
    }
}

public class ReturnValues {
    public static void main(String[] args) {
        String option = "perimeter";
        double val = measureRect(-1, 4, option);
        stringPrinter(val, option);
    }

    public static double measureRect(double len, double wid, String option) {
        if (len < 0 || wid < 0) {
            System.out.println("Cannot be negative");
            System.exit(0);
        }
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

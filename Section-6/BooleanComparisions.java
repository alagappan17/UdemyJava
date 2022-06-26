public class BooleanComparisions {
    public static void main(String[] args) {
        int grade1 = 10;
        int grade2 = 12;
        int grade3 = 12;
        System.out.println(grade1 > grade2);
        System.out.println(grade1 < grade2);
        System.out.println(grade3 <= grade2);
        System.out.println(grade3 >= grade2);
        System.out.println(grade3 == grade2);
        System.out.println(grade3 != grade2);

        String sentance1 = "Hello";
        String sentance2 = "World";
        System.out.println(!sentance1.equals(sentance2));
    }
}

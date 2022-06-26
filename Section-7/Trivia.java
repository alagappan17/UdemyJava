import java.util.Scanner;

public class Trivia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Trivia!");
        int score = 0;
        System.out.println("1. Which of the following is greater than 9?\na) 12\nb) 5\nc) 4");
        String choice = scan.nextLine();
        if (choice.equals("a"))
            score += 5;
        System.out.println("1. First letter of the alphabet?\na) A\nb) Z\nc) C");
        choice = scan.nextLine();
        if (choice.equals("a"))
            score += 5;
        System.out.println("Final Score: " + score);
    }
}

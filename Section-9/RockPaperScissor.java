import java.util.*;

public class RockPaperScissor {
    public static void main(String[] args) {
        System.out.println("Are you ready? Enter 'yes' or 'no'");
        Scanner scan = new Scanner(System.in);
        String ready = scan.nextLine();

        if (ready.equals("yes")) {
            System.out.println("Great!");
            System.out.println("Rock-Paper-Scissor. Shoot!");
            String choice = scan.nextLine();
            String computerChoice = computerChoice();
            String finalResult = result(choice, computerChoice);
            printResult(choice, computerChoice, finalResult);
        } else {
            System.out.println("Darn!");
        }

        scan.close();
    }

    public static String computerChoice() {
        double randomNumber = Math.random() * 3;
        int integer = (int) randomNumber;
        switch (integer) {
            case 0:
                return "rock";
            case 1:
                return "paper";
            case 2:
                return "scissor";
            default:
                return "";
        }
    }

    public static String result(String userChoice, String computerChoice) {
        String result = "";
        if (userChoice.endsWith("rock") && computerChoice.equals("scissor")) {
            result = "You Win";
        } else if (userChoice.endsWith("scissor") && computerChoice.equals("rock")) {
            result = "You Lose!";
        } else if (userChoice.endsWith("rock") && computerChoice.equals("paper")) {
            result = "You Lose!";
        } else if (userChoice.endsWith("paper") && computerChoice.equals("rock")) {
            result = "You Win!";
        } else if (userChoice.endsWith("paper") && computerChoice.equals("scissor")) {
            result = "You Lose!";
        } else if (userChoice.endsWith("scissor") && computerChoice.equals("paper")) {
            result = "You Win!";
        } else {
            result = "It's a Tie!";
        }
        return result;
    }

    public static void printResult(String userChoice, String computerChoice, String finalResult) {
        System.out.println("You chose " + userChoice);
        System.out.println("The computer chose: " + computerChoice);
        System.out.println(finalResult);
    }
}

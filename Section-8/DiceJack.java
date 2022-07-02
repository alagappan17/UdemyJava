import java.util.*;

public class DiceJack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 numbers between 1 and 6");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if (num1 < 1 || num2 < 1 || num3 < 1 || num1 > 6 || num2 > 6 || num3 > 6) {
            System.out.println("Invalid Number");
            System.exit(0);
        }

        int dice1 = diceRoll();
        int dice2 = diceRoll();
        int dice3 = diceRoll();

        int sumOfNum = num1 + num2 + num3;
        int sumOfDice = dice1 + dice2 + dice3;

        System.out.println("Num Sum: " + sumOfNum);
        System.out.println("Dice Sum: " + sumOfDice);

        checkWin(sumOfDice, sumOfNum);

        scan.close();
    }

    public static int diceRoll() {
        return (int) (Math.random() * 6) + 1;
    }

    public static void checkWin(int sumOfDice, int sumOfNum) {
        if (sumOfNum > sumOfDice && sumOfNum - sumOfDice < 3) {
            System.out.println("Congrats you win");
        } else {
            System.out.println("Sorry you lose");
        }
    }
}

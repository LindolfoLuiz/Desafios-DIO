import java.util.Scanner;

public class LojinhaDeDoces {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int money = scan.nextInt();

        int candies = money * 2;
        System.out.println("O cliente obteve " + candies + " doces");
    }
}


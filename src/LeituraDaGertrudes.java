import java.util.Scanner;

public class LeituraDaGertrudes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pages = scan.nextInt();

        int days = (pages + 2) / 3;
        System.out.println(days + " dias");
    }
}


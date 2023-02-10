import java.util.Scanner;

public class IndustriaDeMulta {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int velocidade = sc.nextInt();

        if (velocidade <= 60) {
            System.out.println("Nao foi multado");
        } else {
            System.out.println("Foi multado");
        }
    }
}


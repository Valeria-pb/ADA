import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas frutas você comprada? ");
        double quantidade = scanner.nextDouble();


        System.out.printf("O valor a ser pago para %.0f frutas é: R$%.2f%n", quantidade, Solution.custoCompra(quantidade));

    }
}


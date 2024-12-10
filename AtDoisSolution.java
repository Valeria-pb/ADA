
public class Solution {
    public static double custoCompra(double quantidade) {
        double precoPorFruta;

        if (quantidade > 10) {
            precoPorFruta = 1.25;
        } else {
            precoPorFruta = 1.45;
        }

        double valorTotal = quantidade * precoPorFruta;
        return valorTotal;
    }

    public static void main(String[] args) {
        // Exemplos de uso:
        double quantidade1 = 2;
        double quantidade2 = 12;

        System.out.println("O valor a ser pago para " + quantidade1 + " frutas é: R$" + custoCompra(quantidade1));
        System.out.println("O valor a ser pago para " + quantidade2 + " frutas é: R$" + custoCompra(quantidade2));
    }
}

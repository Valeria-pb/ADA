import java.util.Scanner;
public class Main {
    public static <Tabuada> void main(String[] args) {
        //inicio do metodo main
        // primeiro comando, sasudação olá mundo!
        System.out.println("olá mundo!");

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Imprime uma mensagem solicitando o nome
        System.out.print("Digite seu nome: ");

        // Lê o nome digitado pelo usuário e armazena na variável nome
        String nome = scanner.nextLine();
        // Imprime a saudação personalizada
        System.out.println("Olá, " + nome + "! Seja bem-vindo(a)!");



        // Criando um Objeto Minha Classe
        MinhaClasse minhaClasse = new MinhaClasse();
        minhaClasse.exibirMensagem();

        // Criando um objeto Calculadora
        Calculadora calculadora = new Calculadora();

        int num1 = 10;
        int num2 = 5;

        System.out.println("Soma: " + calculadora.somar(num1, num2));
        System.out.println("Subtração: " + calculadora.subtrair(num1, num2));
        System.out.println("Multiplicação: " + calculadora.multiplicar(num1, num2));
        System.out.println("Divisão: " + calculadora.dividir(num1, num2));


        // Tabuada de multiplicar
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Digite um número para ver a tabuada: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) System.out.println(numero + " x " + i + " = " + (numero * i));

        // Fecha o Scanner para liberar recursos (opcional, mas recomendado)
        scanner.close();
        // fim do metodo main
    }
}

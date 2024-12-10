import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
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

        // Fecha o Scanner para liberar recursos (opcional, mas recomendado)
        scanner.close();


        // Criando um Objeto Minha Classe
        MinhaClasse minhaClasse = new MinhaClasse();
        minhaClasse.exibirMensagem();



        Calculadora calculadora = new Calculadora();

        int num1 = 10;
        int num2 = 5;

        System.out.println("Soma: " + calculadora.somar(num1, num2));
        System.out.println("Subtração: " + calculadora.subtrair(num1, num2));
        System.out.println("Multiplicação: " + calculadora.multiplicar(num1, num2));
        System.out.println("Divisão: " + calculadora.dividir(num1, num2));
    }
    // fim do metodo main

}


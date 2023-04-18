import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Sistema de Diagnóstico de IMC");
        //Entrada de dados
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("");

        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();
        System.out.println("");

        System.out.print("Digite seu peso: ");
        double peso = scanner.nextDouble();
        System.out.println("");

        scanner.close();
        //Processamento
        double imc = peso / Math.pow(altura, 2);
        String classificacao = "";
        int grauDeObesidade = 0;

        if (imc < 18.5) {
            classificacao = "MAGREZA";
            grauDeObesidade = 0;
        } else if (imc >= 18.5 && imc < 25) {
            classificacao = "NORMAL";
            grauDeObesidade = 0;
        } else if (imc >= 25 && imc < 30) {
            classificacao = "SOBREPESO";
            grauDeObesidade = 1;
        } else if (imc >= 30 && imc < 40) {
            classificacao = "OBESIDADE";
            grauDeObesidade = 2;
        } else if (imc > 40) {
            classificacao = "OBESIDADE-GRAVE";
            grauDeObesidade = 3;
        }

        //Saída
        System.out.printf("O funcionário %s, da altura %2.2f e peso %3.2f tem o IMC = %2.2f, com diagnóstico %s %d", nome, altura, peso, imc, classificacao, grauDeObesidade);
    }
}

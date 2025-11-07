import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        // Criação de um objeto Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar o peso
        System.out.print("Digite seu peso (em kg): ");
        double peso = scanner.nextDouble();
        
        // Solicitar a altura
        System.out.print("Digite sua altura (em metros): ");
        double altura = scanner.nextDouble();
        
        // Calcular o IMC
        double imc = peso / (altura * altura);
        
        // Exibir o IMC
        System.out.printf("Seu IMC é: %.2f\n", imc);
        
        // Classificação do IMC
        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso.");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Você está com o peso normal.");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Você está com sobrepeso.");
        } else if (imc >= 30 && imc < 39.9) {
            System.out.println("Você está com obesidade.");
        } else {
            System.out.println("Você está com obesidade grave.");
        }

        // Fechar o scanner
        scanner.close();
    }
}

import java.util.Scanner;

public class Avaliacao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String name = scanner.next();
        System.out.println("Digite o seu peso: ");
        String entradaPeso = scanner.next();
        System.out.println("Digite a sua altura: ");
        String entradaAltura = scanner.next();

        double peso = Double.parseDouble(entradaPeso);
        double altura = Double.parseDouble(entradaAltura);
        String result = "";

        CalculadoraIMC calculadoraIMC = new CalculadoraIMC();
        calculadoraIMC.calc(result, name, peso, altura);

        scanner.close();
    }

}
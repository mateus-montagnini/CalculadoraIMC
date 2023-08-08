public class CalculadoraIMC {
    public void calc(String name, double peso, double altura) {
        double imc = peso / (Math.pow(altura, 2));
        System.out.println(name + " o seu IMC é de: " + imc);
    }
}

public class Calculadora {
    public void calculadora(double peso, double altura) {
        
        double imc = peso / (Math.pow(altura, 2));
        System.out.println(imc);
    }
}

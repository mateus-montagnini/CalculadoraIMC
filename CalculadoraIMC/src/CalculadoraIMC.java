public class CalculadoraIMC {
    public void calc(String result, String name, double peso, double altura) {
        double imc = peso / (Math.pow(altura, 2));

        if(imc <= 16.9) {
            result = "com o peso muito abaixo do recomendado";
        } else if(imc >= 17 && imc <= 18.4) {
            result = "com o peso abaixo do recomendado";
        } else if(imc >= 18.5 && imc <= 24.9) {
            result = "com o peso dentro do recomendado";
        } else if(imc >= 25 && imc <= 29.9) {
            result = "com o peso acima do recomendado";
        } else if(imc >= 30 && imc <= 34.9) {
            result = "com obesidade grau I";
        } else if(imc >= 35 && imc <= 40) {
            result = "com obesidade grau II";
        } else if(imc >40) {
            result = "com obesidade grau III";
        }
        System.out.println(name + " o seu IMC é de: " + imc + "e você está " + result);
    }
}

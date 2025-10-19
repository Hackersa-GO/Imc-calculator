public class IMC {
    public static void main(String[] args) {
        double altura = 1.75;
        double peso = 68.0;
        double imc = peso / (altura * altura);

        System.out.println("O resultado do IMC é: " + imc);

        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso.");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Seu peso está normal.");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Você está com sobrepeso.");
        } else if (imc >= 30 && imc < 40) {
            System.out.println("Você está obeso.");
        } else {
            System.out.println("Obesidade grave. Procure orientação médica.");
        }
    }
}
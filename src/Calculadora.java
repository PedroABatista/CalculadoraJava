import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Double valorUm;
        Double valorDois;
        String operacao;

        System.out.println("Digite o primeiro valor  :");
        valorUm = leitor.nextDouble();

        System.out.println("Digite qual operação deseja fazer ( + , - , * , / ) : ");
        operacao = leitor.next();

        System.out.println("Digite o segundo valor :");
        valorDois = leitor.nextDouble();

        System.out.println("Resultado é : " + calculo(valorUm, valorDois, operacao));
    }

    public static Double calculo(Double valorUm, Double valorDois, String operacao) {
        Double respostaDoCalculo = 0.0;

        switch (operacao) {
            case "+":
                respostaDoCalculo = valorUm + valorDois;
                break;
            case "-":
                respostaDoCalculo = valorUm - valorDois;
                break;
            case "*":
                respostaDoCalculo = valorUm * valorDois;
                break;
            case "/":
                respostaDoCalculo = valorUm / valorDois;
                break;

            default:
                System.out.println("Operação não existente ou encontrada.");
        }
        return respostaDoCalculo;
    }
}
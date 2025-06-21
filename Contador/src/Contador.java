import exceptions.InvalidParametersException;
import java.util.Scanner;

public class Contador {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = sc.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = sc.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (InvalidParametersException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws InvalidParametersException {
        if(parametroUm > parametroDois) {
            throw new InvalidParametersException("Parâmetros inválidos");
        }

        for(int i = 1; i <= parametroDois - parametroUm; i++) {
            System.out.printf("Imprimindo o número: %d\n", i);
        }
    }
}
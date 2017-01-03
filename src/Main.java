
import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;
/*
 * Este sotfware foi feito para breve explicação do funcionamento do java;
 * O Código é livre para uso não comercial;
 * Desenvolvido através do Netbeans IDE.
 */
/**
 *
 * @author Marlon Prudente <marlonoliveira@alunos.utfpr.edu.br>
 */
public class Main {

    public static Integer soma(Integer num1, Integer num2) {
        Integer result;
        result = num1 + num2;
        return result;
    }

    public static Integer subtracao(Integer num1, Integer num2) {
        Integer result;
        result = num1 - num2;
        return result;
    }

    public static Integer multiplicacao(Integer num1, Integer num2) {
        Integer result;
        result = num1 * num2;
        return result;
    }

    public static Integer divisao(Integer num1, Integer num2) {
        Integer result;
        result = num1 / num2;
        return result;
    }

    public static void main(String[] args) {
        int op, num1 = 2, num2 = 2;

        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divsão");
        System.out.println("0 - Sair");

        Scanner teclado = new Scanner(System.in);
        op = Integer.parseInt(teclado.nextLine());

        while (op != 0) {
            switch (op) {
                case 1:
                    System.out.println("Resultado: " + soma(num1, num2));                    
                    break;

                case 2:
                    System.out.println("Resultado: " + subtracao(num1, num2));
                    break;

                case 3:
                    System.out.println("Resultado: " + multiplicacao(num1, num2));
                    break;

                case 4:
                    System.out.println("Resultado: " + divisao(num1, num2));
                    break;

                default:
                    System.out.println("Opção Inválida.");
                    break;

            }
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divsão");
            System.out.println("0 - Sair");

            op = Integer.parseInt(teclado.nextLine());
        }
        System.out.println("Até mais.");
    }

}

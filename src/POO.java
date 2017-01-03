
import Operacoes.*;
import java.util.Scanner;

/*
 * Este sotfware foi feito para breve explicação do funcionamento do java;
 * O Código é livre para uso não comercial;
 * Desenvolvido através do Netbeans IDE.
 */
/**
 *
 * @author Marlon Prudente <marlonoliveira@alunos.utfpr.edu.br>
 */
public class POO {

    public static void main(String[] args) {
        //Variáveis utilizadas nas operações
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
                    //Criação do Objeto soma
                    Soma sum = new Soma();
                    System.out.println("Resultado: " + sum.Operacao(num1, num2));
                    System.out.println("=>" + sum.Resultado());                    
                    break;
                
                case 2:
                    //Criacao do Objeto Subtração
                    Subtracao sub = new Subtracao();
                    //resultado do Objeto, utilizando o método subescrito
                    System.out.println("Resultado: " + sub.Operacao(num1, num2));
                    //Resultado a partir do método que existe somente na classe mãe
                    System.out.println("=>" + sub.Resultado());
                    break;
                
                case 3:
                    //criação do Objeto Multiplicação
                    Multiplicacao mult = new Multiplicacao();
                    //resultado do Objeto, utilizando o método subescrito
                    System.out.println("Resultado: " + mult.Operacao(num1, num2));
                    //Resultado a partir do método que existe somente na classe mãe
                    System.out.println("=>" + mult.Resultado());
                    break;
                
                case 4:
                    //Criação do Objeto Divisão
                    Divisao div = new Divisao();
                    //resultado do Objeto, utilizando o método subescrito
                    System.out.println("Resultado: " + div.Operacao(num1, num2));
                    //Resultado a partir do método que existe somente na classe mãe
                    System.out.println("=>" + div.Resultado());
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



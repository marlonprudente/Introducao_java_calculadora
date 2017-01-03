/*
 * Este sotfware foi feito para breve explicação do funcionamento do java;
 * O Código é livre para uso não comercial;
 * Desenvolvido através do Netbeans IDE.
 */
package Operacoes;

/**
 *
 * @author Marlon Prudente <marlonoliveira@alunos.utfpr.edu.br>
 */
public class Multiplicacao extends Operacoes {

    //Só é reescrito o método que será alterado
    public Integer Operacao(Integer num1, Integer num2) {
        this.result = num1 * num2;

        return this.result;
    }
}

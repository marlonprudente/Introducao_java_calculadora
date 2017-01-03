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

//CLASSE MÃE, AS OUTRAS OPERAÇÕES SERÃO FILHAS DESSA CLASSE.
public class Operacoes {
   protected Integer result;
    
   //Esse método será herdado e reescrito para cada operação
    public Integer Operacao(Integer num1, Integer num2){ 
        
        return this.result;
    }
    
    //esse método será herdado pelas classes filhas, porém, não será reescrito pelas mesmas.
    public String Resultado(){
        String resultado = this.result.toString();        
        return resultado;
    }
    
}

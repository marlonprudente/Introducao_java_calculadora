
import javax.swing.*;
import java.awt.event.*;

/*
 * Este sotfware foi feito para breve explicação do funcionamento do java;
 * O Código é livre para uso não comercial;
 * Desenvolvido através do Netbeans IDE.
 */

/**
 *
 * @author Marlon Prudente <marlonoliveira@alunos.utfpr.edu.br>
 */
public class Interface extends JFrame{
    //Botões
    private JButton numero1;
    private JButton numero2;
    private JButton somar;
    private JButton igual;
    //Display da calculadora
    private JTextField display;
    
    private int leitura;
    private int memoria;
    private char operacao;

    public Interface() {
        //Configurações da Janela
        this.setTitle("Exemplo Botão Somar");
        this.setBounds(0, 0, 267, 235);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null);

        leitura = 0;
        memoria = 0;
        //Configurações do botão +
        somar = new JButton();
        somar.setText("+");
        somar.setBounds(145, 70, 78, 45);
        this.add(somar);
        //Configurações do botão =
        igual = new JButton();
        igual.setText("=");
        igual.setBounds(25, 130, 200, 45);
        this.add(igual);
        //Configurações do botão 1
        numero1 = new JButton();
        numero1.setText("1");
        numero1.setBounds(25, 70, 45, 45);
        this.add(numero1);
        //Configurações do botão 2
        numero2 = new JButton();
        numero2.setText("2");
        numero2.setBounds(85, 70, 45, 45);
        this.add(numero2);
        //Configurações do Display
        display = new JTextField();
        display.setBounds(25, 25, 200, 30);
        this.add(display);
        //Função do botão 1, quando o mesmo é pressionado
        numero1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leitura *= 10;
                leitura += 1;
                display.setText(display.getText() + "1");
            }
        });
        //Função do botão 2, quando o mesmo é pressionado
        numero2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leitura *= 10;
                leitura += 2;
                display.setText(display.getText() + "2");
            }
        });
        //função do botão +, quado o mesmo é pressionado
        somar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                operacao = '+';
                memoria += leitura;
                leitura = 0;
                display.setText("");
            }
        });
        //função do botão =, quado o mesmo é pressionado
        igual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                switch (operacao) {
                    case '+': {
                        memoria += leitura;
                        break;
                    }
                }
                leitura = 0;
                display.setText("" + memoria);
            }
        });
    } // construtor
    
        public static void main(String[] args) {
        Interface exemplo = new Interface();
        exemplo.setVisible(true);
    }
    
}

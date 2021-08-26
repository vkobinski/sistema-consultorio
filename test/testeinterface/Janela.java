package testeinterface;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Janela extends JFrame {
     
     JButton botao = new JButton("Registrar");
     
    public Janela(){
        
        add(botao);
        setTitle("Cadastro"); 
        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        
    }
    public static void main(String[] args) {
        Janela janela = new Janela();
    }
}


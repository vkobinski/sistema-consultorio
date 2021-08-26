package testeinterface;

import javax.swing.JFrame;
import javax.swing.JButton;

public class Janelas extends JFrame  {
    
    JButton botao = new JButton("Registrar");
  
    public Janelas(){
          
          add(botao);
          
          setTitle("Titulo da janela"); 
          setSize(500,400);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          setLocationRelativeTo(null);
          setResizable(false);
          setVisible(true);
          
          
    }
    public static void main(String[] args) {
        Janelas janelas = new Janelas();
        
    }

}


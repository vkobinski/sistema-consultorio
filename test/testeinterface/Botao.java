package testeinterface;

import javax.swing.JButton;

public class Botao extends JButton{
    
    JButton jb = new JButton("Registrar");
    
    public Botao(){
        setLayout(null);
        add(jb);
        
    }
}

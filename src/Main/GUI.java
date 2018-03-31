

package Main;

//@author Radames J Halmeman  - rjhalmeman@gmail.com
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUI extends JFrame {
    
    private Container cp;
    JLabel lbAnoNasc = new JLabel("Digite o ano de seu nascimento");
    JLabel lbVazio = new JLabel("");
    JLabel lbPode = new JLabel("Você pode");
    JTextField tfAnoNasc = new JTextField(1000);
    JTextField tfResult = new JTextField(1000);
    JButton btCalcular = new JButton("Calcular");
    
    
    
    public GUI() {
        setSize(800, 600);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        cp = getContentPane();
        cp.setLayout(new GridLayout(3,2));
        setTitle("GUI");
        
        cp.add(lbAnoNasc);
        cp.add(tfAnoNasc);
        cp.add(btCalcular);
        cp.add(lbVazio);
        cp.add(lbPode);
        cp.add(tfResult);
        
        setLocationRelativeTo(null);//centraliza no monitor
        setVisible(true);
        
        btCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                CalculaPode calculaPode = new CalculaPode();
                calculaPode.setAnoNasc(Integer.valueOf(tfAnoNasc.getText()));
                tfResult.setText(String.valueOf(calculaPode.getPode()));
        
            }
        });
    }
}

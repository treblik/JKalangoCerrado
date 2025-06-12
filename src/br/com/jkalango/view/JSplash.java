package br.com.jkalango.view;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;



public class JSplash extends JFrame{
 
  public JSplash(){
    setTitle("JKalango Splash Screen");
    setSize(1200,1000);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setLayout(new FlowLayout());
    JButton startButton =new JButton("Start");
    add(startButton);//add start button

  startButton.addActionListener(new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(JSplash.this,"Jkalango");
    }
  });
   setVisible(true);

}

 
}

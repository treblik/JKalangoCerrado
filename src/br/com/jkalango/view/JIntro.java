
package br.com.jkalango.view;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.awt.Color;  // importe Color também

public class JIntro extends JFrame {
   public JIntro(){
    setTitle("Introdução do JKalango");
    setSize(1200,1000);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setLayout(new FlowLayout());

    // COR DE FUNDO CINZA
    getContentPane().setBackground(Color.GRAY);

    JLabel introMessage = new JLabel("<html><div style='text-align: center;'>"
    + "<h1>Em um mundo esquecido pelo tempo,<br>"
    + "onde o cerrado esconde segredos que nem a noite ousa revelar,<br>"
    + "vive JKlanago — um calango amaldiçoado, sobrevivente de uma espécie quase extinta.<br>"
    + "Seu olhar carrega o peso das trevas que consomem sua terra.<br>"
    + "Ao seu lado, os espíritos inquietos de JFormiga e Jabelhinha,<br>"
    + "companheiros caídos que ainda sussurram segredos macabros no vento cortante.</h1>"
    + "<p>Prepare-se para enfrentar horrores indescritíveis e salvar seus amigos.</p>"
    + "<p>Para preservar o que resta de sua espécie e proteger seus amigos do abismo, "
    + "JKlanago deve encarar missões que desafiam a própria sanidade — florestas que devoram a luz, "
    + "sombras que se movem com vontade própria e horrores ancestrais que despertam para ceifar suas almas.</p>"
    + "</div></html>");
    add(introMessage);
    JButton startButton = new JButton("Primeira Missão");
    add(startButton); // add start button

    startButton.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(JIntro.this,"Missão Iniciada");
        }
    });

    setVisible(true);
   }
}


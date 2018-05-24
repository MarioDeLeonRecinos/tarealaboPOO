/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import AbastractFactory.Convertor.Convertor;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author LN710Q
 */
public class Ventana extends JPanel{
    public int WIDTH=320,widthTF=120,widthB=80;
    public int HEIGHT=300,heightTF=30,heightB=30;
    public JTextField textF1,textF2,textF3;
    public JButton button,button2,button3;
    
    public Ventana(){
        textF1 = new JTextField();
        textF1.setBounds(new Rectangle(100,40,widthTF,heightTF));
        
        textF2 = new JTextField();
        textF2.setBounds(new Rectangle(100,200,widthTF,heightTF));
        
        button2 = new JButton();
        button2.setBounds(new Rectangle(20,115,widthB,heightTF));
        
        button3 = new JButton();
        button3.setBounds(new Rectangle(220,115,widthB,heightTF));
        
        button = new JButton("Calcular");
        button.setBounds(new Rectangle(103,115,widthTF-6,heightB));
        
        textF3 = new JTextField();
        textF3.setBounds(new Rectangle(200,200,widthTF,heightTF));
        
        textF1.setEditable(true);
        textF2.setEditable(true);

        
        button.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent arg0){
            textF3
        }
        });
        
        add(textF1);
        add(button2);
        add(button);
        add(textF2);        
        add(button3);

        setLayout(null);
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        
    }
}

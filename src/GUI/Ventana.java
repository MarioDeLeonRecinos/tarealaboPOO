/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import AbastractFactory.AbstractFactory;
import AbastractFactory.Aritmetica.Aritmetica;
import AbastractFactory.FactoryProducer;
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
    public JButton button,button2,button3,button4,button5;
    
    AbstractFactory binario;
    AbstractFactory aritmetica;
    public Ventana(){
        
        binario = FactoryProducer.getFactory("convertor");
        aritmetica = FactoryProducer.getFactory("aritmetica");
        
        textF1 = new JTextField();
        textF1.setBounds(new Rectangle(100,40,widthTF,heightTF));
        
        textF2 = new JTextField();
        textF2.setBounds(new Rectangle(100,200,widthTF,heightTF));
        
        button2 = new JButton("*");
        button2.setBounds(new Rectangle(20,115,widthB,heightTF));
        
        button3 = new JButton("/");
        button3.setBounds(new Rectangle(220,115,widthB,heightTF));
        
        button = new JButton("Binario");
        button.setBounds(new Rectangle(103,130,widthTF-6,heightTF));
        
        button4 = new JButton("+");
        button4.setBounds(new Rectangle(220,150,widthB,heightTF));
        
        button5 = new JButton("-");
        button5.setBounds(new Rectangle(20,150,widthB,heightTF));
        
        textF3 = new JTextField();
        textF3.setBounds(new Rectangle(100,250,widthTF,heightTF));
        
        textF1.setEditable(true);
        textF2.setEditable(true);
        textF3.setEditable(false);
        
        button.addActionListener(new ActionListener(){


            @Override
            public void actionPerformed(ActionEvent arg0) {
                String num1 = textF1.getText();
                try{
                    int n1 = Integer.parseInt(num1);
                    textF3.setText(binario.resultado().resultado(n1));
                }
                catch(NumberFormatException nfe){
                    System.out.print("No se puede convertir");
                }
            }
        });
        
        button2.addActionListener(new ActionListener(){


            @Override
            public void actionPerformed(ActionEvent arg0) {
                Aritmetica arit = aritmetica.getOperacionA("multi");
                String num1 = textF1.getText();
                String num2 = textF2.getText();
                try{
                    float n1 = Float.parseFloat(num1);
                    float n2 = Float.parseFloat(num2);

                    textF3.setText(arit.resultado(n1, n2));
                }
                catch(NumberFormatException nfe){
                    System.out.print("No se puede convertir");
                }
            }
        });
        
        button3.addActionListener(new ActionListener(){


            @Override
            public void actionPerformed(ActionEvent arg0) {
                Aritmetica arit = aritmetica.getOperacionA("divi");
                String num1 = textF1.getText();
                String num2 = textF2.getText();
                try{
                    float n1 = Float.parseFloat(num1);
                    float n2 = Float.parseFloat(num2);
                    
                    textF3.setText(arit.resultado(n1, n2));
                }
                catch(NumberFormatException nfe){
                    System.out.print("No se puede convertir");
                }
            }
        });
        
        button4.addActionListener(new ActionListener(){


            @Override
            public void actionPerformed(ActionEvent arg0) {
                Aritmetica arit = aritmetica.getOperacionA("suma");
                String num1 = textF1.getText();
                String num2 = textF2.getText();
                try{
                    float n1 = Float.parseFloat(num1);
                    float n2 = Float.parseFloat(num2);
                    
                    textF3.setText(arit.resultado(n1, n2));
                }
                catch(NumberFormatException nfe){
                    System.out.print("No se puede convertir");
                }
            }
        });
        
        button5.addActionListener(new ActionListener(){


            @Override
            public void actionPerformed(ActionEvent arg0) {
                Aritmetica arit = aritmetica.getOperacionA("resta");
                String num1 = textF1.getText();
                String num2 = textF2.getText();
                try{
                    float n1 = Float.parseFloat(num1);
                    float n2 = Float.parseFloat(num2);
                    
                    textF3.setText(arit.resultado(n1, n2));
                }
                catch(NumberFormatException nfe){
                    System.out.print("No se puede convertir");
                }
            }
        });
        
        add(textF1);
        add(button2);
        add(button);
        add(textF2);        
        add(button3);
        add(button4);
        add(button5);
        add(textF3); 

        setLayout(null);
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        
    }
}

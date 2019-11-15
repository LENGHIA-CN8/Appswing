package com.nghia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.AttributedCharacterIterator;
import java.util.Scanner;
//import javax.swing.JLabel;

public class App extends JFrame implements ActionListener {
    //private JFrame jframe;
    private JButton Jbutton;
    private JPanel ControlPanel;
    private JLabel label;
    private JTextField text;
    private JButton button1;
    private Graphics g;
    //    private ImageIcon icon=new ImageIcon("Steve.jpg");

    //private JLabel
    public App () {
        label=new JLabel("Click\n vao di");
        ControlPanel=new JPanel();
        Jbutton=new JButton();

        text.setDragEnabled(true);
        Jbutton.setText("button2");
        Jbutton.setSize(10,10);
        Jbutton.setToolTipText("click inside");
        //label.setIcon(icon);
        //label.setText("Hi World");

        text.setSize(10,10);

//        g.setColor(Color.blue);
//        g.fillRect(5,5,10,10);

        //ControlPanel.paintComponents(g);
        ControlPanel.add(Jbutton);
        ControlPanel.add(label);
        ControlPanel.setBackground(Color.red);
        ControlPanel.add(text);
        ControlPanel.add(button1);
        //ControlPanel.paintComponents(g);



        initUI();
        //pack();

        Jbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                //JOptionPane.showMessageDialog(null,"leu leu","mesage",JOptionPane.WARNING_MESSAGE);
                JOptionPane.showConfirmDialog(null,"confirm","confirm dial",JOptionPane.YES_NO_CANCEL_OPTION);
            }
        });
        button1.addActionListener(this);
        Jbutton.addActionListener(this);

    }
    private void initUI(){
       super.setTitle("First app");
       super.add(ControlPanel);
       super.setSize(300,300);
       super.setResizable(false);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main (String[] args) throws FileNotFoundException {
        App app=new App();
        app.setVisible(true);
        File file = new File("/Users/user/Desktop/JavaProject/src/Merge.java");
        Scanner sc= new Scanner(file);
        System.out.println(sc.nextLine());
    }


    @Override
    public void actionPerformed (ActionEvent e) {
          JButton b=(JButton) e.getSource();
          if(b==button1) label.setText("Hello World");
          else if(b==Jbutton) label.setText("Hi World");


    }

//    private void createUIComponents () {
// //TODO: place custom component creation code here
//    }
}

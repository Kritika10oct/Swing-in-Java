package com.company.swingDemo;

import javax.swing.*;
import java.awt.*;

public class FirstGUI {
    public static void main(String[] args) {
        abc obj=new abc();
        obj.setVisible(true);
        obj.setSize(400,400);

    }
}
class abc extends JFrame{
    public abc(){
        setLayout(new FlowLayout());
        JLabel l=new JLabel("Hello I am a Kritika Kumari");
        JLabel l1=new JLabel("Hello I am a Kritika Kumari2");
        add(l);
        add(l1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}

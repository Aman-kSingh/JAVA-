package Bank.Management.System;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    //constructor
    JLabel label1 , label2 , label3;
    JTextField textField2;
    JPasswordField passwordField3;
    JButton Button1,Button2,Button3;
    Login()
    {
        super("Bank Management System");

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icon/bank.png"));
        Image i2= i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,10,100,100);
        add(image);

        ImageIcon ii1=new ImageIcon(ClassLoader.getSystemResource("Icon/card.png"));
        Image ii2= ii1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon ii3=new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(630,350,100,100);
        add(iimage);

        label1=new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvanttGarde" , Font.BOLD,38));
        label1.setBounds(230,125,450,40);
        add(label1);

        label2=new JLabel("Card No");
        label2.setFont(new Font("Ralway" , Font.BOLD,28));
        label2.setForeground(Color.WHITE);
        label2.setBounds(150,190,375,30);
        add(label2);

        textField2=new JTextField(15);
        textField2.setBounds(325,190,230,30);
        textField2.setFont(new Font("Arial",Font.BOLD ,14));
        add(textField2);


        label3=new JLabel("Pin");
        label3.setFont(new Font("Ralway", Font.BOLD ,28));
        label3.setForeground(Color.WHITE);
        label3.setBounds(150,250,375,30);
        add(label3);

        passwordField3=new JPasswordField(15);
        passwordField3.setBounds(325,250,230,30);
        passwordField3.setFont(new Font("Arial",Font.BOLD,14));
        add(passwordField3);

        Button1 = new JButton("SIGN IN");
        Button1.setFont(new Font("Arial", Font.BOLD ,14));
        Button1.setForeground(Color.RED);
        Button1.setBackground(Color.BLACK);
        Button1.setBounds(300,300,100,30);
        Button1.addActionListener(this);
        add(Button1);


        Button2 = new  JButton("CLEAR");
        Button2.setFont(new Font("Arial" , Font.BOLD,14));
        Button2.setForeground(Color.RED);
        Button2.setBackground(Color.BLACK);
        Button2.setBounds(400,300,100,30);
        Button2.addActionListener(this);
        add(Button2);



        Button3=new JButton("SIGN UP");
        Button3.setFont(new Font("Arial",Font.BOLD,14));
        Button3.setForeground(Color.RED);
        Button3.setBackground(Color.BLACK);
        Button3.setBounds(500,300,100,30);
        Button3.addActionListener(this);
        add(Button3);

        ImageIcon iii1=new ImageIcon(ClassLoader.getSystemResource("Icon/backbg.png"));
        Image iii2= iii1.getImage().getScaledInstance(850,480, Image.SCALE_DEFAULT);
        ImageIcon iii3=new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0,0,850,480);
        add(iiimage);


        setLayout(null);
        setSize(850,480);
        setLocation(250,200);    //x-left to right shift ,y -upper to down shift
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == Button1) {

            } else if (e.getSource() == Button2) {
                textField2.setText("");
                passwordField3.setText("");
            } else if (e.getSource() == Button3) {
            }
        }
        catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[]args){
       //created an object
        new Login();
    }
}

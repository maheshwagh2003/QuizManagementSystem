package QuizManagmentSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame implements ActionListener
{
    JButton next , back ;
    JTextField tfname;

    login()
    {
        setSize(1200,600);

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);


        JLabel heading = new JLabel(" * SIMPLE   MINDS *");
        heading.setBounds(400,40,300,50);
        heading.setFont(new Font("Viner Hand ITC" , Font.BOLD , 25));
        heading.setForeground(Color.black);
        add(heading);

        JLabel name = new JLabel("Enter name of your  College ");
        name.setBounds(410,100,400,50);
        name.setFont(new Font("Viner Hand ITC" , Font.BOLD , 25));
        name.setForeground(Color.magenta);
        add(name);

        JTextField tfname = new JTextField();
        tfname.setBounds(410 , 170 ,400 , 30);
        tfname.setFont(new Font("Times New Roman " , Font.BOLD , 20));
        add(tfname);

        next = new JButton("Next");
        next.setBounds(450 , 270 , 120 , 25);
        next.setBackground(Color.getColor("gray",40));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);

        back  = new JButton("Back");
        back.setBounds(650 , 270 , 120 , 25);
        back .setBackground(Color.getColor("gray",40));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);




        setLocation(170 , 100);
        setLayout(null);
        setVisible(true);
    }



    public void actionPerformed(ActionEvent ae ) {
        if (ae.getSource() ==next)
        {
            setVisible(true);
            new addQnsCpp();
        } else if(ae.getSource() == back) {
            setVisible(false);
        }


    }
    public static void main(String[] args)
    {
        new login();

    }
}

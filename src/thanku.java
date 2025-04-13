package QuizManagmentSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class thanku extends JFrame implements ActionListener {
    JButton finish, back;
    JLabel l1 , l2 , l3 ;

    thanku() {
        setSize(1000, 600);
        getContentPane().setBackground(Color.magenta);
        setLayout(null);


        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel(" *Thanks For Putting Trust On Us !!!*");
        heading.setBounds(100,40,660,30);
        heading.setFont(new Font("Tahoma" , Font.ITALIC , 35));
        heading.setForeground(Color.BLACK);
        add(heading);


        l1 = new JLabel("* If You Enjoy !! Then Share..");
        l1.setBounds(80 , 200 , 400 , 30);
        l1.setFont(new Font("Tahoma" , Font.PLAIN , 25));
        l1.setForeground(Color.BLACK);
        add(l1);


        l2 = new JLabel("* And Give Google Review..");
        l2.setBounds(80 , 250 ,400 ,30);
        l2.setFont(new Font("Tahoma" , Font.PLAIN , 25));
        l2.setForeground(Color.BLACK);
        add(l2);


        l3 = new JLabel("* On Our Official Website..");
        l3.setBounds(80 , 300 ,400 ,30);
        l3.setFont(new Font("Tahoma" , Font.PLAIN , 25));
        l3.setForeground(Color.BLACK);
        add(l3);

        back = new JButton("Back");
        back.setBounds(80 , 500 , 100 ,40);
        back.addActionListener(this);
        this.add(back);


        finish = new JButton("finish");
        finish.setBounds(250 , 500 , 100 ,40);
        finish.addActionListener(this);
        this.add(finish);





        setLocation(170 , 100);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae ) {
        if (ae.getSource() ==finish)
        {
            setVisible(true);
            new login();
        }
        if (ae.getSource()== back)
        {
            setVisible(true);
            new result();
        }

    }

    public static void main(String[] args)
    {
        new thanku();
    }
}
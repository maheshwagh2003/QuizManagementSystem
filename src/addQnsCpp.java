package QuizManagmentSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addQnsCpp extends JFrame implements ActionListener {
    JTextField question , a ,b, c ,d , cop , qid;
    JButton add,back , next  ;

    JLabel qns,op1,op2,op3,op4,Cop,Id;

    JFrame frame;
    addQnsCpp(){
        frame=new JFrame();
        setSize(800,900);

        getContentPane().setBackground(Color.cyan);
        setLayout(null);


        qns=new JLabel("Question:");
        qns.setBounds(50,125,70, 30);
        add(qns);

        question = new JTextField();
        question.setBounds(150,50,500,150);
        add(question);

        op1=new JLabel("A:");
        op1.setBounds(100,230, 70,30);
        add(op1);

        a = new JTextField();
        a.setBounds(150,220,200,50);
        add(a);

        op2=new JLabel("B:");
        op2.setBounds(100,310, 70,30);
        add(op2);

        b = new JTextField();
        b.setBounds(150,300,200,50);
        add(b);

        op3=new JLabel("C:");
        op3.setBounds(100,390, 70,30);
        add(op3);

        c = new JTextField();
        c.setBounds(150,380,200,50);
        add(c);

        op4=new JLabel("D:");
        op4.setBounds(100,470, 70,30);
        add(op4);

        d = new JTextField();
        d.setBounds(150,460,200,50);
        add(d);

        Cop=new JLabel("Correct Option:");
        Cop.setBounds(50,550, 130,30);
        add(Cop);

        cop = new JTextField();
        cop.setBounds(150,540,200,50);
        add(cop);

        Id=new JLabel("Question ID:");
        Id.setBounds(50,630, 130,30);
        add(Id);

        qid = new JTextField();
        qid.setBounds(150,620,200,50);
        add(qid);

        add = new JButton("Add ");
        add.setBounds(80,700,150,50);
        add.addActionListener(this);
        add(add);


        back = new JButton("Back ");
        back.setBounds(250,700,150,50);
        back.addActionListener(this);
        add(back);


        next = new JButton("Next ");
        next.setBounds(430,700,150,50);
        next.addActionListener(this);
        add(next);









        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);


    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==add){
            String question = this.question.getText();
            String a = this.a.getText();
            String b = this.b.getText();
            String c = this.c.getText();
            String d = this.d.getText();
            String cop = this.cop.getText();
            String qid = this.qid.getText();

            conn c1 = new conn();


            String str = "insert into questions (qid, qname , a, b, c, d, cop) values ('"+qid+"','"+question+"','"+a+"','"+b+"','"+c+"','"+d+"','"+cop+"');";

            try{
                c1.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null,"Question Added");

                this.question.setText(null);
                this.a.setText(null);
                this.b.setText(null);
                this.c.setText(null);
                this.d.setText(null);
                this.cop.setText(null);
                this.qid.setText(null);


            }
            catch(Exception e){
                System.out.println(e);
            }


        }

        if (ae.getSource()== next)
        {
            new questions();
            this.setVisible(false);
        }
        if(ae.getSource() == back)
        {
            new login();
            this.setVisible(false);
        }


    }

    public static void main(String[] args) {
        new addQnsCpp();
    }
}
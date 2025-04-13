package QuizManagmentSystem;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;


public class questions extends JFrame implements ActionListener {
    JButton back, next, share;
    JTable t1;
    JScrollPane sp1 ;
    JTabbedPane tab;


    questions() {
        setSize(1200, 600);

        getContentPane().setBackground(Color.cyan);
        setLayout(null);


        t1 = new JTable();
        sp1 = new JScrollPane();
        sp1.setViewportView(t1);
        this.add(sp1);

        conn c = new conn();
        try {
            String str1 = "select qname , a, b , c , d  , qid from questions; ";
            ResultSet rs = c.s.executeQuery(str1);
            t1.setModel(DbUtils.resultSetToTableModel(rs));


        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        tab = new JTabbedPane();
        tab.setBounds(100, 60, 500, 40);

        tab = new JTabbedPane();
        tab.setBounds(80, 20, 900, 500);
        tab.add("JAVA , PYTHON , CPP", sp1);
        add(tab);


        back = new JButton("Back");
        back.setBounds(1000, 80, 80, 40);
        back.addActionListener(this);
        add(back);

        next = new JButton("Next");
        next.setBounds(1000, 160, 80, 40);
        next.addActionListener(this);
        add(next);

        share = new JButton("Share");
        share.setBounds(1000, 240, 80, 40);

        add(share);



        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);


    }





    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource() == back)
        {
            new addQnsCpp();
            setVisible(false);
        }

        if (ae.getSource() == next)
        {
           new result();
            setVisible(false);
        }

    }


    public static void main(String[] args)
    {
        new questions();
    }

}

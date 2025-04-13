package QuizManagmentSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class BranchDetails extends JFrame   implements ActionListener {
    JLabel l1, l2, l3, l4, l5, l6, l7, l8;
    JTextField AIML, CS, IOT, DSAI, IT;
    JButton submit , next , back , home;

    JTabbedPane tabs ;

    JScrollPane sp1  , sp2 , sp3 , sp4 , sp5 , sp6 , sp7 , sp8 ,sp9 , sp10 , sp11 , sp12 ,sp13 , sp14 , sp15;

    JTable Total_Stu , Attempt , Not_Attempt ;
    BranchDetails() {
        setSize(800, 800);

        getContentPane().setBackground(Color.cyan);
        setLayout(null);


        sp1 = new JScrollPane();
        sp1.setBounds(100 , 100 , 400 , 80);
        this.add(sp1);

        sp2 = new JScrollPane();
        sp2.setBounds(200 , 100 , 400 , 80);
        this.add(sp2);

        sp3 = new JScrollPane();
        sp3.setBounds(300 , 100 , 400 , 80);
        this.add(sp3);


        Total_Stu = new JTable();
        sp1.setViewportView(Total_Stu);

        Attempt = new JTable();
        sp2.setViewportView(Attempt);

        Not_Attempt= new JTable();
        sp3.setViewportView(Not_Attempt);



        tabs = new JTabbedPane();
        tabs.setBounds(100 , 100 , 400 , 80);

        tabs.add("Total_Stu " ,sp1);
        tabs.add("Attempt ", sp2);
        tabs.add("Not_Attempt " ,sp3);
        add(tabs);

        sp4 = new JScrollPane();
        sp4.setBounds(100 , 200 , 400 , 80);
        this.add(sp4);

        sp5 = new JScrollPane();
        sp5.setBounds(200 , 200 , 400 , 80);
        this.add(sp5);

        sp6 = new JScrollPane();
        sp6.setBounds(300 , 200, 400 , 80);
        this.add(sp6);

        Total_Stu = new JTable();
        sp4.setViewportView(Total_Stu);

        Attempt = new JTable();
        sp5.setViewportView(Attempt);

        Not_Attempt= new JTable();
        sp6.setViewportView(Not_Attempt);

        tabs = new JTabbedPane();
        tabs.setBounds(100 , 200 , 400 , 80);

        tabs.add("Total_Stu " ,sp4);
        tabs.add("Attempt ", sp5);
        tabs.add("Not_Attempt " ,sp6);
        add(tabs);

        sp7 = new JScrollPane();
        sp7.setBounds(100 , 300 , 400 , 80);
        this.add(sp7);

        sp8 = new JScrollPane();
        sp8.setBounds(200 , 300 , 400 , 80);
        this.add(sp8);

        sp9 = new JScrollPane();
        sp9.setBounds(300 , 300, 400 , 80);
        this.add(sp9);

        Total_Stu = new JTable();
        sp7.setViewportView(Total_Stu);

        Attempt = new JTable();
        sp8.setViewportView(Attempt);

        Not_Attempt= new JTable();
        sp9.setViewportView(Not_Attempt);

        tabs = new JTabbedPane();
        tabs.setBounds(100 , 300 , 400 , 80);

        tabs.add("Total_Stu " ,sp7);
        tabs.add("Attempt ", sp8);
        tabs.add("Not_Attempt " ,sp9);
        add(tabs);

        sp10 = new JScrollPane();
        sp10.setBounds(100 , 400 , 400 , 80);
        this.add(sp10);

        sp11= new JScrollPane();
        sp11.setBounds(200 , 400 , 400 , 80);
        this.add(sp11);

        sp12 = new JScrollPane();
        sp12.setBounds(300 , 400, 400 , 80);
        this.add(sp12);

        Total_Stu = new JTable();
        sp10.setViewportView(Total_Stu);

        Attempt = new JTable();
        sp11.setViewportView(Attempt);

        Not_Attempt= new JTable();
        sp12.setViewportView(Not_Attempt);

        tabs = new JTabbedPane();
        tabs.setBounds(100 , 400 , 400 , 80);

        tabs.add("Total_Stu " ,sp10);
        tabs.add("Attempt ", sp11);
        tabs.add("Not_Attempt " ,sp12);
        add(tabs);

        sp13 = new JScrollPane();
        sp13.setBounds(100 , 500 , 400 , 80);
        this.add(sp13);

        sp14= new JScrollPane();
        sp14.setBounds(200 , 500 , 400 , 80);
        this.add(sp14);

        sp15 = new JScrollPane();
        sp15.setBounds(300 , 500, 400 , 80);
        this.add(sp15);

        Total_Stu = new JTable();
        sp13.setViewportView(Total_Stu);

        Attempt = new JTable();
        sp14.setViewportView(Attempt);

        Not_Attempt= new JTable();
        sp15.setViewportView(Not_Attempt);

        tabs = new JTabbedPane();
        tabs.setBounds(100 , 500 , 400 , 80);

        tabs.add("Total_Stu " ,sp13);
        tabs.add("Attempt ", sp14);
        tabs.add("Not_Attempt " ,sp15);
        add(tabs);

        conn c = new conn();



        JLabel heading = new JLabel(" BRANCH DETAILS ");
        heading.setBounds(280,20,300,50);
        heading.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(heading);

        l1 = new JLabel("AIML");
        l1.setBounds(50, 100, 100, 40);
        add(l1);

        l2 = new JLabel("CS");
        l2.setBounds(50, 200, 100, 40);
        add(l2);

        l3 = new JLabel("IOT");
        l3.setBounds(50, 300, 100, 40);
        add(l3);

        l4 = new JLabel("DSAI");
        l4.setBounds(50, 400, 100, 40);
        add(l4);

        l5 = new JLabel("IT");
        l5.setBounds(50, 500, 100, 40);
        add(l5);

        AIML = new JTextField();
        AIML.setBounds(100, 100, 400, 80);
        this.add(AIML);

        CS = new JTextField();
        CS.setBounds(100, 200, 400, 80);
        this.add(CS);

        DSAI = new JTextField();
        DSAI.setBounds(100, 400, 400, 80);
        this.add(DSAI);

        IOT = new JTextField();
        IOT.setBounds(100, 300, 400,80);
        this.add(IOT);

        IT = new JTextField();
        IT.setBounds(100, 500, 400, 80);
        this.add(IT);

        submit = new JButton("submit");
        submit.setBounds(200, 660, 80, 40);
        submit.addActionListener(this);
        this.add(submit);

        next = new JButton("Next");
        next.setBounds(300, 660, 80, 40);
        next.addActionListener(this);
        this.add(next);

        back = new JButton("Back");
        back.setBounds(100, 660, 80, 40);
        back.addActionListener(this);
        this.add(back);








        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);


    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit) {
            String AIML = this.AIML.getText();
            String DSAI = this.DSAI.getText();
            String IOT = this.IOT.getText();
            String IT = this.IT.getText();
            String CS = this.CS.getText();

        }
        if(ae.getSource()==back)
        {
            new addQnsCpp ();
            this.setVisible(false);
        }
        if (ae.getSource()== next)
        {
            new thanku();
            this.setVisible(false);
        }



    }

    public static void main(String[] args)
    {
        new BranchDetails();
    }
}


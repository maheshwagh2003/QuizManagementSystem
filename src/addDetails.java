package QuizManagmentSystem;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addDetails extends JFrame implements ActionListener
{
    JLabel l1, l2, l3, l4 ,l5 , l6, l7 , l8 ;
    JTextField name, branch ,javamarks,javarank,pymarks,pyrank,cppmarks,cpprank;
    JButton submit , next , back , home , share;


    //size variables
    int labX = 60;
    int labH = 50;
    int labW = 100;
    int txtX = 200;
    int txth = 40;
    int txtW = 150;
    addDetails(){
        setSize(500,800);

        JLabel heading = new JLabel(" STUDENT   DETAILS ");
        heading.setBounds(130,0,300,50);
        heading.setFont(new Font("Tahoma", Font.BOLD, 20));
        heading.setForeground(Color.MAGENTA);
        add(heading);


        l1 = new JLabel("Name");
        l1.setBounds(labX,40,labW,labH);
        add(l1);


        l2 = new JLabel("Branch");
        l2.setBounds(labX,100,labW,labH);
        add(l2);


        l3 = new JLabel("Java Marks");
        l3.setBounds(labX,160,labW,labH);
        add(l3);

        l4 = new JLabel("Java Rank");
        l4.setBounds(labX,220,labW,labH);
        add(l4);

        l5 = new JLabel("Py.Marks");
        l5.setBounds(labX,280,labW,labH);
        add(l5);

        l6 = new JLabel("Py.Rank");
        l6.setBounds(labX,340,labW,labH);
        add(l6);

        l7 = new JLabel("Cpp Marks");
        l7.setBounds(labX,400,labW,labH);
        add(l7);

        l8 = new JLabel("Cpp Rank");
        l8.setBounds(labX,460,labW,labH);
        add(l8);

        //textfields
        name = new JTextField();
        name.setBounds(txtX,40,txtW,txth);
        this.add(name);

       branch= new JTextField();
       branch.setBounds(txtX,100,txtW,txth);
        this.add(branch);


       javamarks= new JTextField();
        javamarks.setBounds(txtX,160,txtW,txth);
        this.add(javamarks);

        javarank= new JTextField();
        javarank.setBounds(txtX,220,txtW,txth);
        this.add(javarank);

        pymarks= new JTextField();
        pymarks.setBounds(txtX,280,txtW,txth);
        this.add(pymarks);

        pyrank= new JTextField();
        pyrank.setBounds(txtX,340,txtW,txth);
        this.add(pyrank);

        cppmarks= new JTextField();
        cppmarks.setBounds(txtX,400,txtW,txth);
        this.add(cppmarks);

        cpprank= new JTextField();
        cpprank.setBounds(txtX,460,txtW,txth);
        this.add(cpprank);


        back = new JButton("Back");
        back.setBounds(50 , 540 , 100 ,40);
        back.addActionListener(this);
        this.add(back);


        submit = new JButton("submit");
        submit.setBounds(200 , 540 , 100 ,40);
        submit.addActionListener(this);
        this.add(submit);


        next = new JButton("Next");
        next.setBounds(350 , 540 , 100 ,40);
        next.addActionListener(this);
        this.add(next);

        share = new JButton("Share ");
        share.setBounds(350,700,100,50);
        share.addActionListener(this);
        add(share);






        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == submit)
        {
            String name = this.name.getText();
            String javamarks= this.javamarks.getText();
            String javarank = this.javarank.getText();
            String pymarks = this.pymarks.getText();
            String pyrank = this.pyrank.getText();
            String cppmarks= this.cppmarks.getText();
            String cpprank = this.cpprank.getText();
            String branch = this.branch.getText();




            conn c = new conn();

            String str = "insert into student_ratio (name,javamarks,javarank,pymarks,pyrank,cppmarks,cpprank,branch) values( '"+name+"','"+javamarks+"','"+javarank+"','"+pymarks+"','"+pyrank+"','"+cppmarks+"','"+cpprank+"' ,'"+branch+"');";

            try
            {
                c.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null, "Data Added Successfully!!!");

                this.name.setText(null);
                this.javamarks.setText(null);
                this.javarank.setText(null);
                this.pymarks.setText(null);
                this.pyrank.setText(null);
                this.cppmarks.setText(null);
                this.cpprank.setText(null);
                this.branch.setText(null);

            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
        if (ae.getSource()== next)
        {
            new BranchDetails();
            this.setVisible(false);
        }
        if(ae.getSource() == back)
        {
            new questions();
            this.setVisible(false);
        }
        if (ae.getSource()== home)
        {
            new login();
            this.setVisible(false);
        }
        if(ae.getSource() == share)
        {

            this.setVisible(false);
        }
    }


    public static void main(String[] args)
    {
        new addDetails();
    }
}


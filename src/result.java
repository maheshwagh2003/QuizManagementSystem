package QuizManagmentSystem;

import net.proteanit.sql.DbUtils;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;

public class result extends JFrame implements ActionListener {

    JTable java, python, cpp ;
    JScrollPane sp1, sp2, sp3;
    JButton home , back , next , share;
    JTabbedPane tabs;
    public static String name;
    public static String marks;
    public static String rank;
    public static String branch;
    int row;

    result() {
        setSize(900, 500);

        getContentPane().setBackground(Color.cyan);
        setLayout(null);

        //defining tables;
        java = new JTable();
        sp1 = new JScrollPane();
        sp1.setViewportView(java);

        python = new JTable();
        sp2 = new JScrollPane();
        sp2.setViewportView(python);

        cpp = new JTable();
        sp3 = new JScrollPane();
        sp3.setViewportView(cpp);

        //fetching the data
        //java
        conn c = new conn();

        try {
            String str1 = "select name , javamarks , javarank , branch from student_ratio; ";
            ResultSet rs = c.s.executeQuery(str1);
            java.setModel(DbUtils.resultSetToTableModel(rs));


        } catch (Exception e) {
            System.out.println(e);
        }

        //python
        try {
            String str2 = "select name , pymarks , pyrank , branch from student_ratio;";
            ResultSet rs = c.s.executeQuery(str2);
            python.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            System.out.println(e);
        }

        //c++
        try {
            String str3 = "select name , cppmarks , cpprank , branch from student_ratio;";
            ResultSet rs = c.s.executeQuery(str3);
            cpp.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            System.out.println(e);
        }


        tabs = new JTabbedPane();
        tabs.setBounds(200, 60, 450, 320);

        //adding tabs
        tabs.add("JAVA", sp1);
        tabs.add("PYTHON", sp2);
        tabs.add("C++", sp3);
        add(tabs);

        // buttons
        home = new JButton("Homepage");
        home.setBounds(230, 400, 100, 40);
        home.addActionListener(this);
        add(home);

        back = new JButton("Back");
        back.setBounds(380, 400, 100, 40);
        back.addActionListener(this);
        add(back);

        next= new JButton("Next");
        next.setBounds(530, 400, 100, 40);
        next.addActionListener(this);
        add(next);

        share= new JButton("Share");
        share.setBounds(700, 400, 100, 40);
        share.addActionListener(this);
        add(share);











        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    void javaSelect() {
        java.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                row = java.getSelectedRow();
                name = java.getModel().getValueAt(row, 0).toString();
                marks = java.getModel().getValueAt(row, 9).toString();
                rank = java.getModel().getValueAt(row, 10).toString();
                branch = java.getModel().getValueAt(row, 11).toString();
            }

        });
    }

    void pythonSelect() {
        python.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                row = python.getSelectedRow();
                name = python.getModel().getValueAt(row, 0).toString();
                marks = python.getModel().getValueAt(row, 13).toString();
                rank = python.getModel().getValueAt(row, 14).toString();
                branch = java.getModel().getValueAt(row, 15).toString();
            }
        });
    }

    void cppSelect() {
        cpp.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                row = cpp.getSelectedRow();
                name = cpp.getModel().getValueAt(row, 0).toString();
                marks = cpp.getModel().getValueAt(row, 11).toString();
                rank = cpp.getModel().getValueAt(row, 12).toString();
                branch = java.getModel().getValueAt(row, 13).toString();
            }

        });
    }



    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == back)
        {
            new addDetails();
            setVisible(false);
        }
        if (ae.getSource() == home)
        {
            new login();
            setVisible(false);
        }
        if (ae.getSource() == next)
        {
            new addDetails();
            setVisible(false);
        }

    }

    public static void main (String[]args){
        new result();
    }

}

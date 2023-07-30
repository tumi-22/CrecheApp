/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author hp
 */
public class CrecheGUI extends JFrame{
    private JLabel headingLbl;
    private JLabel nameLbl;
    private JTextField nameTxtF;
    private JLabel surnameLbl;
    private JTextField surnameTxtF;
    private JLabel studNumLbl;
    private JTextField studNumTxtF;
    private JLabel genderLbl;
    private JRadioButton male;
    private JRadioButton female;
    private JTextArea moreInfo;
    private LineBorder lblInfo;
    private TitledBorder titleBorder;
    private JScrollPane scrolls;
    private JButton restart;
    private JButton apply;
    //PANELS
    private JPanel headingPnl;
    private JPanel namePnl;
    private JPanel surnamePnl;
    private JPanel studNumPnl;
    private JPanel genderPnl;
    private JPanel txtAreaPnl;
    private JPanel buttonsPnl;
    private JPanel nameANDHeadingPnl;
    private JPanel mainPnl;
    
    
    ArrayList<UserDetails> user=new ArrayList<UserDetails>();
    public CrecheGUI(){
        setTitle("CHRECHE APPLICATIONS");
        setSize(350,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        headingLbl=new JLabel("Applcation For Bursary");
        nameLbl=new JLabel("Name: ");
        nameTxtF=new JTextField(10);
        surnameLbl=new JLabel("Surname: ");
        surnameTxtF=new JTextField(10);
        studNumLbl=new JLabel("Student no: ");
        studNumTxtF=new JTextField(10);
        genderLbl=new JLabel("Gender: ");
        male=new JRadioButton("Male");
        female=new JRadioButton("Female");
        moreInfo=new JTextArea(5,20);
        lblInfo=new LineBorder(Color.BLACK,1);
        titleBorder=new TitledBorder(lblInfo,"Tell us about yourself");
        moreInfo.setBorder(titleBorder);
        scrolls=new JScrollPane(moreInfo);
        scrolls.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrolls.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        restart=new JButton("RESTART");
        apply=new JButton("APPLY");
        
        headingPnl=new JPanel(new FlowLayout(FlowLayout.CENTER));
        headingPnl.add(headingLbl);
        namePnl=new JPanel(new FlowLayout(FlowLayout.LEFT));
        namePnl.add(nameLbl);
        namePnl.add(nameTxtF);
        surnamePnl=new JPanel(new FlowLayout(FlowLayout.LEFT));
        surnamePnl.add(surnameLbl);
        surnamePnl.add(surnameTxtF);
        studNumPnl=new JPanel(new FlowLayout(FlowLayout.LEFT));
        studNumPnl.add(studNumLbl);
        studNumPnl.add(studNumTxtF);
        genderPnl=new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderPnl.add(male);
        genderPnl.add(female);
        txtAreaPnl=new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtAreaPnl.add(namePnl);
        txtAreaPnl.add(surnamePnl);
        txtAreaPnl.add(studNumPnl);
        txtAreaPnl.add(genderPnl);
        txtAreaPnl.add(scrolls);
        buttonsPnl=new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonsPnl.add(restart);
        buttonsPnl.add(apply);
        mainPnl=new JPanel(new BorderLayout());
        mainPnl.add(headingPnl,BorderLayout.NORTH);
        mainPnl.add(txtAreaPnl,BorderLayout.CENTER);
        mainPnl.add(buttonsPnl,BorderLayout.SOUTH);
        
        restart.addActionListener(new RestartListener());
        apply.addActionListener(new RestartListener());
        
        setResizable(false);
        add(mainPnl);
    
    }

    private class RestartListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source=e.getSource();
        if(source==restart){
            nameTxtF.setText(" ");
            surnameTxtF.setText("");
            studNumTxtF.setText(" ");
            male.setSelected(false);
            female.setSelected(false);
            moreInfo.setText("");
        }else{
               
                if(male.isSelected()){
                    String name=nameTxtF.getText();
                    String surname=surnameTxtF.getText();
                    String studNum=studNumTxtF.getText();
                    String selGender="Male";
                    String moreInfoBox=moreInfo.getText();
                    UserDetails usd=new UserDetails(name,surname,studNum,selGender,moreInfoBox);
                    user.add(usd);
                    JOptionPane.showMessageDialog(rootPane,usd.toString()+"\n Has been successfully submitted");
                }else{
                    String name=nameTxtF.getText();
                    String surname=surnameTxtF.getText();
                    String studNum=studNumTxtF.getText();
                    String selGender="Female";
                    String moreInfoBox=moreInfo.getText();
                    UserDetails usd=new UserDetails(name,surname,studNum,selGender,moreInfoBox);
                    user.add(usd);
                    JOptionPane.showMessageDialog(rootPane,usd.toString()+"\n Has been successfully submitted");
                }
                
               
        }

    }
    
    
    
}

    
}


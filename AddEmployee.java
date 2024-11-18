package com.EMS.EmployeeManagementSystem;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

import com.toedter.calendar.JDateChooser;
import java.util.*;


public class AddEmployee extends JFrame implements ActionListener{
	
    	JTextField tfname, tffname, tfnumber, tfemail, tfaadhar, tfsalary, tfdesignation, tfdeptname, tfaddress, tfstate, tfpin;
    	JDateChooser dcdob, dcdoj;
    	JComboBox cbeducation;
    	JLabel lblempId;
    	JButton add, back;
	
	Random ran = new Random();
	int number = ran.nextInt(999999);

	AddEmployee() {
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon("Images/EMS_add.jpg");
		Image i2 = i1.getImage().getScaledInstance(1278, 680, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0, 0, 1278, 680);
		add(image);
		
		JLabel heading = new JLabel("Add Employee Details");
		heading.setBounds(440, 30, 500, 50);
		heading.setFont(new Font("serif", Font.ITALIC, 25));
		heading.setForeground(Color.BLACK);
		image.add(heading);
		
		
		JLabel labelempId = new JLabel("Employee id");
	        labelempId.setBounds(100, 150, 150, 30);
	        labelempId.setFont(new Font("serif", Font.PLAIN, 20));
	        labelempId.setForeground(Color.BLACK);
	        image.add(labelempId);
	        
	        lblempId = new JLabel("" + number);
	        lblempId.setBounds(250, 150, 150, 30);
	        lblempId.setFont(new Font("serif", Font.PLAIN, 20));
	        lblempId.setForeground(Color.BLACK);
	        image.add(lblempId);
		
		
		JLabel labelname = new JLabel("Name");
		labelname.setBounds(100, 200, 150, 30);
		labelname.setFont(new Font("serif", Font.PLAIN, 20));
		labelname.setForeground(Color.BLACK);
		image.add(labelname);
		
		tfname = new JTextField();
		tfname.setBounds(250, 200, 150, 30);
		image.add(tfname);
		
		
		JLabel labelfname = new JLabel("Father's Name");
		labelfname.setBounds(600, 200, 150, 30);
		labelfname.setFont(new Font("serif", Font.PLAIN, 20));
		labelfname.setForeground(Color.BLACK);
		labelfname.setBackground(Color.WHITE);
		image.add(labelfname);
		
		tffname = new JTextField();
		tffname.setBounds(750, 200, 150, 30);
		image.add(tffname);
		
		
		JLabel labeldob = new JLabel("Date of Birth");
		labeldob.setBounds(100, 250, 150, 30);
		labeldob.setFont(new Font("serif", Font.PLAIN, 20));
		labeldob.setForeground(Color.BLACK);
		image.add(labeldob);
		
		dcdob = new JDateChooser();
		dcdob.setDateFormatString("yyyy-MM-dd");
		dcdob .setBounds(250, 250, 150, 30);
		image.add(dcdob);
		
		
		JLabel labelnumber = new JLabel("Contact Number");
		labelnumber.setBounds(600, 250, 150, 30);
		labelnumber.setFont(new Font("serif", Font.PLAIN, 20));
		labelnumber.setForeground(Color.BLACK);
		image.add(labelnumber);
		
		tfnumber = new JTextField();
		tfnumber.setBounds(750, 250, 150, 30);
		image.add(tfnumber);
		
		
		JLabel labelemail = new JLabel("Email");
		labelemail.setBounds(100, 300, 150, 30);
		labelemail.setFont(new Font("serif", Font.PLAIN, 20));
		labelemail.setForeground(Color.BLACK);
		image.add(labelemail);
        
	        tfemail = new JTextField();
	        tfemail.setBounds(250, 300, 150, 30);
	        image.add(tfemail);
	        
	        
	        JLabel labeldesignation = new JLabel("Designation");
	        labeldesignation.setBounds(600, 300, 150, 30);
	        labeldesignation.setFont(new Font("serif", Font.PLAIN, 20));
	        labeldesignation.setForeground(Color.BLACK);
	        image.add(labeldesignation);
	        
	        tfdesignation = new JTextField();
	        tfdesignation.setBounds(750, 300, 150, 30);
	        image.add(tfdesignation);
	        
	        
	        JLabel labeleducation = new JLabel("Highest Education");
	        labeleducation.setBounds(100, 350, 150, 30);
	        labeleducation.setFont(new Font("serif", Font.PLAIN, 20));
	        labeleducation.setForeground(Color.BLACK);
	        image.add(labeleducation);
	        
	        String courses[] = {"BBA", "BCA", "BA", "BSC", "B.COM", "B.Tech", "MBA", "MCA", "MA","M.Tech", "MSC", "PHD"};
		cbeducation = new JComboBox(courses);
		cbeducation.setBackground(Color.WHITE);
		cbeducation.setBounds(250, 350, 150, 30);
		image.add(cbeducation);
        
        
	        JLabel labeljoin = new JLabel("Date of Joining");
	        labeljoin.setBounds(600, 350, 150, 30);
	        labeljoin.setFont(new Font("serif", Font.PLAIN, 20));
	        labeljoin.setForeground(Color.BLACK);
	        image.add(labeljoin);
	        
	        dcdoj = new JDateChooser();
	        dcdoj.setDateFormatString("yyyy-MM-dd");
	        dcdoj.setBounds(750, 350, 150, 30);
	        image.add(dcdoj);
	        
	        
	        JLabel labelsalary = new JLabel("Salary");
	        labelsalary.setBounds(100, 400, 150, 30);
	        labelsalary.setFont(new Font("serif", Font.PLAIN, 20));
	        labelsalary.setForeground(Color.BLACK);
	        image.add(labelsalary);
	        
	        tfsalary = new JTextField();
	        tfsalary.setBounds(250, 400, 150, 30);
	        image.add(tfsalary);
	        
	        
	        JLabel labelaadhar = new JLabel("Aadhar Number");
	        labelaadhar.setBounds(600, 400, 150, 30);
	        labelaadhar.setFont(new Font("serif", Font.PLAIN, 20));
	        labelaadhar.setForeground(Color.BLACK);
	        image.add(labelaadhar);
	        
	        tfaadhar = new JTextField();
	        tfaadhar.setBounds(750, 400, 150, 30);
	        image.add(tfaadhar);
	       
	        
	        
	        JLabel labeldeptId = new JLabel("Department Name");
	        labeldeptId.setBounds(100, 450, 150, 30);
	        labeldeptId.setFont(new Font("serif", Font.PLAIN, 20));
	        labeldeptId.setForeground(Color.BLACK);
	        image.add(labeldeptId);
	        
	        tfdeptname = new JTextField();
	        tfdeptname.setBounds(250, 450, 150, 30);
	        image.add(tfdeptname);
	        
	        
	        
	        JLabel labeldeptname = new JLabel("Address");
	        labeldeptname.setBounds(600, 450, 150, 30);
	        labeldeptname.setFont(new Font("serif", Font.PLAIN, 20));
	        labeldeptname.setForeground(Color.BLACK);
	        image.add(labeldeptname);
	        
	        tfaddress = new JTextField();
	        tfaddress.setBounds(750, 450, 150, 30);
	        image.add(tfaddress);
	        
	        
	        
	        JLabel labelstate = new JLabel("State");
	        labelstate.setBounds(100, 500, 150, 30);
	        labelstate.setFont(new Font("serif", Font.PLAIN, 20));
	        labelstate.setForeground(Color.BLACK);
	        image.add(labelstate);
	        
	        tfstate = new JTextField();
	        tfstate.setBounds(250, 500, 150, 30);
	        image.add(tfstate);
	        
	        
	        JLabel labelpin = new JLabel("Pin Code");
	        labelpin.setBounds(600, 500, 150, 30);
	        labelpin.setFont(new Font("serif", Font.PLAIN, 20));
	        labelpin.setForeground(Color.BLACK);
	        image.add(labelpin);
	        
	        tfpin = new JTextField();
	        tfpin.setBounds(750, 500, 150, 30);
	        image.add(tfpin);
	        
	        
	        
	        add = new JButton("Add Details");
	        add.setBounds(350, 550, 150, 40);
	        add.addActionListener(this);
	        add.setBackground(Color.BLACK);
	        add.setForeground(Color.WHITE);
	        image.add(add);
	        
	        back = new JButton("Back");
	        back.setBounds(550, 550, 150, 40);
	        back.addActionListener(this);
	        back.setBackground(Color.BLACK);
	        back.setForeground(Color.WHITE);
	        image.add(back);
			
	        setSize(1120, 650);
		setLocation(60, 20);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == add) {
		        String empId = lblempId.getText();
			String name = tfname.getText();
			String fname = tffname.getText();
			String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
			String number = tfnumber.getText();
		        String email = tfemail.getText();
		        String designation = tfdesignation.getText();
		        String education = (String) cbeducation.getSelectedItem();
		        String doj = ((JTextField) dcdoj.getDateEditor().getUiComponent()).getText();
		        String salary = tfsalary.getText();
		        String aadhar = tfaadhar.getText();
		        String deptname = tfdeptname.getText();
			String address = tfaddress.getText();
			String state = tfstate.getText();
			String pin = tfpin.getText();
            
		        try {
		            DatabaseConnection con = new DatabaseConnection();
		            String query = "INSERT INTO employees VALUES('"+empId+"','"+name+"', '"+fname+"', '"+dob+"', '"+number+"', '"+email+"', '"+designation+"', '"+education+"', '"+doj+"', '"+salary+"', '"+aadhar+"', '"+deptname+"', '"+address+"', '"+state+"', '"+pin+"')";
		            con.stm.executeUpdate(query);
		            JOptionPane.showMessageDialog(null, "Details added successfully!");
		            setVisible(false);
		            new Home();
		        }
		        catch(Exception e) {
		            e.printStackTrace();
		        }
		}
		else {
			setVisible(false);
			new Home();
		}
	}

	public static void main(String[] args) {
		new AddEmployee();
	}

}

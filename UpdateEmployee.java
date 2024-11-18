package com.EMS.EmployeeManagementSystem;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;


public class UpdateEmployee extends JFrame implements ActionListener{
	
	JTextField tfname, tffname, tfnumber, tfemail, tfaadhar, tfsalary, tfdesignation, tfeducation, tfdeptname, tfaddress, tfstate, tfpin;
	JLabel lblempId;
	JButton add, back;
	String empId;

	UpdateEmployee(String empId) {
		this.empId = empId;
		
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel heading = new JLabel("Update Employee Details");
		heading.setBounds(400, 30, 500, 50);
		heading.setFont(new Font("Raleway", Font.BOLD, 25));
		heading.setForeground(Color.DARK_GRAY);
		add(heading);
		
		
		JLabel labelempId = new JLabel("Employee id");
	        labelempId.setBounds(100, 150, 150, 30);
	        labelempId.setFont(new Font("serif", Font.PLAIN, 20));
	        add(labelempId);
	        
	        lblempId = new JLabel();
	        lblempId.setBounds(250, 150, 150, 30);
	        lblempId.setFont(new Font("serif", Font.PLAIN, 20));
	        add(lblempId);
		
		
		JLabel labelname = new JLabel("Name");
		labelname.setBounds(100, 200, 150, 30);
		labelname.setFont(new Font("serif", Font.PLAIN, 20));
		add(labelname);
		
		JLabel lblname = new JLabel();
		lblname.setBounds(250, 200, 150, 30);
		add(lblname);
		
		
		JLabel labelfname = new JLabel("Father's Name");
		labelfname.setBounds(600, 200, 150, 30);
		labelfname.setFont(new Font("serif", Font.PLAIN, 20));
		add(labelfname);
		
		tffname = new JTextField();
		tffname.setBounds(750, 200, 150, 30);
		add(tffname);
		
		
		JLabel labeldob = new JLabel("Date of Birth");
		labeldob.setBounds(100, 250, 150, 30);
		labeldob.setFont(new Font("serif", Font.PLAIN, 20));
		add(labeldob);
		
		JLabel lbldob = new JLabel();
		lbldob.setBounds(250, 250, 150, 30);
		add(lbldob);
		
		
		JLabel labelnumber = new JLabel("Contact Number");
		labelnumber.setBounds(600, 250, 150, 30);
		labelnumber.setFont(new Font("serif", Font.PLAIN, 20));
		add(labelnumber);
		
		tfnumber = new JTextField();
		tfnumber.setBounds(750, 250, 150, 30);
		add(tfnumber);
		
		
		JLabel labelemail = new JLabel("Email");
		labelemail.setBounds(100, 300, 150, 30);
		labelemail.setFont(new Font("serif", Font.PLAIN, 20));
        	add(labelemail);
        
	        tfemail = new JTextField();
	        tfemail.setBounds(250, 300, 150, 30);
	        add(tfemail);
	        
	        
	        JLabel labeldesignation = new JLabel("Designation");
	        labeldesignation.setBounds(600, 300, 150, 30);
	        labeldesignation.setFont(new Font("serif", Font.PLAIN, 20));
	        add(labeldesignation);
	        
	        tfdesignation = new JTextField();
	        tfdesignation.setBounds(750, 300, 150, 30);
	        add(tfdesignation);
	        
	        
	        JLabel labeleducation = new JLabel("Highest Education");
	        labeleducation.setBounds(100, 350, 150, 30);
	        labeleducation.setFont(new Font("serif", Font.PLAIN, 20));
	        add(labeleducation);
	        
	        tfeducation = new JTextField();
	        tfeducation.setBounds(250, 350, 150, 30);
	        add(tfeducation);
	        
	        
	        JLabel labeljoin = new JLabel("Date of Joining");
	        labeljoin.setBounds(600, 350, 150, 30);
	        labeljoin.setFont(new Font("serif", Font.PLAIN, 20));
	        add(labeljoin);
        
		JLabel lbldoj = new JLabel();
		lbldoj.setBounds(750, 350, 150, 30);
        	add(lbldoj);
        
        
	        JLabel labelsalary = new JLabel("Salary");
	        labelsalary.setBounds(100, 400, 150, 30);
	        labelsalary.setFont(new Font("serif", Font.PLAIN, 20));
	        add(labelsalary);
	        
	        tfsalary = new JTextField();
	        tfsalary.setBounds(250, 400, 150, 30);
	        add(tfsalary);
	        
	        
	        JLabel labelaadhar = new JLabel("Aadhar Number");
	        labelaadhar.setBounds(600, 400, 150, 30);
	        labelaadhar.setFont(new Font("serif", Font.PLAIN, 20));
	        add(labelaadhar);
	        
	        JLabel lblaadhar = new JLabel();
	        lblaadhar.setBounds(750, 400, 150, 30);
	        add(lblaadhar);
	       
	        
	        
	        JLabel labeldeptId = new JLabel("Department Name");
	        labeldeptId.setBounds(100, 450, 150, 30);
	        labeldeptId.setFont(new Font("serif", Font.PLAIN, 20));
	        add(labeldeptId);
	        
	        tfdeptname = new JTextField();
	        tfdeptname.setBounds(250, 450, 150, 30);
	        add(tfdeptname);
	        
	        
	        
	        JLabel labeldeptname = new JLabel("Address");
	        labeldeptname.setBounds(600, 450, 150, 30);
	        labeldeptname.setFont(new Font("serif", Font.PLAIN, 20));
	        add(labeldeptname);
	        
	        tfaddress = new JTextField();
	        tfaddress.setBounds(750, 450, 150, 30);
	        add(tfaddress);
	        
	        
	        
	        JLabel labelstate = new JLabel("State");
	        labelstate.setBounds(100, 500, 150, 30);
	        labelstate.setFont(new Font("serif", Font.PLAIN, 20));
	        add(labelstate);
	        
	        tfstate = new JTextField();
	        tfstate.setBounds(250, 500, 150, 30);
	        add(tfstate);
        
        
	        JLabel labelpin = new JLabel("Pin Code");
	        labelpin.setBounds(600, 500, 150, 30);
	        labelpin.setFont(new Font("serif", Font.PLAIN, 20));
	        add(labelpin);
	        
	        tfpin = new JTextField();
	        tfpin.setBounds(750, 500, 150, 30);
	        add(tfpin);
	        
	        try {
	        	DatabaseConnection con = new DatabaseConnection();
	        	String query = "SELECT * FROM employees where empId = '"+empId+"'";
	        	ResultSet rs = con.stm.executeQuery(query);
	        	
	        	while(rs.next()) {
	        		
	        		lblempId.setText(rs.getString("empId"));
	        		lblname.setText(rs.getString("name"));
	        		tffname.setText(rs.getString("fathers_name"));
	        		lbldob.setText(rs.getString("dob"));
	        		tfnumber.setText(rs.getString("contact_number"));
	        		tfemail.setText(rs.getString("email"));
	        		tfdesignation.setText(rs.getString("designation"));
	        		tfeducation.setText(rs.getString("highest_education"));
	        		lbldoj.setText(rs.getString("date_of_join"));
	        		tfsalary.setText(rs.getString("salary"));
	        		lblaadhar.setText(rs.getString("aadhar"));
	        		tfdeptname.setText(rs.getString("department"));
	        		tfaddress.setText(rs.getString("address"));
	        		tfstate.setText(rs.getString("state"));
	        		tfpin.setText(rs.getString("pin"));
	
	        	}
	        	
	        }
	        catch(Exception e) {
	        	e.printStackTrace();
	        }
	        
	        
	        add = new JButton("Update Details");
	        add.setBounds(350, 550, 150, 40);
	        add.addActionListener(this);
	        add.setBackground(Color.BLACK);
	        add.setForeground(Color.WHITE);
	        add(add);
	        
	        back = new JButton("Back");
	        back.setBounds(550, 550, 150, 40);
	        back.addActionListener(this);
	        back.setBackground(Color.BLACK);
	        back.setForeground(Color.WHITE);
	        add(back);
			
	        setSize(1120, 650);
		setLocation(60, 20);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == add) {
			String fname = tffname.getText();
			String number = tfnumber.getText();
            String email = tfemail.getText();
            String designation = tfdesignation.getText();
            String education = tfeducation.getText();
            String salary = tfsalary.getText();
            String deptname = tfdeptname.getText();
			String address = tfaddress.getText();
			String state = tfstate.getText();
			String pin = tfpin.getText();
            
            try {
            	DatabaseConnection con = new DatabaseConnection();
            	String query = "UPDATE employees SET fathers_name ='"+fname+"', contact_number ='"+number+"', email='"+email+"', designation='"+designation+"', highest_education='"+education+"', salary='"+salary+"', department='"+deptname+"', address='"+address+"', state='"+state+"', pin='"+pin+"' WHERE empId='"+empId+"'";
            	con.stm.executeUpdate(query);
            	JOptionPane.showMessageDialog(null, "Details updated successfully!");
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
		new UpdateEmployee("");
	}

}

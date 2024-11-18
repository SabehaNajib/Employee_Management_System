package com.EMS.EmployeeManagementSystem;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class ViewEmployee extends JFrame implements ActionListener{
	
	JTable table;
	Choice cemployeeId;
	JButton search, print, update, back;

	ViewEmployee() {
		
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		
		JLabel searchlbl = new JLabel("Search by Employee id");
		searchlbl.setBounds(20, 20, 150, 20);
		add(searchlbl);
		
		cemployeeId = new Choice();
		cemployeeId.setBounds(180, 20, 150, 20);
		add(cemployeeId);
		
		
		search = new JButton("Search");
	        search.setBounds(20, 70, 80, 20);
	        search.addActionListener(this);
	        add(search);
		
		print = new JButton("Print");
		print.setBounds(120, 70, 80, 20);
		print.addActionListener(this);
		add(print);
		        
		update = new JButton("Update");
		update.setBounds(220, 70, 80, 20);
		update.addActionListener(this);
		add(update);
		        
		back = new JButton("Back");
		back.setBounds(320, 70, 80, 20);
		back.addActionListener(this);
		add(back);
		
		table = new JTable();
		
		try {
			DatabaseConnection con = new DatabaseConnection();
			ResultSet rs = con.stm.executeQuery("SELECT * FROM employees");
			
			while(rs.next()) {
				cemployeeId.add(rs.getString("empId"));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			DatabaseConnection con = new DatabaseConnection();
			ResultSet rs = con.stm.executeQuery("SELECT * FROM employees");
			table.setModel(DbUtils.resultSetToTableModel(rs));
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		JScrollPane jsp = new JScrollPane(table);
		jsp.setBounds(2, 100, 1278, 650);
		add(jsp);
		
		setSize(1120, 650);
		setLocation(60, 20);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == search) {
			String query = "SELECT * FROM employees WHERE empId =  '"+cemployeeId.getSelectedItem()+"'";
			try {
				DatabaseConnection con = new DatabaseConnection();
				ResultSet rs = con.stm.executeQuery(query);
				table.setModel(DbUtils.resultSetToTableModel(rs));
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		else if(ae.getSource() == print) {
			try {
				table.print();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		else if(ae.getSource() == update) {
			setVisible(false);
			new UpdateEmployee(cemployeeId.getSelectedItem());
		}
		else{
			setVisible(false);
			new Home();
		}
	}

	public static void main(String[] args) {
		new ViewEmployee();
	}

}

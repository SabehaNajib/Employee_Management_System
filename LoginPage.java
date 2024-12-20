package com.EMS.EmployeeManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class LoginPage extends JFrame implements ActionListener
{
	JFrame f;
	JLabel l1, l2;
	JTextField t1;
	JPasswordField t2;
	JButton b1, b2;
	
	LoginPage()
	{
		f = new JFrame("Login");
		
		f.setBackground(Color.WHITE);
		f.setLayout(null);
		
		l1 = new JLabel("UserName");
		l1.setBounds(40,20,100,30);
		f.add(l1);
		
		l2 = new JLabel("Password");
		l2.setBounds(40,70,100,30);
		f.add(l2);
		
		t1 = new JTextField();
		t1.setBounds(150,20,150,30);
		f.add(t1);
		
		t2 = new JPasswordField();
		t2.setBounds(150,70,150,30);
		f.add(t2);
		
		ImageIcon i1 = new ImageIcon("Images/EMS1.png");
		Image i2 = i1.getImage().getScaledInstance(150,140,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel l3 = new JLabel(i3);
		l3.setBounds(350, 20, 150, 150);
		f.add(l3);
		
		b1 = new JButton("Login");
		b1.setBackground(Color.BLACK);
		b1.setBounds(40, 140, 120, 30);
		b1.addActionListener(this);
		b1.setForeground(Color.WHITE);
		f.add(b1);
		
		b2 = new JButton("Close");
		b2.setBackground(Color.BLACK);
		b2.setBounds(180, 140, 120, 30);
		b2.addActionListener(this);
		b2.setForeground(Color.WHITE);
		f.add(b2);
		
		f.getContentPane();
		
		f.setVisible(true);
		f.setSize(550, 260);
		f.setLocation(400, 200);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == b1)
		{
			try
			{
				DatabaseConnection obj = new DatabaseConnection();
				String username = t1.getText();
				String password = t2.getText();
				String query = "select * from logindata where username ='"+username+"'and password = '"+password+"'";
				ResultSet rs = obj.stm.executeQuery(query);
				
				if(rs.next()) 
				{
					System.out.println("Run");
					this.f.setVisible(false);
					new Home();

				}
				else
				{
					JOptionPane.showMessageDialog(null, "Invalid Username or Password ! ");
					f.setVisible(false);
					f.setVisible(true);
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		if(ae.getSource() == b2)
		{
			this.f.setVisible(false);
		}
	}
	
	public static void main(String[] args)
	{
		new LoginPage();
	}

}

package com.EMS.EmployeeManagementSystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener {
	
	Dashboard(){
		
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
		heading.setBounds(150, 30, 1800, 60);
		heading.setFont(new Font("serif",Font.PLAIN, 50));
		heading.setForeground(Color.DARK_GRAY);
		add(heading);
		
		ImageIcon i1 = new ImageIcon("Images/EMS5.png");
		Image i2 = i1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(50, 100, 1050, 500);
		add(image);
		
		JButton clickhere = new JButton("CLICK HERE TO CONTINUE");
		clickhere.setBounds(400, 400, 300, 60);
		clickhere.setBackground(Color.BLACK);
		clickhere.setForeground(Color.WHITE);
		clickhere.addActionListener(this);
		image.add(clickhere);
		
		
		setSize(1170, 650);
		setLocation(60, 20);
		setVisible(true);
		
		while(true) {
			heading.setVisible(false);
			try {
				Thread.sleep(550);
			}
			catch(Exception e) {
				
			}
			
			heading.setVisible(true);
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				
			}
		}
	}
	
	public void actionPerformed(ActionEvent ae) {
		setVisible(false);
		new LoginPage();
	}
	
  public static void main(String[] args) {
	  new Dashboard();
	  
  }
}

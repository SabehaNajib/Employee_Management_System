package com.EMS.EmployeeManagementSystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;

public class SalarySlipGenerator extends JFrame implements ActionListener {
    JTextField tfEmpId, tfEmpName, tfBasicSalary, tfHRA, tfDA, tfDeductions;
    JTextArea taSalarySlip;
    JButton btnGenerate, btnClear, btnBack, btnPrint;
    Choice cEmpId;
    JLabel lblname;

    SalarySlipGenerator() {
        setTitle("Salary Slip Generator");
        setSize(690, 600);
        setLocation(300,30);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblTitle = new JLabel("Salary Slip Generator");
        lblTitle.setFont(new Font("Serif", Font.BOLD, 20));
        lblTitle.setBounds(220, 10, 300, 30);
        add(lblTitle);

        JLabel labelempId = new JLabel("Employee id");
		labelempId.setBounds(50, 50, 100, 30);
		add(labelempId);
		
		cEmpId = new Choice();
		cEmpId.setBounds(200, 50, 150, 30);
		add(cEmpId);
		
		try {
			DatabaseConnection con = new DatabaseConnection();
			String query = "SELECT * FROM employees";
			ResultSet rs = con.stm.executeQuery(query);
			
			while(rs.next()) {
				cEmpId.add(rs.getString("empId"));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		JLabel labelname = new JLabel("Name");
        labelname.setBounds(50, 100, 100, 30);
        add(labelname);
        
        lblname = new JLabel();
        lblname.setBounds(200, 100, 100, 30);
        add(lblname);
        
        
        cEmpId.addItemListener(new ItemListener() {
        	public void itemStateChanged(ItemEvent ie) {
        		try {
        			DatabaseConnection con = new DatabaseConnection();
        			String query = "SELECT * FROM employees WHERE empId = '"+cEmpId.getSelectedItem()+"'";
        			ResultSet rs = con.stm.executeQuery(query);
        			
        			while(rs.next()) {
        				lblname.setText(rs.getString("name"));
                        
        			}
        		}
        		catch(Exception e) {
        			e.printStackTrace();
        		}
        	}
        });
        

        JLabel lblBasicSalary = new JLabel("Basic Salary:");
        lblBasicSalary.setBounds(50, 160, 150, 30);
        add(lblBasicSalary);

        tfBasicSalary = new JTextField();
        tfBasicSalary.setBounds(200, 160, 200, 30);
        add(tfBasicSalary);

        JLabel lblHRA = new JLabel("HRA:");
        lblHRA.setBounds(50, 210, 150, 30);
        add(lblHRA);

        tfHRA = new JTextField();
        tfHRA.setBounds(200, 210, 200, 30);
        add(tfHRA);

        JLabel lblDA = new JLabel("DA:");
        lblDA.setBounds(50, 260, 150, 30);
        add(lblDA);

        tfDA = new JTextField();
        tfDA.setBounds(200, 260, 200, 30);
        add(tfDA);

        JLabel lblDeductions = new JLabel("Deductions:");
        lblDeductions.setBounds(50, 310, 150, 30);
        add(lblDeductions);

        tfDeductions = new JTextField();
        tfDeductions.setBounds(200, 310, 200, 30);
        add(tfDeductions);

        btnGenerate = new JButton("Generate");
        btnGenerate.setBounds(50, 360, 120, 30);
        btnGenerate.addActionListener(this);
        add(btnGenerate);

        btnClear = new JButton("Clear");
        btnClear.setBounds(200, 360, 120, 30);
        btnClear.addActionListener(this);
        add(btnClear);
        
        btnPrint = new JButton("Print Slip");
        btnPrint.setBounds(350, 360, 120, 30);
        btnPrint.addActionListener(this);
        add(btnPrint);
        
        btnBack = new JButton("Back");
        btnBack.setBounds(500, 360, 120, 30);
        btnBack.addActionListener(this);
        add(btnBack);

        taSalarySlip = new JTextArea();
        taSalarySlip.setBounds(50, 410, 400, 130);
        taSalarySlip.setEditable(false);
        add(taSalarySlip);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnGenerate) {
            try {
                String empId = cEmpId.getSelectedItem();
                String empName = lblname.getText();
                double basicSalary = Double.parseDouble(tfBasicSalary.getText());
                double hra = Double.parseDouble(tfHRA.getText());
                double da = Double.parseDouble(tfDA.getText());
                double deductions = Double.parseDouble(tfDeductions.getText());
                double netSalary = basicSalary + hra + da - deductions;

                String salarySlip = "---- Salary Slip ----\n" +
                        "Employee ID: " + empId + "\n" +
                        "Employee Name: " + empName + "\n" +
                        "Basic Salary: " + basicSalary + "\n" +
                        "HRA: " + hra + "\n" +
                        "DA: " + da + "\n" +
                        "Deductions: " + deductions + "\n" +
                        "Net Salary: " + netSalary + "\n";

                taSalarySlip.setText(salarySlip);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter valid numeric values!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        else if (e.getSource() == btnClear) {
            
            tfBasicSalary.setText("");
            tfHRA.setText("");
            tfDA.setText("");
            tfDeductions.setText("");
            taSalarySlip.setText("");
        }
        else if (e.getSource() == btnPrint) {
            try {
                boolean printed = taSalarySlip.print();
                if (printed) {
                    JOptionPane.showMessageDialog(this, "Salary Slip Printed Successfully!");
                } else {
                    JOptionPane.showMessageDialog(this, "Printing Cancelled!");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error occurred while printing: " + ex.getMessage());
            }
        }

        else {
        	new Home();
        	setVisible(false);
        }
    }

    public static void main(String[] args) {
        new SalarySlipGenerator();
    }
}

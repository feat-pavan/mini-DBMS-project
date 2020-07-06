package Showroom;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.JTable;
import java.awt.SystemColor;
import java.awt.Toolkit;

public class loginpage extends JFrame {

	private JPanel contentPane;
	private JTextField usrfield;
	static loginpage frame;
	private JPasswordField passfield;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new loginpage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public loginpage() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\eclipse\\caricon.png"));
		setTitle("S I G N U P");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 460);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		usrfield = new JTextField();
		usrfield.setBounds(246, 118, 136, 27);
		contentPane.add(usrfield);
		usrfield.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel.setBounds(231, 79, 151, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22));
		lblPassword.setBounds(231, 169, 146, 23);
		contentPane.add(lblPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String usr=usrfield.getText();
				String pass=passfield.getText();
				if(usrfield.getText().trim().isEmpty() && passfield.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(frame, "Username and password is empty");
				}
				else if(usrfield.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(frame, "Username is empty");
					
				}
				else if(passfield.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(frame, "Password is empty");
					
				}
				
				else if(usr.equals("pavan") &&  pass.equals("usman")) 
				 
				{
					JOptionPane.showMessageDialog(frame, "Sucess");
					
					shrm.main(new String[]{});
					frame.dispose();
				
				}
				else
				{
					JOptionPane.showMessageDialog(frame, "Incorrect username and password Retry");
					usrfield.setText("");
					passfield.setText("");
				}
				
				
				}
		});
		btnLogin.setBounds(194, 292, 89, 23);
		contentPane.add(btnLogin);
		
		JButton btnCancel = new JButton("Back");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				welcome.main(new String[]{});
				frame.dispose();
				
			}
		});
		btnCancel.setBounds(328, 292, 89, 23);
		contentPane.add(btnCancel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Show password");
		chckbxNewCheckBox.setFont(new Font("Tempus Sans ITC", Font.ITALIC, 11));
		chckbxNewCheckBox.setForeground(Color.BLACK);
		chckbxNewCheckBox.setBackground(new Color(238, 232, 170));
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(chckbxNewCheckBox.isSelected())
				{
					passfield.setEchoChar((char)0);
				}else
				{
					passfield.setEchoChar('*');
				}
			}
		});
		chckbxNewCheckBox.setBounds(273, 237, 109, 14);
		contentPane.add(chckbxNewCheckBox);
		
		passfield = new JPasswordField();
		passfield.setBounds(241, 203, 136, 27);
		contentPane.add(passfield);
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("/loimage.jpg")).getImage();
		
		JLabel lblCarShowroomManagement = new JLabel("CAR SHOWROOM MANAGEMENT SYSTEM");
		lblCarShowroomManagement.setBackground(Color.GRAY);
		lblCarShowroomManagement.setForeground(new Color(255, 140, 0));
		lblCarShowroomManagement.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblCarShowroomManagement.setBounds(62, 11, 530, 55);
		contentPane.add(lblCarShowroomManagement);
		lblNewLabel_1.setIcon(new ImageIcon(img));
		lblNewLabel_1.setBounds(0, 0, 654, 431);
		contentPane.add(lblNewLabel_1);
	}
}

package Showroom;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;

public class welcome extends JFrame {

	private JPanel contentPane;
	static welcome frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				 frame = new welcome();
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
	public welcome() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\eclipse\\caricon.png"));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 694, 513);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcome = new JLabel("WELCOME");
		lblWelcome.setForeground(Color.WHITE);
		lblWelcome.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblWelcome.setBounds(246, 11, 164, 53);
		contentPane.add(lblWelcome);
		
		JLabel lblTo = new JLabel("TO");
		lblTo.setForeground(Color.WHITE);
		lblTo.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblTo.setBounds(306, 75, 43, 33);
		contentPane.add(lblTo);
		
		JLabel lblNewLabel = new JLabel("Car showroom DB Project");
		lblNewLabel.setForeground(Color.YELLOW);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 35));
		lblNewLabel.setBounds(122, 99, 476, 72);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Developed By ,");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(236, 181, 186, 33);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblPavanP = new JLabel("Pavan P");
		lblPavanP.setForeground(Color.WHITE);
		lblPavanP.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPavanP.setBounds(236, 213, 99, 33);
		contentPane.add(lblPavanP);
		
		JLabel lblUsmanSharif = new JLabel("Usman Sharif");
		lblUsmanSharif.setForeground(Color.WHITE);
		lblUsmanSharif.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsmanSharif.setBounds(236, 244, 149, 33);
		contentPane.add(lblUsmanSharif);
		
		JButton btnClickHereTo = new JButton("Click here to proceed");
		btnClickHereTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				loginpage.main(new String[]{});
				frame.dispose();
				
			}
		});
		btnClickHereTo.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnClickHereTo.setBounds(482, 423, 186, 40);
		contentPane.add(btnClickHereTo);
		
		JLabel lblNewLabel_2 = new JLabel("");
		Image imgs=new ImageIcon(this.getClass().getResource("/back.jpg")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(imgs));
		lblNewLabel_2.setBounds(0, 0, 688, 484);
		contentPane.add(lblNewLabel_2);
	}
}

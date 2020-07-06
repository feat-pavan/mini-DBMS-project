package Showroom;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.omg.CORBA.PolicyHelper;


import net.proteanit.sql.DbUtils;

import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import java.awt.Label;
import java.awt.SystemColor;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Toolkit;

public class shrm extends JFrame {

	private JPanel contentPane;
	private JTextField custidfield;
	private JTextField fnamefield;
	private JTextField lnamefield;
	private JTextField phfield;
	private JTextField addressfield;
	private JTextField postfield;
	private JTable table;
	static shrm frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new shrm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
Connection con=DB.dbconnector();
private JTextField caridfield;
private JTextField serialfield;
private JTextField makefield;
private JTextField modelfield;
private JTextField yearfield;
private JTextField colorfield;
private JTable cartable;
private JRadioButton yesbtn;
private JRadioButton nobtn;
private JTable mechanictable;
private JTextField pricefield;
private JTextField midfield;
private JTextField mfnamefield;
private JTextField mlnamefield;
private JTextField mphone;
private JTextField invoidfield;
private JTextField date1field;
private JTextField carid1field;
private JTextField custid1field;
private JTextField salesperson1id;
private JTextField salespersonid2field;
private JTextField fname1field;
private JTextField lname1field;
private JTable salesptable;
private JTextField serviceid1field;
private JTextField servicenamefield;
private JTextField hourfield;
private JTable servicetable;
private JTextField smfield;
private JTextField serviceid2field;
private JTextField mcfield;
private JTextField hoursfield;
private JTextField serviceticketidfield;
private JTable smtable;
private JTable sstable;
private JTextField sidfield;
private JTextField scarfield;
private JTextField scustfield;
private JTextField rcdatefield;
private JTextField rtdatefield;
private JTable srtable;

public void refresh()
{
	try{
		String qry="select * from customer";
		PreparedStatement ps=con.prepareStatement(qry);
		ResultSet rs=ps.executeQuery();
		table .setModel(DbUtils.resultSetToTableModel(rs));		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

	/**
	 * Create the frame.
	 */
	public shrm() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\eclipse\\caricon.png"));
		setTitle("Car Showroom");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 955, 684);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Close");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmLogout = new JMenuItem("logout");
		mntmLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				loginpage.main(new String[]{});
				frame.dispose();
			}
		});
		mnNewMenu.add(mntmLogout);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 135, 949, 520);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.RED);
		tabbedPane.addTab("Customers", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblCustomerid = new JLabel("Customer-ID");
		lblCustomerid.setForeground(new Color(0, 0, 0));
		lblCustomerid.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCustomerid.setBounds(10, 77, 136, 28);
		panel.add(lblCustomerid);
		
		JLabel lblFname = new JLabel("Fname");
		lblFname.setForeground(new Color(0, 0, 0));
		lblFname.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblFname.setBounds(10, 116, 136, 28);
		panel.add(lblFname);
		
		JLabel lblNewLabel = new JLabel("Lname");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 155, 136, 33);
		panel.add(lblNewLabel);
		
		JLabel lblPhno = new JLabel("Ph-no");
		lblPhno.setForeground(new Color(0, 0, 0));
		lblPhno.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPhno.setBounds(10, 188, 136, 28);
		panel.add(lblPhno);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setForeground(new Color(0, 0, 0));
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAddress.setBounds(10, 227, 136, 28);
		panel.add(lblAddress);
		
		JLabel lblPostcode = new JLabel("Post-code");
		lblPostcode.setForeground(new Color(0, 0, 0));
		lblPostcode.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPostcode.setBounds(10, 266, 136, 28);
		panel.add(lblPostcode);
		
		custidfield = new JTextField();
		custidfield.setBounds(156, 84, 150, 28);
		panel.add(custidfield);
		custidfield.setColumns(10);
		
		fnamefield = new JTextField();
		fnamefield.setBounds(156, 123, 150, 28);
		panel.add(fnamefield);
		fnamefield.setColumns(10);
		
		lnamefield = new JTextField();
		lnamefield.setBounds(156, 162, 150, 24);
		panel.add(lnamefield);
		lnamefield.setColumns(10);
		
		phfield = new JTextField();
		phfield.setBounds(156, 197, 150, 24);
		panel.add(phfield);
		phfield.setColumns(10);
		
		addressfield = new JTextField();
		addressfield.setBounds(156, 232, 150, 28);
		panel.add(addressfield);
		addressfield.setColumns(10);
		
		postfield = new JTextField();
		postfield.setBounds(154, 271, 152, 24);
		panel.add(postfield);
		postfield.setColumns(10);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(326, 81, 521, 346);
		panel.add(scrollPane_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane_1.setViewportView(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try{
					int row=table.getSelectedRow();
					String cust=(table.getModel().getValueAt(row, 0)).toString();
					
					String qry="select * from customer where cust_id='"+cust+"'";
					PreparedStatement ps=con.prepareStatement(qry);
					ResultSet rs=ps.executeQuery();
					while(rs.next())
					{
						custidfield.setText(rs.getString("cust_id"));
						fnamefield.setText(rs.getString("fname"));
						lnamefield.setText(rs.getString("lname"));
						phfield.setText(rs.getString("phone"));
						addressfield.setText(rs.getString("address"));
						postfield.setText(rs.getString("post_code"));
					}
					ps.close();
					}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		scrollPane.setViewportView(table);
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(custidfield.getText().trim().isEmpty() && fnamefield.getText().trim().isEmpty() && lnamefield.getText().trim().isEmpty() && phfield.getText().trim().isEmpty() && addressfield.getText().trim().isEmpty() && postfield.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(frame, "Plz Enter customer details");
				}
				else	if(custidfield.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(frame, "Customer field is empty");
				}
				else if(fnamefield.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(frame, "Firstname field is empty");
				}
				else if(lnamefield.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(frame, "Lastname field is empty");
					
				}
				else if(phfield.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(frame, "Phone field is empty");
				}
				else if(addressfield.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(frame, "Addressfield is empty");
				}
					try{
					String ins="insert into customer(cust_id,fname,lname,phone,address,post_code) values(?,?,?,?,?,?)";
					PreparedStatement ps=con.prepareStatement(ins);
					ps.setString(1, custidfield.getText());
					ps.setString(2, fnamefield.getText());
					ps.setString(3, lnamefield.getText());
					ps.setString(4, phfield.getText());
					ps.setString(5, addressfield.getText());
					ps.setString(6, postfield.getText());
					ps.execute();
					
					refresh();
					
					JOptionPane.showMessageDialog(frame, "Info inserted");
					custidfield.setText("");
					fnamefield.setText("");
					lnamefield.setText("");
					phfield.setText("");
					addressfield.setText("");
					postfield.setText("");
					
				}
				catch(SQLIntegrityConstraintViolationException e)
				{  
					JOptionPane.showMessageDialog(frame, "Customer-id already Exists");
					custidfield.setText("");
					fnamefield.setText("");
					lnamefield.setText("");
					phfield.setText("");
					addressfield.setText("");
					postfield.setText("");
					e.printStackTrace();
				}
					catch(Exception e)
					{
						e.printStackTrace();
					}
					
					
			}
		});
		btnNewButton.setBounds(10, 324, 65, 24);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try{
					String id=JOptionPane.showInputDialog(frame, "Enter id to delete");
					{
						String q="call del('"+id+"')";
						PreparedStatement ps=con.prepareStatement(q);
						ps.executeQuery();
						JOptionPane.showMessageDialog(frame, "Customer id deleted");
					}
					
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBounds(85, 325, 77, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Update");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(custidfield.getText().trim().isEmpty() && fnamefield.getText().trim().isEmpty() && lnamefield.getText().trim().isEmpty() && phfield.getText().trim().isEmpty() && addressfield.getText().trim().isEmpty() && postfield.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(frame, "Nothing to update");
				}
				else{
					try
				   {
					String up="update customer set cust_id='"+custidfield.getText()+"', fname='"+fnamefield.getText()+"',lname='"+lnamefield.getText()+"',phone='"+phfield.getText()+"',address='"+addressfield.getText()+"',post_code='"+postfield.getText()+"' where cust_id='"+custidfield.getText()+"'";
				  	PreparedStatement ps=con.prepareStatement(up);
				  	ps.execute();
				  	refresh();
				  	JOptionPane.showMessageDialog(frame, "Information Updated");
				  	
				  	custidfield.setText("");  
					fnamefield.setText("");
					lnamefield.setText("");
					phfield.setText("");
					addressfield.setText("");
					postfield.setText("");
				
			}
			
			catch(Exception e)
			{
				e.printStackTrace();
			}
			}
			}
		});
		btnNewButton_2.setBounds(176, 325, 77, 23);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Load");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String show="select * from customer";
					PreparedStatement pst=con.prepareStatement(show);
					ResultSet rs=pst.executeQuery();
					table .setModel(DbUtils.resultSetToTableModel(rs));
				
				}
				catch(Exception e)
				{
				e.printStackTrace();			
				}
			}
		});
		btnNewButton_3.setBounds(22, 373, 65, 23);
		panel.add(btnNewButton_3);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			try{
				String id=JOptionPane.showInputDialog(frame, "Enter id to search");      
				
				   {
				String sr="call search('"+id+"')";
				
				PreparedStatement ps=con.prepareStatement(sr);
				ResultSet rs=ps.executeQuery();
				
				if(rs.next())
				    {
					custidfield.setText(rs.getString("cust_id"));
					fnamefield.setText(rs.getString("fname"));
					lnamefield.setText(rs.getString("lname"));
					phfield.setText(rs.getString("phone"));
					addressfield.setText(rs.getString("address"));
					postfield.setText(rs.getString("post_code"));
				    }
				else{
					JOptionPane.showMessageDialog(frame, "Customer id not found");
				}
				
				ps.close();
				  }
		        }
				
				catch(Exception e)
				{
					e.printStackTrace();
					JOptionPane.showMessageDialog(frame, "not found");
				}
			}
		});
		btnSearch.setBounds(134, 373, 77, 23);
		panel.add(btnSearch);
		
		JLabel lblCustomerDetails = new JLabel("Customer Details");
		lblCustomerDetails.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 40));
		lblCustomerDetails.setBounds(304, 11, 368, 50);
		panel.add(lblCustomerDetails);
		Image cs=new ImageIcon(this.getClass().getResource("/custom.jpg")).getImage();
		
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Cars", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Car-id");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(30, 93, 85, 28);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblSerialnumber = new JLabel("Serial-number");
		lblSerialnumber.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSerialnumber.setBounds(28, 132, 166, 28);
		panel_1.add(lblSerialnumber);
		
		JLabel lblMake = new JLabel("Make");
		lblMake.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblMake.setBounds(28, 171, 99, 28);
		panel_1.add(lblMake);
		
		JLabel lblModel = new JLabel("Model");
		lblModel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblModel.setBounds(28, 210, 99, 28);
		panel_1.add(lblModel);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblYear.setBounds(28, 249, 72, 28);
		panel_1.add(lblYear);
		
		JLabel lblColor = new JLabel("Color");
		lblColor.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblColor.setBounds(28, 288, 72, 22);
		panel_1.add(lblColor);
		
		JLabel lblForsale = new JLabel("For-sale");
		lblForsale.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblForsale.setBounds(28, 346, 99, 22);
		panel_1.add(lblForsale);
		
		caridfield = new JTextField();
		caridfield.setBounds(193, 96, 112, 28);
		panel_1.add(caridfield);
		caridfield.setColumns(10);
		
		serialfield = new JTextField();
		serialfield.setBounds(193, 135, 112, 28);
		panel_1.add(serialfield);
		serialfield.setColumns(10);
		
		makefield = new JTextField();
		makefield.setBounds(193, 174, 112, 28);
		panel_1.add(makefield);
		makefield.setColumns(10);
		
		modelfield = new JTextField();
		modelfield.setBounds(193, 210, 112, 28);
		panel_1.add(modelfield);
		modelfield.setColumns(10);
		
		yearfield = new JTextField();
		yearfield.setBounds(193, 249, 112, 25);
		panel_1.add(yearfield);
		yearfield.setColumns(10);
		
		colorfield = new JTextField();
		colorfield.setBounds(193, 285, 112, 25);
		panel_1.add(colorfield);
		colorfield.setColumns(10);
		
		yesbtn = new JRadioButton("Yes");
		yesbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(yesbtn.isSelected())
				{
					nobtn.setSelected(false);
				}
				String y="yes";
				yesbtn.setActionCommand(y);
				}
		});
		yesbtn.setFont(new Font("Tahoma", Font.BOLD, 11));
		yesbtn.setBounds(133, 349, 55, 23);
		panel_1.add(yesbtn);
		
		nobtn = new JRadioButton("No");
		nobtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(nobtn.isSelected())
				{
					yesbtn.setSelected(false);
				}
				String n="no";
				nobtn.setActionCommand(n);
			}
		});
		nobtn.setFont(new Font("Tahoma", Font.BOLD, 11));
		nobtn.setBounds(193, 349, 55, 23);
		panel_1.add(nobtn);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(caridfield.getText().trim().isEmpty() && serialfield.getText().trim().isEmpty() && makefield.getText().trim().isEmpty() && modelfield.getText().trim().isEmpty() && yearfield.getText().trim().isEmpty() && colorfield.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(frame, "Plz enter car details");
				}
				else if(caridfield.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(frame, "Plz enter car-id");
				}
				else if(serialfield.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(frame, "Plz enter car serial number");
				}
				else if(makefield.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(frame, "Plz enter car make");
				}
				else if(modelfield.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(frame, "Plz enter car model");
				}
				else if(yearfield.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(frame, "Plz enter year");
				}
				else if(colorfield.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(frame, "Plz enter color of car");
				}
				else if(pricefield.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(frame, "Plz enter price of a car");
				}
				
				try{
					String qry="insert into car(car_id,serial_num,make,model,year,color,price,forsale) values(?,?,?,?,?,?,?,?)";
					PreparedStatement ps=con.prepareStatement(qry);
					ps.setString(1, caridfield.getText());
					ps.setString(2, serialfield.getText());
					ps.setString(3, makefield.getText());
					ps.setString(4, modelfield.getText());
					ps.setString(5, yearfield.getText());
					ps.setString(6, colorfield.getText());
					ps.setString(7, pricefield.getText());
					if(yesbtn.isSelected())
					{
						ps.setString(8, yesbtn.getActionCommand());
					}
					else
					{
						ps.setString(8, nobtn.getActionCommand());
					}
					ps.execute();
					refreshcar();
				}
					catch(SQLIntegrityConstraintViolationException a)
					{
						JOptionPane.showMessageDialog(frame, "Car-id already exists");
					}
					
					
				
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}

			private void refreshcar() {
				// TODO Auto-generated method stub
				try{
					String qry="select * from car";
					PreparedStatement ps=con.prepareStatement(qry);
					ResultSet rs=ps.executeQuery();
					cartable .setModel(DbUtils.resultSetToTableModel(rs));
					
				}
					catch(Exception e1)
					{
						e1.printStackTrace();
					}
				
			}
		});
		btnAdd.setBounds(10, 393, 72, 23);
		panel_1.add(btnAdd);
		
		JButton btnNewButton_4 = new JButton("Delete");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				

				try{
					String id=JOptionPane.showInputDialog(frame, "Enter car to delete");
					{
						String q="call cardel('"+id+"')";
						PreparedStatement ps=con.prepareStatement(q);
						ps.executeQuery();
						JOptionPane.showMessageDialog(frame, "Car is deleted");
					}
					
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		btnNewButton_4.setBounds(107, 427, 72, 23);
		panel_1.add(btnNewButton_4);
		
		JButton btnLoad = new JButton("Load");
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				String qry="select * from car";
				PreparedStatement ps=con.prepareStatement(qry);
				ResultSet rs=ps.executeQuery();
				cartable .setModel(DbUtils.resultSetToTableModel(rs));
				
			}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
			}
		});
		btnLoad.setBounds(10, 427, 72, 23);
		panel_1.add(btnLoad);
		
		JButton btnUpdate_6 = new JButton("Update");
		btnUpdate_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String up="update car set car_id='"+caridfield.getText()+"', serial_num='"+serialfield.getText()+"',make='"+makefield.getText()+"',model='"+modelfield.getText()+"',year='"+yearfield.getText()+"',color='"+colorfield.getText()+"',price='"+pricefield.getText()+"',forsale='"+yesbtn.getActionCommand()+"',forsale='"+nobtn.getActionCommand()+"' where car_id='"+caridfield.getText()+"'";
				  	PreparedStatement ps=con.prepareStatement(up);
				  	ps.execute();
				  	
				  	JOptionPane.showMessageDialog(frame, "Information Updated");
				  	
				}
				
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
			}
		});
		btnUpdate_6.setBounds(107, 393, 72, 23);
		panel_1.add(btnUpdate_6);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(357, 79, 509, 396);
		panel_1.add(scrollPane_3);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_3.setViewportView(scrollPane_2);
		cartable = new JTable();
		cartable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try{
					int row=cartable.getSelectedRow();
					String car=(cartable.getModel().getValueAt(row, 0)).toString();
					
					String qry="select * from car where car_id='"+car+"'";
					PreparedStatement ps=con.prepareStatement(qry);
					ResultSet rs=ps.executeQuery();
					while(rs.next())
					{
						caridfield.setText(rs.getString("car_id"));
						serialfield.setText(rs.getString("serial_num"));
						makefield.setText(rs.getString("make"));
						modelfield.setText(rs.getString("model"));
						yearfield.setText(rs.getString("year"));
						colorfield.setText(rs.getString("color"));
						pricefield.setText(rs.getString("price"));
						
						
 				}
					ps.close();
					}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				}
		});
		scrollPane_2.setViewportView(cartable);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPrice.setBounds(28, 321, 46, 14);
		panel_1.add(lblPrice);
		
		pricefield = new JTextField();
		pricefield.setBounds(191, 318, 114, 24);
		panel_1.add(pricefield);
		pricefield.setColumns(10);
		
		JLabel lblCarDetail = new JLabel("Car Details");
		lblCarDetail.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 40));
		lblCarDetail.setBounds(381, 11, 255, 57);
		panel_1.add(lblCarDetail);
		
		JLabel lblNewLabel_5 = new JLabel("");
		Image car=new ImageIcon(this.getClass().getResource("/carim.jpg")).getImage();
		lblNewLabel_5.setIcon(new ImageIcon(car));
		lblNewLabel_5.setBounds(0, 0, 944, 554);
		panel_1.add(lblNewLabel_5);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Mechanic", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Mechanic-id");
		lblNewLabel_2.setForeground(new Color(240, 230, 140));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(10, 73, 122, 27);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblFname_1 = new JLabel("Fname");
		lblFname_1.setForeground(new Color(240, 230, 140));
		lblFname_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblFname_1.setBounds(10, 111, 81, 27);
		panel_2.add(lblFname_1);
		
		JLabel lblLname = new JLabel("Lname");
		lblLname.setForeground(new Color(240, 230, 140));
		lblLname.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblLname.setBounds(10, 149, 81, 27);
		panel_2.add(lblLname);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setForeground(new Color(240, 230, 140));
		lblPhone.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPhone.setBounds(10, 187, 81, 27);
		panel_2.add(lblPhone);
		
		JButton btnAdd_1 = new JButton("Add");
		btnAdd_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(midfield.getText().trim().isEmpty() && mfnamefield.getText().trim().isEmpty() && mlnamefield.getText().trim().isEmpty() && mphone.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(frame, "PLZ enter mechanic details");
				}
			else
				if(midfield.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(frame, "Mechanic id field is empty");
				}
				else if(mfnamefield.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(frame, "Mechanic name is empty");
					
				}
				else if(mlnamefield.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(frame, "Mechanic Lname is empty");
				}
				else if(mphone.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(frame, "Mechanic phone is empty");
				}
				else
				try{
					String qry="insert into mechanic(mechanic_id,fname,lname,ph_no)values(?,?,?,?)";
					PreparedStatement ps=con.prepareStatement(qry);
					ps.setString(1, midfield.getText());
					ps.setString(2, mfnamefield.getText());
					ps.setString(3, mlnamefield.getText());
					ps.setString(4, mphone.getText());
					ps.execute();
					{
						JOptionPane.showMessageDialog(frame, "Added sucessufully");
					}
					
				}
				catch(Exception e)
			{
				e.printStackTrace();
			}
			}
		});
		btnAdd_1.setBounds(10, 244, 62, 23);
		panel_2.add(btnAdd_1);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try{
					String id=JOptionPane.showInputDialog(frame, "Enter mechanic id to delete");
					{
						String q="call mechdel('"+id+"')";
						PreparedStatement ps=con.prepareStatement(q);
						ps.executeQuery();
						JOptionPane.showMessageDialog(frame, "Mechanic is deleted");
					}
					
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		btnDelete.setBounds(82, 244, 72, 23);
		panel_2.add(btnDelete);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String up="update mechanic set mechanic_id='"+midfield.getText()+"', fname='"+mfnamefield.getText()+"',lname='"+mlnamefield.getText()+"',ph_no='"+mphone.getText()+"' where mechanic_id='"+midfield.getText()+"'";
				  	PreparedStatement ps=con.prepareStatement(up);
				  	ps.execute();
				  	
				  	JOptionPane.showMessageDialog(frame, "Information Updated");
				  	
				}
				
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
			}
		});
		btnUpdate.setBounds(164, 244, 81, 23);
		panel_2.add(btnUpdate);
		
		JButton btnLoad_1 = new JButton("Load");
		btnLoad_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
				String qry="select * from mechanic";
				PreparedStatement ps=con.prepareStatement(qry);
				ResultSet rs=ps.executeQuery();
				mechanictable .setModel(DbUtils.resultSetToTableModel(rs));
			}
				catch(Exception e)
				{
					e.printStackTrace();
				}}
		});
		btnLoad_1.setBounds(10, 278, 72, 23);
		panel_2.add(btnLoad_1);
		
		mechanictable = new JTable();
		JScrollPane scrollPane_4 = new JScrollPane();
		mechanictable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try{
					int row=mechanictable.getSelectedRow();
					String mid=(mechanictable.getModel().getValueAt(row, 0)).toString();
					
					String qry="select * from mechanic where mechanic_id='"+mid+"'";
					PreparedStatement ps=con.prepareStatement(qry);
					ResultSet rs=ps.executeQuery();
					while(rs.next())
					{
						midfield.setText(rs.getString("mechanic_id"));
						mfnamefield.setText(rs.getString("fname"));
						mlnamefield.setText(rs.getString("lname"));
						mphone.setText(rs.getString("ph_no"));
						
 				}
					ps.close();
					}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
				
			}
		});
		scrollPane_4.setBounds(392, 81, 469, 372);
		panel_2.add(scrollPane_4);
		
		
		scrollPane_4.setViewportView(mechanictable);
		
		midfield = new JTextField();
		midfield.setBounds(164, 73, 147, 27);
		panel_2.add(midfield);
		midfield.setColumns(10);
		
		mfnamefield = new JTextField();
		mfnamefield.setBounds(164, 111, 147, 27);
		panel_2.add(mfnamefield);
		mfnamefield.setColumns(10);
		
		mlnamefield = new JTextField();
		mlnamefield.setBounds(164, 155, 147, 27);
		panel_2.add(mlnamefield);
		mlnamefield.setColumns(10);
		
		mphone = new JTextField();
		mphone.setBounds(164, 193, 147, 27);
		panel_2.add(mphone);
		mphone.setColumns(10);
		
		JLabel lblMechanicDetails = new JLabel("Mechanic Details");
		lblMechanicDetails.setForeground(new Color(240, 230, 140));
		lblMechanicDetails.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 40));
		lblMechanicDetails.setBounds(389, 11, 353, 39);
		panel_2.add(lblMechanicDetails);
		
		JLabel lblNewLabel_9 = new JLabel("");
		Image imagem=new ImageIcon(this.getClass().getResource("/kcar.jpg")).getImage();
		lblNewLabel_9.setIcon(new ImageIcon(imagem));
		lblNewLabel_9.setBounds(0, 0, 934, 554);
		panel_2.add(lblNewLabel_9);
		
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Sales Person", null, panel_4, null);
		panel_4.setLayout(null);
		
		JLabel lblSalesPersonId = new JLabel("Sales Person ID");
		lblSalesPersonId.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSalesPersonId.setBounds(10, 121, 160, 22);
		panel_4.add(lblSalesPersonId);
		
		JLabel lblFname_2 = new JLabel("Fname");
		lblFname_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblFname_2.setBounds(10, 154, 75, 22);
		panel_4.add(lblFname_2);
		
		JLabel lblLname_1 = new JLabel("Lname");
		lblLname_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblLname_1.setBounds(10, 191, 75, 22);
		panel_4.add(lblLname_1);
		
		salespersonid2field = new JTextField();
		salespersonid2field.setBounds(198, 121, 141, 28);
		panel_4.add(salespersonid2field);
		salespersonid2field.setColumns(10);
		
		fname1field = new JTextField();
		fname1field.setBounds(198, 158, 141, 28);
		panel_4.add(fname1field);
		fname1field.setColumns(10);
		
		lname1field = new JTextField();
		lname1field.setBounds(198, 191, 141, 28);
		panel_4.add(lname1field);
		lname1field.setColumns(10);
		
		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(435, 121, 471, 357);
		panel_4.add(scrollPane_6);
		
		salesptable = new JTable();
		JScrollPane scrollPane_5 = new JScrollPane();
		salesptable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try{
					int row=salesptable.getSelectedRow();
					String mid=(salesptable.getModel().getValueAt(row, 0)).toString();
					
					String qry="select * from sales_person where salesperson_id='"+mid+"'";
					PreparedStatement ps=con.prepareStatement(qry);
					ResultSet rs=ps.executeQuery();
					while(rs.next())
					{
						salespersonid2field.setText(rs.getString("salesperson_id"));
						fname1field.setText(rs.getString("fname"));
						lname1field.setText(rs.getString("lname"));
						
						
 				}
					ps.close();
					}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
				
			}
		});
		scrollPane_6.setViewportView(scrollPane_5);
		
		
		scrollPane_5.setViewportView(salesptable);
		
		JButton btnAdd_3 = new JButton("Add");
		btnAdd_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String qry="insert into sales_person(salesperson_id,fname,lname)values(?,?,?)";
					PreparedStatement ps=con.prepareStatement(qry);
					ps.setString(1, salespersonid2field.getText());
					ps.setString(2, fname1field.getText());
					ps.setString(3, lname1field.getText());
					ps.execute();
					
				}
				catch(Exception w)
				{
					w.printStackTrace();
				}
				
			}
		});
		btnAdd_3.setBounds(10, 271, 89, 23);
		panel_4.add(btnAdd_3);
		
		JButton btnDelete_1 = new JButton("Delete");
		btnDelete_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String id=JOptionPane.showInputDialog(frame, "Enter salesperson id to delete");
					{
						String q="call sldel('"+id+"')";
						PreparedStatement ps=con.prepareStatement(q);
						ps.executeQuery();
						JOptionPane.showMessageDialog(frame, "salesperson is deleted");
					}
					
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		btnDelete_1.setBounds(134, 271, 89, 23);
		panel_4.add(btnDelete_1);
		
		JButton btnUpdate_1 = new JButton("Update");
		btnUpdate_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String up="update sales_person set salesperson_id='"+salespersonid2field.getText()+"', fname='"+fname1field.getText()+"',lname='"+lname1field.getText()+"' where salesperson_id='"+salespersonid2field.getText()+"'";
				  	PreparedStatement ps=con.prepareStatement(up);
				  	ps.execute();
				  	
				  	JOptionPane.showMessageDialog(frame, "Information Updated");
				  	
				}
				
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
				
			}
		});
		btnUpdate_1.setBounds(269, 271, 89, 23);
		panel_4.add(btnUpdate_1);
		
		JButton btnLoad_5 = new JButton("Load");
		btnLoad_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String qry="select * from sales_person";
					PreparedStatement ps=con.prepareStatement(qry);
					ResultSet rs=ps.executeQuery();
					salesptable .setModel(DbUtils.resultSetToTableModel(rs));
					
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
			}
		});
		btnLoad_5.setBounds(10, 317, 89, 23);
		panel_4.add(btnLoad_5);
		
		JLabel lblSalesPersonDetails = new JLabel("Sales Person Details");
		lblSalesPersonDetails.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 40));
		lblSalesPersonDetails.setBounds(279, 11, 431, 64);
		panel_4.add(lblSalesPersonDetails);
		
		JLabel lblNewLabel_15 = new JLabel("");
		Image aimg=new ImageIcon(this.getClass().getResource("/simage.jpg")).getImage();
		lblNewLabel_15.setIcon(new ImageIcon(aimg));
		lblNewLabel_15.setBounds(0, 0, 944, 565);
		panel_4.add(lblNewLabel_15);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Sales in voice", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Invoid");
		lblNewLabel_3.setForeground(new Color(255, 250, 250));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(10, 108, 80, 22);
		panel_3.add(lblNewLabel_3);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setForeground(new Color(255, 250, 250));
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDate.setBounds(10, 151, 46, 14);
		panel_3.add(lblDate);
		
		JLabel lblCarid = new JLabel("Car-ID");
		lblCarid.setForeground(new Color(255, 250, 250));
		lblCarid.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCarid.setBounds(10, 183, 62, 22);
		panel_3.add(lblCarid);
		
		JLabel lblCustid = new JLabel("Cust-ID");
		lblCustid.setForeground(new Color(255, 250, 250));
		lblCustid.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCustid.setBounds(10, 216, 80, 22);
		panel_3.add(lblCustid);
		
		JLabel lblSalespersonId = new JLabel("Sales_person ID");
		lblSalespersonId.setForeground(new Color(255, 250, 250));
		lblSalespersonId.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSalespersonId.setBounds(10, 249, 148, 22);
		panel_3.add(lblSalespersonId);
		
		invoidfield = new JTextField();
		invoidfield.setBounds(181, 108, 108, 24);
		panel_3.add(invoidfield);
		invoidfield.setColumns(10);
		
		date1field = new JTextField();
		date1field.setBounds(181, 141, 108, 24);
		panel_3.add(date1field);
		date1field.setColumns(10);
		
		carid1field = new JTextField();
		carid1field.setBounds(181, 183, 108, 22);
		panel_3.add(carid1field);
		carid1field.setColumns(10);
		
		custid1field = new JTextField();
		custid1field.setBounds(181, 216, 108, 24);
		panel_3.add(custid1field);
		custid1field.setColumns(10);
		
		salesperson1id = new JTextField();
		salesperson1id.setBounds(181, 249, 108, 24);
		panel_3.add(salesperson1id);
		salesperson1id.setColumns(10);
		
		JButton btnAdd_2 = new JButton("Add");
		btnAdd_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String qry="insert into sales_in_voice (invoid,date,car_id,cust_id,sales_per_id) values(?,?,?,?,?)";
					PreparedStatement ps=con.prepareStatement(qry);
					ps.setString(1, invoidfield.getText());
					ps.setString(2, date1field.getText());
					ps.setString(3, carid1field.getText());
					ps.setString(4, custid1field.getText());
					ps.setString(5, salesperson1id.getText());
					ps.execute();
					JOptionPane.showMessageDialog(frame, "Data added sucessfully");
					
					
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
		});
		btnAdd_2.setBounds(10, 318, 73, 23);
		panel_3.add(btnAdd_2);
		
		JButton btnNewButton_5 = new JButton("Delete");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
				String id=JOptionPane.showInputDialog(frame, "Enter invoid  to delete");
				{
					String q="call slsdel('"+id+"')";
					PreparedStatement ps=con.prepareStatement(q);
					ps.executeQuery();
					JOptionPane.showMessageDialog(frame, "sales invoice is deleted");
				}
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
				
			}
		});
		btnNewButton_5.setBounds(110, 318, 73, 23);
		panel_3.add(btnNewButton_5);
		
		sstable = new JTable();
		JScrollPane scrollPane_7 = new JScrollPane();
		sstable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try{
					int row=sstable.getSelectedRow();
					String mid=(sstable.getModel().getValueAt(row, 0)).toString();
					
					String qry="select * from sales_in_voice where invoid='"+mid+"'";
					PreparedStatement ps=con.prepareStatement(qry);
					ResultSet rs=ps.executeQuery();
					while(rs.next())
					{
						invoidfield.setText(rs.getString("invoid"));
						date1field.setText(rs.getString("date"));
						carid1field.setText(rs.getString("car_id"));
						custid1field.setText(rs.getString("cust_id"));
						salesperson1id.setText(rs.getString("sales_per_id"));
						
						
 				}
					ps.close();
					}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
				
			}
		});
		scrollPane_7.setBounds(385, 91, 502, 390);
		panel_3.add(scrollPane_7);
		
	
		scrollPane_7.setViewportView(sstable);
		
		JLabel lblSalesInVoice = new JLabel("Salesinvoice");
		lblSalesInVoice.setForeground(new Color(255, 250, 250));
		lblSalesInVoice.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 40));
		lblSalesInVoice.setBounds(326, 11, 297, 40);
		panel_3.add(lblSalesInVoice);
		
		JButton btnLoad_4 = new JButton("Load");
		btnLoad_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String qry="select * from sales_in_voice";
					PreparedStatement ps=con.prepareStatement(qry);
					ResultSet rs=ps.executeQuery();
					sstable .setModel(DbUtils.resultSetToTableModel(rs));
					
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		btnLoad_4.setBounds(210, 318, 89, 23);
		panel_3.add(btnLoad_4);
		
		JButton btnUpdate_5 = new JButton("Update");
		btnUpdate_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String up="update sales_in_voice set invoid='"+invoidfield.getText()+"', date='"+date1field.getText()+"' where invoid='"+invoidfield.getText()+"'";
				  	PreparedStatement ps=con.prepareStatement(up);
				  	ps.execute();
				  	
				  	JOptionPane.showMessageDialog(frame, "Information Updated");
				  	
				}
				
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
				
			}
		});
		btnUpdate_5.setBounds(30, 364, 89, 23);
		panel_3.add(btnUpdate_5);
		
		JLabel lblNewLabel_13 = new JLabel("");
		Image imgg=new ImageIcon(this.getClass().getResource("/sss.jpg")).getImage();
		lblNewLabel_13.setIcon(new ImageIcon(imgg));
		lblNewLabel_13.setBounds(0, 0, 944, 565);
		panel_3.add(lblNewLabel_13);
		Image serimg=new ImageIcon(this.getClass().getResource("/simage.jpg")).getImage();
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Service", null, panel_5, null);
		panel_5.setLayout(null);
		
		JLabel lblServiceid = new JLabel("Service-ID");
		lblServiceid.setForeground(new Color(255, 250, 250));
		lblServiceid.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblServiceid.setBounds(36, 108, 97, 22);
		panel_5.add(lblServiceid);
		
		JLabel lblServiceName = new JLabel("Service name");
		lblServiceName.setForeground(new Color(255, 250, 250));
		lblServiceName.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblServiceName.setBounds(36, 141, 132, 22);
		panel_5.add(lblServiceName);
		
		JLabel lblHourRate = new JLabel("Hour Rate");
		lblHourRate.setForeground(new Color(255, 250, 250));
		lblHourRate.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHourRate.setBounds(36, 178, 132, 22);
		panel_5.add(lblHourRate);
		
		serviceid1field = new JTextField();
		serviceid1field.setBounds(218, 108, 149, 28);
		panel_5.add(serviceid1field);
		serviceid1field.setColumns(10);
		
		servicenamefield = new JTextField();
		servicenamefield.setBounds(218, 145, 149, 28);
		panel_5.add(servicenamefield);
		servicenamefield.setColumns(10);
		
		hourfield = new JTextField();
		hourfield.setBounds(218, 178, 149, 28);
		panel_5.add(hourfield);
		hourfield.setColumns(10);
		
		JButton btnAdd_4 = new JButton("Add");
		btnAdd_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String qry="insert into service (service_id,service_name,hourly_rate) values(?,?,?)";
					PreparedStatement ps=con.prepareStatement(qry);
					ps.setString(1, serviceid1field.getText());
					ps.setString(2, servicenamefield.getText());
					ps.setString(3, hourfield.getText());
					
					ps.execute();
					JOptionPane.showMessageDialog(frame, "service Inserted sucessfully");
					
					
				}
				catch(Exception e){
					e.printStackTrace();
				}
				
				
			}
		});
		btnAdd_4.setBounds(36, 261, 89, 23);
		panel_5.add(btnAdd_4);
		
		JButton btnDelete_2 = new JButton("Delete");
		btnDelete_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String id=JOptionPane.showInputDialog(frame, "Enter servie id  to delete");
					{
						String q="call srdel('"+id+"')";
						PreparedStatement ps=con.prepareStatement(q);
						ps.executeQuery();
						JOptionPane.showMessageDialog(frame, "service is deleted");
					}
					
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		btnDelete_2.setBounds(168, 261, 89, 23);
		panel_5.add(btnDelete_2);
		
		JButton btnUpdate_2 = new JButton("Update");
		btnUpdate_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String up="update service set service_id='"+serviceid1field.getText()+"', service_name='"+servicenamefield.getText()+"',hourly_rate='"+hourfield.getText()+"' where service_id='"+serviceid1field.getText()+"'";
				  	PreparedStatement ps=con.prepareStatement(up);
				  	ps.execute();
				  	
				  	JOptionPane.showMessageDialog(frame, "Information Updated");
				  	
				}
				
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
				
			}
		});
		btnUpdate_2.setBounds(288, 261, 89, 23);
		panel_5.add(btnUpdate_2);
		
		JButton btnLoad_6 = new JButton("Load");
		btnLoad_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String qry="select * from service";
					PreparedStatement ps=con.prepareStatement(qry);
					ResultSet rs=ps.executeQuery();
					servicetable .setModel(DbUtils.resultSetToTableModel(rs));
					
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
			}
		});
		btnLoad_6.setBounds(36, 314, 89, 23);
		panel_5.add(btnLoad_6);
		
		JScrollPane scrollPane_9 = new JScrollPane();
		scrollPane_9.setBounds(467, 97, 441, 377);
		panel_5.add(scrollPane_9);
		
		servicetable = new JTable();
		JScrollPane scrollPane_8 = new JScrollPane();
		servicetable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try{
					int row=servicetable.getSelectedRow();
					String mid=(servicetable.getModel().getValueAt(row, 0)).toString();
					
					String qry="select * from service where service_id='"+mid+"'";
					PreparedStatement ps=con.prepareStatement(qry);
					ResultSet rs=ps.executeQuery();
					while(rs.next())
					{
						serviceid1field.setText(rs.getString("service_id"));
						servicenamefield.setText(rs.getString("service_name"));
						hourfield.setText(rs.getString("hourly_rate"));
						
						
						
 				}
					ps.close();
					}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
			}
		});
		scrollPane_9.setViewportView(scrollPane_8);
		
	
		scrollPane_8.setViewportView(servicetable);
		
		JLabel lblCarService = new JLabel("Car service");
		lblCarService.setForeground(new Color(255, 250, 250));
		lblCarService.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 40));
		lblCarService.setBounds(335, 11, 286, 55);
		panel_5.add(lblCarService);
		
		JLabel lblNewLabel_11 = new JLabel("");
		Image cars=new ImageIcon(this.getClass().getResource("/scar.jpg")).getImage();
		lblNewLabel_11.setIcon(new ImageIcon(cars));
		lblNewLabel_11.setBounds(0, 0, 944, 565);
		panel_5.add(lblNewLabel_11);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Service ticket", null, panel_6, null);
		panel_6.setLayout(null);
		
		JLabel lblServiceTicketId_1 = new JLabel("Service ticket id");
		lblServiceTicketId_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblServiceTicketId_1.setBounds(20, 114, 155, 29);
		panel_6.add(lblServiceTicketId_1);
		
		JLabel lblCarId = new JLabel("Car id");
		lblCarId.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCarId.setBounds(20, 160, 88, 29);
		panel_6.add(lblCarId);
		
		JLabel lblNewLabel_14 = new JLabel("Cust id");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_14.setBounds(20, 200, 88, 22);
		panel_6.add(lblNewLabel_14);
		
		JLabel lblRecieveDate = new JLabel("Recieve date");
		lblRecieveDate.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblRecieveDate.setBounds(20, 244, 116, 22);
		panel_6.add(lblRecieveDate);
		
		JLabel lblReturnDate = new JLabel("Return date");
		lblReturnDate.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblReturnDate.setBounds(20, 287, 116, 22);
		panel_6.add(lblReturnDate);
		
		sidfield = new JTextField();
		sidfield.setBounds(210, 117, 168, 29);
		panel_6.add(sidfield);
		sidfield.setColumns(10);
		
		scarfield = new JTextField();
		scarfield.setBounds(210, 160, 168, 29);
		panel_6.add(scarfield);
		scarfield.setColumns(10);
		
		scustfield = new JTextField();
		scustfield.setBounds(210, 204, 168, 29);
		panel_6.add(scustfield);
		scustfield.setColumns(10);
		
		rcdatefield = new JTextField();
		rcdatefield.setBounds(210, 248, 168, 29);
		panel_6.add(rcdatefield);
		rcdatefield.setColumns(10);
		
		rtdatefield = new JTextField();
		rtdatefield.setBounds(208, 291, 170, 29);
		panel_6.add(rtdatefield);
		rtdatefield.setColumns(10);
		
		JButton btnAdd_6 = new JButton("Add");
		btnAdd_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String qry="insert into service_ticket(service_ticket_id,car_id,cust_id,date_recieve,date_return)values(?,?,?,?,?)";
					PreparedStatement ps=con.prepareStatement(qry);
					ps.setString(1, sidfield.getText());
					ps.setString(2, scarfield.getText());
					ps.setString(3, scustfield.getText());
					ps.setString(4, rcdatefield.getText());
					ps.setString(5, rtdatefield.getText());
					
					ps.execute();
					JOptionPane.showMessageDialog(frame, "data inserted");
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		btnAdd_6.setBounds(20, 372, 89, 23);
		panel_6.add(btnAdd_6);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String id=JOptionPane.showInputDialog(frame, "Enter service ticket id to remove");
					{
						String q="call stdel('"+id+"')";
						PreparedStatement ps=con.prepareStatement(q);
						ps.executeQuery();
						JOptionPane.showMessageDialog(frame, "service ticekt is deleted");
					}
					
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		btnRemove.setBounds(140, 372, 89, 23);
		panel_6.add(btnRemove);
		
		JButton btnUpdate_4 = new JButton("Update");
		btnUpdate_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String up="update service_ticket set service_ticket_id='"+sidfield.getText()+"', date_recieve='"+rcdatefield.getText()+"',date_return='"+rtdatefield.getText()+"' where service_ticket_id='"+sidfield.getText()+"'";
				  	PreparedStatement ps=con.prepareStatement(up);
				  	ps.execute();
				  	
				  	JOptionPane.showMessageDialog(frame, "Information Updated");
				  	
				}
				
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
				
				
			}
		});
		btnUpdate_4.setBounds(255, 372, 89, 23);
		panel_6.add(btnUpdate_4);
		
		JButton btnLoad_3 = new JButton("Load");
		btnLoad_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String qry="select * from service_ticket";
					PreparedStatement ps=con.prepareStatement(qry);
					ResultSet rs=ps.executeQuery();
					srtable .setModel(DbUtils.resultSetToTableModel(rs));
					
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
			}
		});
		btnLoad_3.setBounds(20, 431, 89, 23);
		panel_6.add(btnLoad_3);
		
		JLabel lblIssueServiceTicket = new JLabel("Issue service ticket");
		lblIssueServiceTicket.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 40));
		lblIssueServiceTicket.setBounds(270, 11, 414, 51);
		panel_6.add(lblIssueServiceTicket);
		
		srtable = new JTable();
		JScrollPane scrollPane_10 = new JScrollPane();
		srtable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try{
					int row=srtable.getSelectedRow();
					String mid=(srtable.getModel().getValueAt(row, 0)).toString();
					
					String qry="select * from service_ticket where service_ticket_id='"+mid+"'";
					PreparedStatement ps=con.prepareStatement(qry);
					ResultSet rs=ps.executeQuery();
					while(rs.next())
					{
						sidfield.setText(rs.getString("service_ticket_id"));
						scarfield.setText(rs.getString("car_id"));
						scustfield.setText(rs.getString("cust_id"));
						rcdatefield.setText(rs.getString("date_recieve"));
						rtdatefield.setText(rs.getString("date_return"));
						
						
						
 				}
					ps.close();
					}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
				
			}
		});
		scrollPane_10.setBounds(472, 94, 448, 387);
		panel_6.add(scrollPane_10);
		
		
		scrollPane_10.setViewportView(srtable);
		
		JLabel lblNewLabel_10 = new JLabel("");
		Image limg=new ImageIcon(this.getClass().getResource("/carim.jpg")).getImage();
		lblNewLabel_10.setIcon(new ImageIcon(limg));
		lblNewLabel_10.setBounds(0, 0, 944, 565);
		panel_6.add(lblNewLabel_10);
		
		JPanel mid1field = new JPanel();
		tabbedPane.addTab("Service mechanic", null, mid1field, null);
		mid1field.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Service Mechanic ID");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_6.setBounds(10, 98, 212, 22);
		mid1field.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Service ID");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_7.setBounds(10, 131, 113, 22);
		mid1field.add(lblNewLabel_7);
		
		JLabel lblMechanicId = new JLabel("Mechanic ID");
		lblMechanicId.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblMechanicId.setBounds(10, 176, 140, 22);
		mid1field.add(lblMechanicId);
		
		JLabel lblHours = new JLabel("Hours");
		lblHours.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHours.setBounds(10, 209, 82, 22);
		mid1field.add(lblHours);
		
		JLabel lblServiceTicketId = new JLabel("Service Ticket ID");
		lblServiceTicketId.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblServiceTicketId.setBounds(10, 242, 171, 22);
		mid1field.add(lblServiceTicketId);
		
		smfield = new JTextField();
		smfield.setBounds(261, 86, 150, 31);
		mid1field.add(smfield);
		smfield.setColumns(10);
		
		serviceid2field = new JTextField();
		serviceid2field.setBounds(261, 130, 152, 31);
		mid1field.add(serviceid2field);
		serviceid2field.setColumns(10);
		
		mcfield = new JTextField();
		mcfield.setBounds(263, 168, 150, 31);
		mid1field.add(mcfield);
		mcfield.setColumns(10);
		
		hoursfield = new JTextField();
		hoursfield.setBounds(263, 205, 150, 31);
		mid1field.add(hoursfield);
		hoursfield.setColumns(10);
		
		serviceticketidfield = new JTextField();
		serviceticketidfield.setBounds(261, 247, 150, 31);
		mid1field.add(serviceticketidfield);
		serviceticketidfield.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Service mechanic");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel_8.setBounds(306, 11, 352, 43);
		mid1field.add(lblNewLabel_8);
		
		smtable = new JTable();
		JScrollPane scrollPane_11 = new JScrollPane();
		smtable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try{
					int row=smtable.getSelectedRow();
					String mid=(smtable.getModel().getValueAt(row, 0)).toString();
					
					String qry="select * from service_mechanic where servicemech_id='"+mid+"'";
					PreparedStatement ps=con.prepareStatement(qry);
					ResultSet rs=ps.executeQuery();
					while(rs.next())
					{
						smfield.setText(rs.getString("servicemech_id"));
						serviceid2field.setText(rs.getString("service_id"));
						mcfield.setText(rs.getString("mech_id"));
						hoursfield.setText(rs.getString("hours"));
						serviceticketidfield.setText(rs.getString("serviceticket_id"));
						
						
						
 				}
					ps.close();
					}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
			}
		});
		scrollPane_11.setBounds(501, 98, 400, 383);
		mid1field.add(scrollPane_11);
		
		
		scrollPane_11.setViewportView(smtable);
		
		JButton btnAdd_5 = new JButton("Add");
		btnAdd_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String str="insert into service_mechanic(servicemech_id,service_id,mech_id,hours,serviceticket_id)values(?,?,?,?,?)";
					PreparedStatement ps=con.prepareStatement(str);
					ps.setString(1, smfield.getText());
					ps.setString(2, serviceid2field.getText());
					ps.setString(3, mcfield.getText());
					ps.setString(4, hoursfield.getText());
					ps.setString(5, serviceticketidfield.getText());
					ps.execute();
					JOptionPane.showMessageDialog(frame, "data inserted");
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		btnAdd_5.setBounds(24, 321, 89, 23);
		mid1field.add(btnAdd_5);
		
		JButton btnNewButton_6 = new JButton("Delete");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String id=JOptionPane.showInputDialog(frame, "Enter service mechanic id to delete");
					{
						String q="call smsdel('"+id+"')";
						PreparedStatement ps=con.prepareStatement(q);
						ps.executeQuery();
						JOptionPane.showMessageDialog(frame, "service mechanic is deleted");
					}
					
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		btnNewButton_6.setBounds(140, 321, 89, 23);
		mid1field.add(btnNewButton_6);
		
		JButton btnLoad_2 = new JButton("Load");
		btnLoad_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String qry="select * from service_mechanic";
					PreparedStatement ps=con.prepareStatement(qry);
					ResultSet rs=ps.executeQuery();
					smtable .setModel(DbUtils.resultSetToTableModel(rs));
					
					
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		btnLoad_2.setBounds(24, 375, 89, 23);
		mid1field.add(btnLoad_2);
		
		JButton btnUpdate_3 = new JButton("Update");
		btnUpdate_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String up="update service_mechanic set servicemech_id='"+smfield.getText()+"', service_id='"+serviceid2field.getText()+"',mech_id='"+mcfield.getText()+"',hours='"+hoursfield.getText()+"',serviceticket_id='"+serviceticketidfield.getText()+"' where servicemech_id='"+smfield.getText()+"'";
				  	PreparedStatement ps=con.prepareStatement(up);
				  	ps.execute();
				  	
				  	JOptionPane.showMessageDialog(frame, "Information Updated");
				  	
				}
				
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
				
				
			}
		});
		btnUpdate_3.setBounds(261, 321, 89, 23);
		mid1field.add(btnUpdate_3);
		
		JLabel lblNewLabel_12 = new JLabel("");
		Image serrimg=new ImageIcon(this.getClass().getResource("/simage.jpg")).getImage();
		lblNewLabel_12.setIcon(new ImageIcon(serrimg));
		lblNewLabel_12.setBounds(0, 0, 944, 565);
		mid1field.add(lblNewLabel_12);
		
		JLabel lblNewLabel_16 = new JLabel("");
		Image dimg=new ImageIcon(this.getClass().getResource("/car1.jpg")).getImage();
		lblNewLabel_16.setIcon(new ImageIcon(dimg));
		lblNewLabel_16.setBounds(0, 0, 949, 159);
		contentPane.add(lblNewLabel_16);

		
	}
}

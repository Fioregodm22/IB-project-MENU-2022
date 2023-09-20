package mainvite2;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class winday1 {

	private JFrame frame;
	private JTable table;
	private JTextField numWeek;
	private JTextField textDay;
	private JTextField typeFood;
	
	
 

    private dayjCenweek122 numinFormation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					winday1 window = new winday1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public winday1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 320, 360);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Semana del curso:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Sitka Text", Font.PLAIN, 12));
		lblNewLabel.setBounds(21, 125, 113, 21);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblDa = new JLabel("Día:");
		lblDa.setHorizontalAlignment(SwingConstants.CENTER);
		lblDa.setFont(new Font("Sitka Text", Font.PLAIN, 12));
		lblDa.setBounds(21, 173, 113, 21);
		frame.getContentPane().add(lblDa);
		
		JLabel lblNewLabel_2 = new JLabel("¿Qué día es hoy?");
		lblNewLabel_2.setFont(new Font("Sitka Heading", Font.BOLD, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(32, 50, 248, 59);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblTipoDeComida = new JLabel("Comida del día:");
		lblTipoDeComida.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipoDeComida.setFont(new Font("Sitka Text", Font.PLAIN, 12));
		lblTipoDeComida.setBounds(21, 234, 113, 21);
		frame.getContentPane().add(lblTipoDeComida);
		
		table = new JTable();
		table.setBackground(new Color(255, 228, 181));
		table.setBounds(0, 50, 314, 53);
		frame.getContentPane().add(table);
		
		JButton btnNewButton = new JButton("Main");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton.setBackground(new Color(240, 240, 240));
		btnNewButton.setBounds(9, 287, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Siguiente");
		btnNewButton_1.setBounds(166, 287, 91, 23);
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("unlikely-arg-type")
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frame.dispose();
			
				
				String weekNum;
				weekNum = numWeek.getText();
				String today;
				today= textDay.getText();
		
				String foodToday;
				foodToday= typeFood.getText();
		        int numinformation = 0;
		  	
				boolean fi; 
				
				fi=false; 
				
					if (weekNum.equals("1") && today.equals("lunes") || today.equals("Lunes")) {
						fi=true;
						switch (foodToday) {
						case "desayuno":
						case "Desayuno":
							numinformation= 1;
							numinFormation = new dayjCenweek122 ( numinformation);
					        numinFormation.setVisibility(true);
					        fi=true;
							break;
							
						case "comida":
						case "Comida":
							numinformation= 2;
							numinFormation = new dayjCenweek122 ( numinformation);
					        numinFormation.setVisibility(true);
					        fi=true;
							break;
							
						case "cena":
						case "Cena":
							numinformation= 3;
							numinFormation = new dayjCenweek122 ( numinformation);
					        numinFormation.setVisibility(true);
					        fi=true;
							break;
						}	
					}
					if (weekNum.equals("1") && today.equals("martes")|| today.equals("Martes")) {
						
						switch (foodToday) {
						case "desayuno":
						case "Desayuno":
							numinformation= 4;
							numinFormation = new dayjCenweek122 ( numinformation);
					        numinFormation.setVisibility(true);
							break;
						case "comida":
						case "Comida":
							numinformation= 5;
							numinFormation = new dayjCenweek122 ( numinformation);
					        numinFormation.setVisibility(true);
							break;
						case "cena":
						case "Cena":
							numinformation= 6;
							numinFormation = new dayjCenweek122 ( numinformation);
					        numinFormation.setVisibility(true);
							break;	
						}
					}
					
					if (weekNum.equals("1") && today.equals("miércoles")|| today.equals("miercoles")|| today.equals("Miércoles")|| today.equals("Miercoles")) {
						switch (foodToday) {
						case "desayuno":
						case "Desayuno":
							numinformation= 7;
							numinFormation = new dayjCenweek122 ( numinformation);
					        numinFormation.setVisibility(true);
							break;
						case "comida":
						case "Comida":
							numinformation= 8;
							numinFormation = new dayjCenweek122 ( numinformation);
					        numinFormation.setVisibility(true);
							break;
						case "cena":
						case "Cena":
							numinformation= 9;
							numinFormation = new dayjCenweek122 ( numinformation);
					        numinFormation.setVisibility(true);
							break;	
						}
					}
					if (weekNum.equals("1") && today.equals("jueves")|| today.equals("Jueves")) {
						switch (foodToday) {
						case "desayuno":
						case "Desayuno":
							numinformation= 10;
							numinFormation = new dayjCenweek122 ( numinformation);
					        numinFormation.setVisibility(true);
							break;
						case "comida":
						case "Comida":
							numinformation= 11;
							numinFormation = new dayjCenweek122 ( numinformation);
					        numinFormation.setVisibility(true);
							break;
						case "cena":
						case "Cena":
							numinformation= 12;
							numinFormation = new dayjCenweek122 ( numinformation);
					        numinFormation.setVisibility(true);
							break;	
						}
					}
					if (weekNum.equals("3") && today.equals("viernes")|| today.equals("Viernes")) {
						switch (foodToday) {
						case "desayuno":
						case "Desayuno":
							numinformation= 13;
							numinFormation = new dayjCenweek122 ( numinformation);
					        numinFormation.setVisibility(true);
					        fi=true;
							break;
						case "comida":
						case "Comida":
							numinformation= 14;
							numinFormation = new dayjCenweek122 ( numinformation);
					        numinFormation.setVisibility(true);
					        fi=true;
							break;
						case "cena":
						case "Cena":
							numinformation= 15;
							numinFormation = new dayjCenweek122 ( numinformation);
					        numinFormation.setVisibility(true);
					        fi=true;
							break;	
						}	
					}
					if (weekNum.equals("2") && today.equals("lunes") || today.equals("Lunes")) {
						fi=true;
					switch (foodToday) {
					case "desayuno":
					case "Desayuno":
						numinformation= 16;
						numinFormation = new dayjCenweek122 ( numinformation);
						numinFormation.setVisibility(true);
						fi=true;
						break;
					case "comida":
					case "Comida":
						numinformation= 17;
						numinFormation = new dayjCenweek122 ( numinformation);
				        numinFormation.setVisibility(true);
				        fi=true;
						break;
					case "cena":
					case "Cena":
						numinformation= 18;
						numinFormation = new dayjCenweek122 ( numinformation);
				        numinFormation.setVisibility(true);
				        fi=true;
						break;	 
						
					}
					
					if (weekNum.equals("2") && today.equals("martes") || today.equals("Martes")) {
						
						fi=true;
						switch (foodToday) {
						case "desayuno":
						case "Desayuno":
							numinformation= 19;
							numinFormation = new dayjCenweek122 ( numinformation);
							numinFormation.setVisibility(true);
							fi=true;
							break;
						case "comida":
						case "Comida":
							numinformation= 20;
							numinFormation = new dayjCenweek122 ( numinformation);
					        numinFormation.setVisibility(true);
					        fi=true;
							break;
						case "cena":
						case "Cena":
							numinformation= 21;
							numinFormation = new dayjCenweek122 ( numinformation);
					        numinFormation.setVisibility(true);
					        fi=true;
							break;	 
					}
					
					}
					
					
				
				
				if(fi==false) {
					JOptionPane.showMessageDialog(null, "Parece que el día es incorrecto", "title", JOptionPane.ERROR_MESSAGE);
				}
					 
				
			
					}	
			}
			
			
		});
		
		
		
		
		numWeek = new JTextField();
		numWeek.setBounds(157, 122, 101, 23);
		frame.getContentPane().add(numWeek);
		numWeek.setColumns(10);
		
		textDay = new JTextField();
		textDay.setColumns(10);
		textDay.setBounds(157, 170, 101, 23);
		frame.getContentPane().add(textDay);
		
		typeFood = new JTextField();
		typeFood.setColumns(10);
		typeFood.setBounds(156, 232, 101, 23);
		frame.getContentPane().add(typeFood);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Fiorella\\Documents\\fiorella\\PREPA tec\\SEMESTRE 5\\INFORMATICA 5\\mainhome1.jpg"));
		lblNewLabel_1.setBounds(0, 0, 423, 321);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		
		
	}
	
	public void setVisibility (boolean visible) {
		frame.setVisible(visible);
	}
	
	
	
}

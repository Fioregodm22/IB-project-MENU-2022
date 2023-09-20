package mainvite2;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;

public class homE {

	private JFrame frame;
	private JTable table;
	private JLabel lblNewLabel_1;
	private JButton btnListaDeLa;
	private JButton btnYourFavouriteRecipe;
    private tablelist7 visible2;
    private winday1 visible1;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homE window = new homE();
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
	public homE() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 322, 359);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("¿Qué día es hoy?");
		btnNewButton.setBackground(new Color(255, 245, 238));
		btnNewButton.setFont(new Font("Sitka Subheading", Font.PLAIN, 13));
		btnNewButton.setBounds(75, 132, 155, 55);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			visible1= new winday1();
			visible1.setVisibility(true);
			frame.dispose();
			}
		});
		
		
		
		
		
		lblNewLabel_1 = new JLabel("Vite and Rapide");
		lblNewLabel_1.setBackground(new Color(255, 222, 173));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Sitka Heading", Font.BOLD, 33));
		lblNewLabel_1.setBounds(28, 37, 250, 96);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		table = new JTable();
		table.setBackground(new Color(255, 228, 181));
		table.setForeground(new Color(255, 222, 173));
		table.setToolTipText("");
		table.setBounds(28, 37, 244, 72);
		frame.getContentPane().add(table);

		btnListaDeLa = new JButton("Lista del super\r\n");
		btnListaDeLa.setFont(new Font("Sitka Subheading", Font.PLAIN, 13));
		btnListaDeLa.setBackground(new Color(255, 248, 220));
		btnListaDeLa.setBounds(75, 209, 155, 55);
		frame.getContentPane().add(btnListaDeLa);
		btnListaDeLa.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
			visible2= new tablelist7();
			visible2.setVisibility(true);
			}
		});
		

		
		JLabel imgFood = new JLabel("New label");
		imgFood.setIcon(new ImageIcon("C:\\Users\\Fiorella\\Documents\\fiorella\\PREPA tec\\SEMESTRE 5\\INFORMATICA 5\\mainhome1.jpg"));
		imgFood.setBounds(-141, -20, 482, 429);
		frame.getContentPane().add(imgFood);
	}
	public void despose() {
		this.frame.dispose();
	}
	public void setVisibility (boolean visible) {
		frame.setVisible(visible);
	}
	
}
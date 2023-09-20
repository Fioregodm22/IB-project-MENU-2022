package mainvite2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class tablelist7 {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JTextField grupoi;
	private JLabel lblCantidad;
	private JLabel lblProducto;
	private JTextField cantidad;
	private JTextField producto;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	DefaultTableModel model;
	private JTable table;
	private JScrollPane scrollPane;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton_4;
	private homE visible1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tablelist7 window = new tablelist7();
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
	public tablelist7() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 565, 498);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("Grupo:");
		lblNewLabel.setFont(new Font("Sitka Small", Font.PLAIN, 12));
		lblNewLabel.setBounds(25, 67, 75, 24);
		panel.add(lblNewLabel);
		
		grupoi = new JTextField();
		grupoi.setBounds(82, 67, 125, 20);
		panel.add(grupoi);
		grupoi.setColumns(10);
		
		lblCantidad = new JLabel("Cantidad:\r\n");
		lblCantidad.setFont(new Font("Sitka Small", Font.PLAIN, 12));
		lblCantidad.setBounds(10, 102, 75, 24);
		panel.add(lblCantidad);
		
		lblProducto = new JLabel("Producto:\r\n");
		lblProducto.setFont(new Font("Sitka Small", Font.PLAIN, 12));
		lblProducto.setBounds(10, 137, 75, 24);
		panel.add(lblProducto);
		
		cantidad = new JTextField();
		cantidad.setColumns(10);
		cantidad.setBounds(82, 102, 125, 20);
		panel.add(cantidad);
		
		producto = new JTextField();
		producto.setColumns(10);
		producto.setBounds(82, 139, 125, 20);
		panel.add(producto);
		
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(244, 45, 295, 403);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setBackground(new Color(248, 248, 255));
		model= new DefaultTableModel();
		Object [] columns = {"Grupo", "Cantidad", "Producto"};
		final Object [] row= new Object[3];
		model.setColumnIdentifiers(columns);
		table.setModel(model);
		scrollPane.setViewportView(table);
		
		btnNewButton = new JButton("AÑADIR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
		if (grupoi.getText().equals("") || cantidad.getText().equals("") || producto.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Parece que falto de llenar una celda, intente de nuevo por favor");
		}
		else {
			row[0]= grupoi.getText();
			row[1]= cantidad.getText();
			row[2]= producto.getText();
			model.addRow(row);
		
			
			grupoi.setText("");
			cantidad.setText("");
			producto.setText("");
			
			
			
		}
				
		
			
			}
		});
		btnNewButton.setBounds(25, 200, 209, 38);
		panel.add(btnNewButton);
		
		btnNewButton_1 = new JButton("ELIMINAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i= table.getSelectedRow();
				if (i>=0) {
					model.removeRow(i);
					JOptionPane.showMessageDialog(null, "Se ha eliminado su producto");
				}
				else {
					JOptionPane.showMessageDialog(null, "Por favor indique el producto");
				}
				
			}
		});
		btnNewButton_1.setBounds(25, 249, 209, 38);
		panel.add(btnNewButton_1);
		
		
		btnNewButton_2 = new JButton("GUARDAR INFORMACIÓN");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 
				try {
	File archivoi= new File ("C:\\Users\\Fiorella\\Documents\\fiorella\\PREPA tec\\SEMESTRE 5\\INFORMATICA 5\\drafts\\mainviteandrapide_FIO\\src\\listadeingredientes\\listaingredients.txt");
			if (!archivoi.exists()) {
			archivoi.createNewFile();
			}
				
			FileWriter write= new FileWriter(archivoi.getAbsoluteFile());
			BufferedWriter bw= new BufferedWriter(write);
			
			for (int i=0; i<table.getRowCount(); i++) {
				for (int j=0; j<table.getColumnCount(); j++) {
				bw.write(table.getModel().getValueAt(i, j)+"   ");	
				}
				bw.write("\n_____________\n");
				
			}
			bw.close();
			write.close();
			JOptionPane.showMessageDialog(null, "La información ha sido guardada");
				
				}catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		
		});
		btnNewButton_2.setBounds(25, 305, 208, 38);
		panel.add(btnNewButton_2);
		
		
		
		btnNewButton_3 = new JButton("GO SHOPPING\r\n");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (java.awt.Desktop.isDesktopSupported()) {
					java.awt.Desktop desktop= java.awt.Desktop.getDesktop();
				
				if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
					try {
						java.net.URI en= new java.net.URI("https://www.heb.com.mx/");
						desktop.browse(en);
					} catch (URISyntaxException | IOException ex) {
				}
				
				}
			}
			}
		}
	);
		btnNewButton_3.setBounds(25, 410, 209, 38);
		panel.add(btnNewButton_3);
		
		lblNewLabel_1 = new JLabel("¡Crea tu lista de ingredientes!");
		lblNewLabel_1.setFont(new Font("Sitka Subheading", Font.BOLD, 22));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(95, 11, 382, 23);
		panel.add(lblNewLabel_1);
		
		btnNewButton_4 = new JButton("MAIN");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				visible1= new homE();
				visible1.setVisibility(true);
				frame.dispose();
			}
			
		});
		btnNewButton_4.setBounds(25, 361, 208, 38);
		panel.add(btnNewButton_4);
		
		lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Fiorella\\Documents\\fiorella\\PREPA tec\\SEMESTRE 5\\INFORMATICA 5\\main fondo.jpg"));
		lblNewLabel_2.setBounds(-755, -19, 1399, 832);
		panel.add(lblNewLabel_2);

		

	}
	public void setVisibility (boolean visible) {
		frame.setVisible(visible);
	}

	protected void initComponents() {
		// TODO Auto-generated method stub
		
	}
	

}

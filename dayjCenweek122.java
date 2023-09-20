package mainvite2;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class dayjCenweek122 {

	private JFrame frame;
	private int numinFormation;
	private File inFofood;
	private String image;
	private String name;
	private tablelist7 visible1;
	private homE visible2;
	
	 private static BufferedReader fileIn;
	    private static PrintWriter stdOut= new PrintWriter(System.out,true);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dayjCenweek122 window = new dayjCenweek122();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @param numinformation 
	 * @wbp.parser.entryPoint
	 */
	public dayjCenweek122 (int numinFormation) {
		switch (numinFormation) {
		
		case 1:
		this.name= "Bowl de avena y moras";
		this.inFofood= new File ("C:\\Users\\Fiorella\\Documents\\fiorella\\PREPA tec\\SEMESTRE 5\\INFORMATICA 5\\drafts\\mainviteandrapide_FIO\\src\\txt food\\bowl de avena y moras3.txt");
		this.image= "src\\internal assetment\\picture2.jpg";
		break;
		
		case 2: 
		this.name= "Pescado a la plancha";
		this.inFofood= new File ("C:\\Users\\Fiorella\\Documents\\fiorella\\PREPA tec\\SEMESTRE 5\\INFORMATICA 5\\drafts\\mainviteandrapide_FIO\\src\\txt food\\pescado a la plancha2.txt");
		this.image= "src\\internal assetment\\picture3.jpg";
		break;
		
		case 3:
		this.name= "Ensalada de huevo";
		this.inFofood= new File("C:\\Users\\Fiorella\\Documents\\fiorella\\PREPA tec\\SEMESTRE 5\\INFORMATICA 5\\drafts\\mainviteandrapide_FIO\\src\\txt food\\ensalada de huevo2.txt");
		this.image= "src\\internal assetment\\picture4.jpg";
		break;
		case 4:
			this.name= "Tostadas rice cakes";
		this.inFofood= new File ("C:\\Users\\Fiorella\\Documents\\fiorella\\PREPA tec\\SEMESTRE 5\\INFORMATICA 5\\drafts\\mainviteandrapide_FIO\\src\\txt food\\tostadas tice cakes2.txt");
		this.image="src\\internal assetment\\picture5.jpg";
		break;
			
		case 5:
			this.name= "Berenjena tatemada con pollo";
		    this.inFofood= new File("C:\\Users\\Fiorella\\Documents\\fiorella\\PREPA tec\\SEMESTRE 5\\INFORMATICA 5\\drafts\\mainviteandrapide_FIO\\src\\txt food\\berenjena tatemada con pollo2.txt");
		    break;
			
		case 6:
			this.name= "Sardinas o atún a la mexicana";
		    this.inFofood= new File("C:\\Users\\Fiorella\\Documents\\fiorella\\PREPA tec\\SEMESTRE 5\\INFORMATICA 5\\drafts\\mainviteandrapide_FIO\\src\\txt food\\sardinas o atún a la mexicana.txt");
			break;
		
		case 7:
			this.name= "Enfrijoladas de huevo";
		    this.inFofood= new File("C:\\Users\\Fiorella\\Documents\\fiorella\\PREPA tec\\SEMESTRE 5\\INFORMATICA 5\\drafts\\mainviteandrapide_FIO\\src\\txt food\\enfrijoladas de huevo2.txt");
			break;
		case 8:
			this.name= "Ensalada con milanesa";
			this.inFofood= new File("C:\\Users\\Fiorella\\Documents\\fiorella\\PREPA tec\\SEMESTRE 5\\INFORMATICA 5\\drafts\\mainviteandrapide_FIO\\src\\txt food\\ensalada con milanesa 1y2.txt");
			break;
		case 9:
			this.name= "Tostadas rice cakes";
			this.inFofood= new File("C:\\Users\\Fiorella\\Documents\\fiorella\\PREPA tec\\SEMESTRE 5\\INFORMATICA 5\\drafts\\mainviteandrapide_FIO\\src\\txt food\\tostadas tice cakes pt.2.txt");
			break;
		case 10:
			this.name= "Healthy smoothie";
	        this.inFofood= new File("C:\\Users\\Fiorella\\Documents\\fiorella\\PREPA tec\\SEMESTRE 5\\INFORMATICA 5\\drafts\\mainviteandrapide_FIO\\src\\txt food\\healthy smoothie.txt");
			break;
		case 11:
			this.name= "Tostada de jícama";
	        this.inFofood= new File ("C:\\Users\\Fiorella\\Documents\\fiorella\\PREPA tec\\SEMESTRE 5\\INFORMATICA 5\\drafts\\mainviteandrapide_FIO\\src\\txt food\\tostada de jicama.txt");
			break;
		case 12:
			this.name= "Huevos con calabacitas";
		
			break;
		
		case 13:
			this.name= "Manzanas cocidas";
		//	this.inFofood= "src\\txt food\\manzanas cocidas.txt";
			break;
		
		case 14: 
			this.name="Crema de espinaca";
			this.inFofood= new File ("C:\\Users\\Fiorella\\Documents\\fiorella\\PREPA tec\\SEMESTRE 5\\INFORMATICA 5\\drafts\\mainviteandrapide_FIO\\src\\txt food\\semana3\\crema de espinaca.txt");
			this.image= "src\\internal assetment\\picture14.jpg";
			break;
		case 15:
			this.name= "Ensalada verde con camarones";
		//	this.inFofood= "src\\txt food\\ensalada con camarones a la plancha.txt";
			break;
		case 16:
			
		case 17: 	
			this.name= "Granola de durazno";
		this.inFofood= new File ("C:\\Users\\Fiorella\\Documents\\fiorella\\PREPA tec\\SEMESTRE 5\\INFORMATICA 5\\drafts\\mainviteandrapide_FIO\\src\\txt food\\semana2\\granola de durazno2.txt");
		this.image= "src\\internal assetment\\picture16.jpg";
		break;
			
		}
		
		
		
		
		
		
		
		
		
			try {
				initialize();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
	
		
	
	

	public dayjCenweek122() {
		
		// TODO Auto-generated constructor stub
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	private void initialize() throws IOException {
		frame = new JFrame();
		frame.setBounds(100, 100, 531, 551);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblrealname = new JLabel(this.name);
		lblrealname.setHorizontalAlignment(SwingConstants.CENTER);
		lblrealname.setFont(new Font("Sitka Heading", Font.BOLD, 23));
		lblrealname.setBounds(89, 88, 336, 48);
		frame.getContentPane().add(lblrealname);
		
		JLabel lblrealimage = new JLabel("");
		lblrealimage.setBounds(0, 0, 515, 81);
		lblrealimage.setIcon(new ImageIcon(this.image));
		frame.getContentPane().add(lblrealimage);
		
		JButton btnNewButton = new JButton("MAIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			visible2= new homE();
			visible2.setVisibility(true);
			frame.dispose();
			}
		});
		btnNewButton.setBounds(354, 369, 140, 32);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnListaDelSuper = new JButton("Lista del super");
		btnListaDelSuper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			visible1= new tablelist7();
			visible1.setVisibility(true);
			}
		});
		btnListaDelSuper.setBounds(354, 420, 140, 32);
		frame.getContentPane().add(btnListaDelSuper);
		
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(UIManager.getColor("Button.background"));
		textArea.setFont(new Font("Sitka Small", Font.PLAIN, 11));
		textArea.setEditable(false);
		textArea.setBounds(10, 143, 505, 358);
		frame.getContentPane().add(textArea);
	try {
		BufferedReader reader= new BufferedReader(new FileReader(this.inFofood));
		String linea= reader.readLine();
		while (linea != null) {
			textArea.append(linea+"\n");
			linea= reader.readLine();
		}
	}catch (Exception e) {
			System.out.println("Error " + e.getMessage());
		}
		
	}
		
	

	public void setVisibility (boolean visible) {
		frame.setVisible(visible);
	}
	public void despose() {
		this.frame.dispose();
	}
}

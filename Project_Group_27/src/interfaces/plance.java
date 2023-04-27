package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.SwingConstants;


public class plance extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					plance frame = new plance();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public plance() throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1800, 1650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//contentPane.setLayout(new FlowLayout());
		contentPane.setSize(1800, 1000);
        
		 	BufferedImage bufferedImage = ImageIO.read(new File("C:/Users/Luca/Desktop/Group_27/Project_Group_27/img/17_MyShelfie_BGA/boards/livingroom.png"));
	        Image image = bufferedImage.getScaledInstance(1000, 750, Image.SCALE_DEFAULT);
	        ImageIcon icon = new ImageIcon(image);

	        JLabel jLabel = new JLabel();
	        jLabel.setBounds(292, 18, 1000, 750);
	        jLabel.setIcon(icon);
	        contentPane.add(jLabel);
	        
	        
	        BufferedImage bufferedImage1 = ImageIO.read(new File("C:/Users/Luca/Desktop/Group_27/Project_Group_27/img/17_MyShelfie_BGA/boards/bookshelf.png"));
	        Image imglibreria1 = bufferedImage1.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
	        ImageIcon l1 = new ImageIcon(imglibreria1);
	        JLabel Libreria1 = new JLabel();
	        Libreria1.setBounds(22, 568, 200, 200);
	        Libreria1.setIcon(l1);
	        contentPane.add(Libreria1);
	        
	        BufferedImage bufferedImage2 = ImageIO.read(new File("C:/Users/Luca/Desktop/Group_27/Project_Group_27/img/17_MyShelfie_BGA/boards/bookshelf.png"));
	        Image imglibreria2 = bufferedImage2.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
	        ImageIcon l2 = new ImageIcon(imglibreria2);
	        JLabel Libreria2 = new JLabel();
	        Libreria2.setBounds(1330, 115, 200, 200);
	        Libreria2.setIcon(l2);
	        contentPane.add(Libreria2);
	        
	        BufferedImage bufferedImage3 = ImageIO.read(new File("C:/Users/Luca/Desktop/Group_27/Project_Group_27/img/17_MyShelfie_BGA/boards/bookshelf.png"));
	        Image imglibreria3 = bufferedImage3.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
	        ImageIcon l3 = new ImageIcon(imglibreria3);
	        JLabel Libreria3 = new JLabel();
	        Libreria3.setBounds(1318, 568, 200, 200);
	        Libreria3.setIcon(l3);
	        contentPane.add(Libreria3);
	        
	        BufferedImage bufferedImage4 = ImageIO.read(new File("C:/Users/Luca/Desktop/Group_27/Project_Group_27/img/17_MyShelfie_BGA/boards/bookshelf.png"));
	        Image imglibreria4 = bufferedImage4.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
	        ImageIcon l4 = new ImageIcon(imglibreria4);
	        JLabel Libreria4 = new JLabel();
	        Libreria4.setBounds(0, 86, 200, 200);
	        Libreria4.setIcon(l4);
	        contentPane.add(Libreria4);
	        
	        JLabel p1 = new JLabel("Player 1");
	        p1.setHorizontalAlignment(SwingConstants.CENTER);
	        p1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	        p1.setBounds(57, 43, 104, 33);
	        contentPane.add(p1);
	        
	        JLabel p2 = new JLabel("Player 2");
	        p2.setHorizontalAlignment(SwingConstants.CENTER);
	        p2.setFont(new Font("Tahoma", Font.PLAIN, 15));
	        p2.setBounds(70, 515, 104, 33);
	        contentPane.add(p2);
	        
	        JLabel p3 = new JLabel("Player 3");
	        p3.setHorizontalAlignment(SwingConstants.CENTER);
	        p3.setFont(new Font("Tahoma", Font.PLAIN, 15));
	        p3.setBounds(1370, 55, 104, 33);
	        contentPane.add(p3);
	        
	        JLabel p4 = new JLabel("Player 4");
	        p4.setHorizontalAlignment(SwingConstants.CENTER);
	        p4.setFont(new Font("Tahoma", Font.PLAIN, 15));
	        p4.setBounds(1370, 525, 104, 33);
	        contentPane.add(p4);
	        
	        contentPane.setVisible(true);
	       // contentPane.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Image img=new ImageIcon(this.getClass().getResource("./img/17_MyShelfie_BGA/boards/livingroom.png")).getImage();
	}
}

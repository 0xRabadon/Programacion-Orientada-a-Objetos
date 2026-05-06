package dia06deMayo;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

public class MiApp extends javax.swing.JFrame {
	private JButton boton;
	public MiApp() {
		super("Mi App");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(200,300,300,200);
		this.setLayout(null);
		
		boton = new  JButton("click");
		boton.setBounds(30,50,50,30);
		boton.addActionListener(new MiActionListener());
		this.add(boton);
		
		this.setVisible(true);
		
	}
    public static void main(String[] args) {
        new MiApp();
    }
}


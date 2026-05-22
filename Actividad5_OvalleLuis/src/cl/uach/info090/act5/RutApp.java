package cl.uach.info090.act5;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;



public class RutApp {
	private Rut rut;
	public RutApp() {
}
	
	
public void initComponents() {
		
	}
public static void main(String[] args) {
		JFrame f=new JFrame();
		JTextField rutSD = new JTextField();
		f.setBounds(100, 100, 500, 300);
		f.setVisible(true);
		f.setTitle("Verificador de Rut	");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		
		JLabel instruccion = new JLabel();
		instruccion.setText("Ingresa un RUT");
		instruccion.setBounds(30,10,100,30);
		f.add(instruccion);
		
		
		
		
		//JPanel opciones = new JPanel();
		//opciones.add(new JButton("Verificar DV"));
		//opciones.add(new JTextField("12345678"));
		//opciones.add(rutSD);
		
	}

}

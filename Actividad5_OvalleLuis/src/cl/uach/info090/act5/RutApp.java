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
		
		JLabel instruccion2 = new JLabel();
		instruccion2.setText(("<html>Formatos permitidos: <br> 12345678   12345678-9   12.345.678 <br>"
				+ "12.345.678-9   12.345.678-k   12.345.678-K</html>"));
		instruccion2.setBounds(20,80,300,100);
		f.add(instruccion2);
		
		JLabel rutlisto = new JLabel();
		rutlisto.setBounds(60,76,100,25);
		f.add(rutlisto);
		
		JButton boton1 = new JButton("Verificar DV");
		boton1.setBounds(250,37,120,30);
		f.add(boton1);
		
		JTextField caja = new JTextField();
		caja.setBounds(30,38,200,30);
		f.add(caja);
		
		
		
		
		//JPanel opciones = new JPanel();
		//opciones.add(new JButton("Verificar DV"));
		//opciones.add(new JTextField("12345678"));
		//opciones.add(rutSD);
		
	}

}

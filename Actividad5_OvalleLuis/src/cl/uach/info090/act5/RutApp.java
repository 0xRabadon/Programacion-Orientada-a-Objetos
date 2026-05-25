package cl.uach.info090.act5;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public class RutApp {
	private Rut rut;
	public RutApp() {
}
	
	
public void initComponents() {
		
	}
public static void main(String[] args) {
	// Parametros ventana ven = ventana
		JFrame ven = new JFrame();
		ven.setBounds(100, 100, 500, 300);
		ven.setTitle("Verificador de Rut");
		ven.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ven.setLayout(null);
		
	// Texto
		JLabel titulo = new JLabel();
		titulo.setText("Ingresa un RUT");
		titulo.setBounds(30,10,100,30);
		
		JLabel instruccion = new JLabel();
		instruccion.setText(("<html>Formatos permitidos: <br> 12345678 ; 12345678-9 ; 12.345.678 <br>"
				+ "12.345.678-9 ; 12.345.678-k ; 12.345.678-K</html>"));
		instruccion.setBounds(20,80,300,100);
		
		JLabel rutlisto = new JLabel(); // estara oculto ya que no hay rut xd
		rutlisto.setBounds(60,76,100,25);
		
		ven.add(titulo);
		ven.add(instruccion);
		ven.add(rutlisto);
		
	// boton y caja de texto
		JButton verificar = new JButton("Verificar DV");
		verificar.setBounds(250,37,120,30);
		
		JTextField caja = new JTextField();
		caja.setBounds(30,38,200,30);
		
		ven.add(verificar);
		ven.add(caja);
		
	// Accion
		ActionListener Dv = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				rutlisto.setText("olo");
			}
		};
		
		boton1.addActionListener(Dv);
		
		ven.setVisible(true);
		
		
		
		
		//JPanel opciones = new JPanel();
		//opciones.add(new JButton("Verificar DV"));
		//opciones.add(new JTextField("12345678"));
		//opciones.add(rutSD);
		
	}

}

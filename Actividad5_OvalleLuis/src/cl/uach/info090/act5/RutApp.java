package cl.uach.info090.act5;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public class RutApp extends JFrame implements ActionListener {
	
	public RutApp() {
		setTitle("Verificador de Rut");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initComponents();
		setVisible(true);
	}
	
	
public void initComponents() {
		this.setLayout(null);
		
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
		
		this.add(titulo);
		this.add(instruccion);
		this.add(rutlisto);
		
	// boton y caja de texto
		JButton verificar = new JButton("Verificar DV");
		verificar.setBounds(250,37,120,30);
		
		JTextField caja = new JTextField();
		caja.setBounds(30,38,200,30);
		
		this.add(verificar);
		this.add(caja);
		
	// Accion
		ActionListener Dv = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				String rutCaja = caja.getText();
				Rut Rut = new Rut(rutCaja);
				rutlisto.setText(Rut.toString());
			}
		};
		
		verificar.addActionListener(Dv);
		
		
	}
public static void main(String[] args) {
		new RutApp();
	}
}

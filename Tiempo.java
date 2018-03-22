import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Tiempo extends JFrame implements ActionListener{
	private JPanel Ventana;
	private JLabel Numero;
	private JLabel Dias;
	private JLabel Horas;
	private JLabel Minutos;
	private JLabel Segundos;
	private JButton Transformar;
	private JTextField DiasTexto;
	private JTextField HorasTexto;
	private JTextField MinutosTexto;
	private JTextField SegundosTexto;
	private JTextField NumeroTexto;

	public Tiempo() {
		 Ventana= new JPanel ();
		 Ventana.setName("Calculadora de Tiempo");
		 Ventana.setSize(500,500);
		 Numero   = new JLabel ("Numero que desea cambiar");
		 Numero.setBounds(30, 10, 100, 100);
		 Ventana.add(Numero);
		 NumeroTexto = new JTextField();
		 NumeroTexto.setBounds(80, 20, 100, 100);
		 Ventana.add(NumeroTexto);
		 Dias = new JLabel ("Dias");
		 Dias.setBounds(30, 30, 100, 100);
		 Ventana.add(Dias);
		 DiasTexto = new JTextField();
		 DiasTexto.setBounds(80, 30, 100, 100);
		 Ventana.add(DiasTexto);
		 Horas = new JLabel ("Horas");
		 Horas.setBounds(80, 50, 100, 100);
		 Ventana.add(Horas);
		 HorasTexto = new JTextField();
		 HorasTexto.setBounds(80, 50, 100, 100);
		 Ventana.add(HorasTexto);
		 Minutos = new JLabel ("Minutos");
		 Minutos.setBounds(30, 70, 100, 100);
		 Ventana.add(Minutos);
		 MinutosTexto = new JTextField();
		 MinutosTexto.setBounds(80, 70, 100, 100);
		 Ventana.add(MinutosTexto);
		 Segundos = new JLabel ("Segundos");
		 Segundos.setBounds(30, 90, 100, 100);
		 Ventana.add(Segundos);
		 SegundosTexto = new JTextField();
		 SegundosTexto.setBounds(80, 90, 100, 100);
		 Ventana.add(SegundosTexto);
		 Transformar = new JButton("Transformar");
		 Transformar.setBounds(30, 50, 100, 100);
		 Ventana.add(Transformar);
		 add(Ventana);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
		 
	
	public static void main ( String [] args ){
		Tiempo Ventana = new Tiempo();
		Ventana.setVisible(true);
		Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Ventana.pack();
	}
}
import java.awt.*;
import javax.swing.*;

class VentanaInicio extends JFrame{

	public VentanaInicio() {

		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Programa GUI [Layout Nulo]");
		setSize(771,580);
		setLocationRelativeTo(null);
		
		JLabel txtTitulo = new JLabel("<html>The classic Form includes all visible fields for this list.<html>");
		txtTitulo.setBounds(27,21,230,25);
		add(txtTitulo);
		
		JLabel txtFormOptions = new JLabel("Form options");
		txtFormOptions.setBounds(27,70,77,13);
		add(txtFormOptions);
		
		JLabel txt1stCheck = new JLabel("Include the following");
		txt1stCheck.setBounds(27,93,127,13);
		add(txt1stCheck);

		JCheckBox checkTitle = new JCheckBox("a title for your form");
		checkTitle.setBounds(25, 109, 150, 20);
		add(checkTitle);
		
		JTextArea txtbMail = new JTextArea( "Subscribe to our mailing list");
		txtbMail.setBounds(27, 132, 225, 27);
		txtbMail.setLineWrap(true);
		txtbMail.setWrapStyleWord(true);
		add(txtbMail);
		
		setVisible(true);
	}
}
public class PruebaGUI {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new VentanaInicio();
			}
		});

	}

}

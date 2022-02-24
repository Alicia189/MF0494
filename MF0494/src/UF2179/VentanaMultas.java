package UF2179;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaMultas extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textNombre;
	private JTextField textApellidos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaMultas frame = new VentanaMultas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaMultas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][grow][][grow][][][]", "[][][][][][][][grow]"));
		
		JLabel lblNewLabel = new JLabel("Matr\u00EDcula:");
		contentPane.add(lblNewLabel, "cell 0 1,alignx trailing");
		
		textField = new JTextField();
		contentPane.add(textField, "cell 1 1,growx");
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		contentPane.add(lblNewLabel_1, "flowx,cell 6 1");
		
		JLabel lblNewLabel_2 = new JLabel("Apellido:");
		contentPane.add(lblNewLabel_2, "cell 0 2,alignx trailing");
		
		textNombre = new JTextField();
		contentPane.add(textNombre, "cell 6 1");
		textNombre.setColumns(10);
		
		textApellidos = new JTextField();
		contentPane.add(textApellidos, "cell 1 2 6 1,growx");
		textApellidos.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Sanci\u00F3n:");
		contentPane.add(lblNewLabel_3, "cell 0 4");
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"No llevar casco", "Conducci\u00F3n temeraria"}));
		
		contentPane.add(comboBox, "cell 1 4 6 1,growx");
		
		JLabel lblNewLabel_4 = new JLabel("Importe :");
		contentPane.add(lblNewLabel_4, "cell 0 5,alignx trailing");
		
		JLabel lblImporte = new JLabel("200 \u20AC");
		contentPane.add(lblImporte, "cell 1 5");
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String seleccionado = (String) JButton.getSelectedItem();
				JTextArea.setText("conductor :"  textNombre.getText()+/n
						"Infracción" JComboBox +/n
						"Importe :" +"pronto pago: 100 "
						);
				
				
				
			}
		});
		contentPane.add(btnNewButton, "cell 3 6");
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, "cell 3 7,grow");
	
	}

}

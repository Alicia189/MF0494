/**
 * 
 */
package controlador;

import java.util.ArrayList;

import dao.InfractorDAO;
import dao.SancionDAO;
import modelo.Sancion;
import vista.DialogoInsertarInfractor;
import vista.VentanaMostrarInfractores;
import vista.VentanaPpal;

/**
 * @author David
 *
 */
public class Controlador {

	// VEntanas del sistema
	private VentanaPpal ventanaPpal;
	private DialogoInsertarInfractor dialogoInsertarInfractor;

	
	// Objetos DAO o CRUD de la base de datos
	private SancionDAO sancionDAO;
	private InfractorDAO infractorDAO;

	
	public Controlador() {
		// Creamos las ventanas de la aplicación
		ventanaPpal = new VentanaPpal();
		dialogoInsertarInfractor = new DialogoInsertarInfractor();
		
		
		// Dando acceso al controlador desde las vistas
		ventanaPpal.setControlador(this);
		dialogoInsertarInfractor.setControlador(this);
		
		
		// Creamos los objetos DAO
		sancionDAO = new SancionDAO();
		InfractorDAO = new InfractorDAO();
		
	}
	
	public void inciarPrograma() {
		ventanaPpal.setVisible(true);
	}

	public void mostrarInsertarInfractores () {
		ArrayList<Infractor> listaInfractores = new ArrayList<Infractor>();
		listaInfractores = InfractorDAO.obtenerInfractores();
		dialogoInsertarInfractor.setListaInfractor(listaInfractor);
		dialogoInsertarInfractor.setVisible(true);
	}
	
	
}

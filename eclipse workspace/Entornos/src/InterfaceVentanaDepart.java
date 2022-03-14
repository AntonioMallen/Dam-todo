import java.awt.event.ActionEvent;

public interface InterfaceVentanaDepart {

	int modificarcambiado(ActionEvent cambio1, String NOEXISTEDEPART, String depar_error);

	void borrarcambiado(ActionEvent cambioeeee, String existedepart, String NOEXISTEDEPART, String depar_error);

	void consultcambiado(ActionEvent consulteeee, String existedepart, String NOEXISTEDEPART, String depar_error);

	void cambialta(ActionEvent e, String existedepart);

}
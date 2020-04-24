package cl.unab.imcApp;

public class Validacion {

	public static boolean esDoubleValido(String numero) {
		try {
			Double.parseDouble(numero);
			return true;
		}catch(Exception ex) {
			return false;
		}
	}
}

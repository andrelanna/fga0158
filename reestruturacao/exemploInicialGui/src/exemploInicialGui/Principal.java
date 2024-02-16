package exemploInicialGui;

public class Principal {

	static FormPrincipal form; 
	
	public static void main(String[] args) {
		try {
			form = new FormPrincipal();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

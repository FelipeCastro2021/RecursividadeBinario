package Controller;

public class RecursividadeBinario {

	public RecursividadeBinario() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public String Binario(int numero) {
		if (numero == 0) {
			return "";
		} else {
			int resto = (numero % 2);
			return (Binario(numero / 2)) + resto;
		}
	}

}

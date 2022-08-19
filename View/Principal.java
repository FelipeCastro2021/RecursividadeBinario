package View;

import Controller.RecursividadeBinario;

public class Principal {
	public static void main(String[] args) {
		RecursividadeBinario binario = new RecursividadeBinario();
		
		int numero = 20;
		
		String valorBinario = binario.Binario(numero);
		
		System.out.println(valorBinario);
	}
}

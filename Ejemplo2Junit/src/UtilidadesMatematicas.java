
public class UtilidadesMatematicas {

	public static int mayor(int numero1, int numero2) {
		int mayor;
		if (numero1 > numero2) {
			mayor = numero1;
		} else {
			mayor = numero2;
		}
		return mayor;
	}

	public static int menor(int numero1, int numero2) {
		int menor;
		if (numero1 < numero2) {
			menor = numero1;
		} else {
			menor = numero2;
		}
		return menor;
	}

	public static boolean esPrimo(int numero) {
		boolean esPrimo;
		int contador;

		esPrimo = true; /* inicialmente suponemos que es primo */
		contador = 2;

		while (contador <= numero / 2 && esPrimo == true) {
			/* contador es divisor de numero, por tanto numero ya no es primo */
			if (numero % contador == 0) {
				esPrimo = false;
			} else {
				contador++;
			}
		}

		return esPrimo;

	}
}

import java.awt.List;
import java.util.*;

public class principal{
	
	public static void main (String args[]) {
		   // nuevo comentario
			// probamos el numero - m del commit y aca lo modificamos
			//cambios de la nueva rama

		int[] myArray = { 1, 2, 2, 4, 5, 6, 7, 8, 8, 8 };
		int contador[] = new int[10];
		int aux = 0;
		for (int i = 0; i < myArray.length; i++) {

			if (myArray[i] == 1) {
				contador[0] += 1;
			} else if (myArray[i] == 2) {
				contador[1] += 1;
			} else if (myArray[i] == 3) {
				contador[2] += 1;
			} else if (myArray[i] == 4) {
				contador[3] += 1;
			} else if (myArray[i] == 5) {
				contador[4] += 1;
			} else if (myArray[i] == 6) {
				contador[5] += 1;
			} else if (myArray[i] == 7) {
				contador[6] += 1;
			} else if (myArray[i] == 8) {
				contador[7] += 1;
			} else if (myArray[i] == 9) {
				contador[8] += 1;
			} else if (myArray[i] == 10) {
				contador[9] += 1;
			}
		}
		for (int i = 0; i <= contador.length+1; i++) {

			if (contador[i] > contador[i + 1]) {

				aux = contador[i];

			}

		}
		System.out.print("Longest: " + aux);
		System.out.println();
		System.out.print("Number: 8");

	}
}
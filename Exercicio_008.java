package nivelamento.java;

import java.util.ArrayList;
import java.util.List;



public class Exercicio_008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numeros = new ArrayList<Integer>();
			for (int i=0; i<=100; i++) {
				numeros.add(i);
			}
			
					int contador;
				int  num=0;
				for (Integer i: numeros) {
					contador = 0;
					for(int u =1; u <= i; u++ ) {
						if (i % u == 0) {
							contador++;
							num= u;
							
						}
					}
					if (contador == 2) {
						System.out.println(" O numero: "+num+ " é primo e seus primos são 1 e "+ num);
					}
				}
		
	}

}

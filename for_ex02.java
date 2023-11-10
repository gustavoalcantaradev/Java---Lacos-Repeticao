package ForWhile;

import java.util.Scanner;

public class for_ex02 {

	public static void main(String[] args) {
		
		int x, num, somaPar=0, somaImpar=0;
		
		Scanner leia = new Scanner (System.in);
		
				
		for (x = 1 ; x <=10 ; x++) {
			
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			
			if ( num % 2 == 0){
				somaPar ++;
			} else {
				somaImpar++;
			}
			
		}
		
		System.out.println("Tem : " +somaPar+ "Números pares");
		System.out.println("Tem : " +somaImpar+ "Números impares");

	}

}

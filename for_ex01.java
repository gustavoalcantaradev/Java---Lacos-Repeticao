package ForWhile;

import java.util.Scanner;

public class for_ex01 {

	public static void main(String[] args) {
		
		
		int num1, num2,x;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro numero: ");
		num1 = leia.nextInt();
		System.out.println("Entre com o segundo numero: ");
		num2 = leia.nextInt();
		
		if(num1 >num2) {
			System.out.println("O intervalo é envalido: ");
		} else {
			for (x=num1 ; x<=num2 ; x++) {
				if(x %3 == 0 && x%5 == 0) {
					System.out.println("\n" +x + " é multiplo de 3 e 5");
				}
			}
		}

	}

}

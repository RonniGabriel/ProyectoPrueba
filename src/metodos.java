import java.util.Scanner;

import sun.security.krb5.internal.rcache.AuthTimeWithHash;

public class metodos {
 
	// public static void main(String[] args) {
		// TODO Auto-generated method stub

		// }

	// String cadena1;
//String cadena2;

//cadena1	= "Perro";
//cadena2 = "Perro";

//if (cadena1==cadena2){
	// 	System.out.println ("CORRECTO");
	
	// }else {
	// 			System.out.println("INCORRECTO");
			// // }
//}
//}
 
/*	public static void main(String[] args) {
		

		 
	
	int valor;
	System.out.println("Introducir un valor del 1 al 10");
	Scanner teclado=new Scanner(System.in);
	
	switch(valor){
		case 1: System.out.println("A");
		break;
		case 2: System.out.println("B");
		break;
		case 3: System.out.println("C");
		break;
		case 4: System.out.println("D");
		break;
		case 5: System.out.println("E");
		break;
		case 6: System.out.println("F");
		break;
		case 7: System.out.println("G");
		break;
		case 8: System.out.println("H");
		break;
		case 9: System.out.println("I");
		break;
		case 10: System.out.println("J");
		break;
	}
	}
	
	}
*/
	
	private static Scanner keyboard = new Scanner(System.in);
	public static int numero1,intervalo,operacion;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		operacion= numero1-intervalo;
		System.out.println("Introduce un numero");
		numero1 = keyboard.nextInt();
		System.out.println("Introduce el valor del intervalo");
		intervalo = keyboard.nextInt();
		
        for (int i=numero1;i>=0;i-=intervalo) {
        
        System.out.println("El conteo regresivo es: "+i);
        
        }
	}
}

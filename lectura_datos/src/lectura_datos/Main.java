package lectura_datos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final Scanner scan= new Scanner(System.in);
		System.out.print("NOMBRE: ");	
	    String nombre = scan.nextLine();
	    System.out.print("APELLIDO: ");
	    String apellido = scan .nextLine();
	    System.out.print("EDAD: ");
	    Integer edad = scan.nextInt();
	    scan .nextLine();
	    System.out.print("HOBBY: ");
	    String hobby = scan .nextLine();
	    System.out.print("EDITOR FAVORITO: ");
	    String editor = scan .nextLine();
	    System.out.println("NOMBRE: " +nombre +"\t APELLIDO: " +apellido +"\t EDAD: " +edad +" \t HOBBY: " + hobby +"\t EDITOR FAVORITO: " +editor);

	}

}

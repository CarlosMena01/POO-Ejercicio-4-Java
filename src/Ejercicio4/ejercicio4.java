package Ejercicio4;
import java.util.Scanner;

public class ejercicio4 {
	    public static void main(String[] args) {
	    	/*	Declaramos las variables	*/
	        int edadJuan, edadAna, edadAlberto, edadMama;
	        
	        /*	Leemos las entrados	*/
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Hola Juan, por favor ingresa tu edad: ");
	        int entrada = sc.nextInt();
	        
	        /*	Asignamos los valores según los cálculos correspondientes	*/
	        edadJuan = entrada;
	        edadAlberto = 2 * (edadJuan / 3);
	        edadAna = 4 * (edadJuan / 3);
	        edadMama = edadJuan + edadAlberto + edadAna;
	        
	        /*	Imprimimos la respuesta	*/
	        System.out.println("La edad de Alberto es: " + edadAlberto + " años");
	        System.out.println("La edad de Ana es: " + edadAna + " años");
	        System.out.println("La edad de la Mamá es: " + edadMama + " años");
	        
	        /*	Cerramos el scanner	*/
	        sc.close();
	    }
}

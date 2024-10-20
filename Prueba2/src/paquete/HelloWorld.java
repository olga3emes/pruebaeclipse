package paquete;

public class HelloWorld {
	
	public static void main(String[]args) {
		
		System.out.println("Hola Mundo!");
		
		
		//Recorremos x desde su valor 10 a 0, restando 1 en cada paso
		Integer x;
		for(x=10; x>=0;x--) {
			//Imprimimos valor de x
			System.out.println(x);
		}//End for
		//Informamos de que hemos terminado el bucle
	System.out.println("Hemos terminado el for");
		
	
	}//End main

}//End class

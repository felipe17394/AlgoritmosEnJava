/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Dado un numero 'n' identifique si es par o impar

*/

public class oddEven {   

   public static void main(String[] args) {
      int n;
	   n = Integer.parseInt(args[0]);
      	System.out.println(args[0]);

   		// si el numero es impar
		if(n%2 != 0){
   			System.out.println("numero es impar");
		}
   		// si el numero es par
		if(n%2 ==0){
   			System.out.println("numero es par");
		}
   }
}
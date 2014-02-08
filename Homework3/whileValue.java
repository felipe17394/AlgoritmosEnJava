/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Dado un numero mayor a cero, imprima el valor actual desde cero hasta antes de llegar dado valor.

*/

public class whileValue {   

   public static void main(String[] args) {
   		int n ;
		int i=0;
   		
		n = Integer.parseInt(args[0]);
		System.out.println(""+n);
		
		while(i < n){
		System.out.println("el valor actual es: "+i);
		i++;
		}
		

   		//si valor actual < args[0]
		if(n<=0){
   			System.out.println("el valor actual es: "+n);
      }
   }

}
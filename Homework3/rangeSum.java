/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:
Dados 2 numeros (limite inferior y superior), recorra el rango e imprima los numeros dentro de este rango.

*/

public class rangeSum {   

   public static void main(String[] args) {
		int limI =0;
		int limS = 0;
		limI = Integer.parseInt(args[0]);
		limS = Integer.parseInt(args[1]);
		int resultado;
		
		System.out.println("limites: "+args[0]+" "+args[1]);

      
        for(int i = (limI +1); i< limS; i++){
		 System.out.println("numero actual es:"+i );
		}
      
   }

}
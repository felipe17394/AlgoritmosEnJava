/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Despliege la multiplicacion desde 0 hasta un valor 'n' dado.
Ej:
Si si ingresa 6
mostrar
1x2x3x4x5x6=720

*/

public class productToNumber {   

   public static void main(String[] args) {
   	 int n, respuesta =1;
	 String cadena= "";
	 n = Integer.parseInt(args[0]);
	 
   		System.out.println(args[0]);
	for(int i= 1; i<(n+1); i++){
		if(i<n){
		cadena = cadena+ i + "X";	
		respuesta = respuesta *i;
		
		} else {
		cadena = cadena+i;
		respuesta = respuesta *i;
		}

   		
      
   }
		System.out.println("el producto es: "+cadena+"="+respuesta );
}
}
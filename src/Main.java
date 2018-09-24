import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 
		  
	    //Scanner in = new Scanner((System.in));
	    Matriz a= new Matriz(200);
	    
	    
	    Hormiga h= new Hormiga ( 80, 23);
	    for (int t=0; t<16000; t++){

		    h.accion(a, h);
		  

	    }
	    a.show();
	  
	    
	    
	    
	    
	    
	    
	    
	    
	    
/**
 * 
 Si est ́a sobre un cuadrado blanco, cambia el color del cuadrado, gira noventa grados a la derecha y avanza un cuadrado.
2. Si esta ́ sobre un cuadrado negro, cambia el color del cuadrado, gira noventa grados a la izquierda y avanza un cuadrado.

 * 
 * */

	    
		// TODO Auto-generated method stub

	}

}

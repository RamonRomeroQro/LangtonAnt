/**
 * 
 Si est ́a sobre un cuadrado blanco, cambia el color del cuadrado, gira noventa grados a la derecha y avanza un cuadrado.
2. Si esta ́ sobre un cuadrado negro, cambia el color del cuadrado, gira noventa grados a la izquierda y avanza un cuadrado.

 * 
 * */



public class Abajo implements Estado {

		
		
		@Override
		public void accion(Matriz a, Hormiga h) {
		
			if(a.getMulti()[h.x][h.y]==1){
				a.getMulti()[h.x][h.y]=0;
				h.setCurrent(h.viendoIzquierda);
				h.x=(((h.x-1)%a.dimension)+a.dimension)%a.dimension;
				
				
				
			}
			
			else if(a.getMulti()[h.x][h.y]==0){
				
				a.getMulti()[h.x][h.y]=1;
				h.setCurrent(h.viendoDerecha);
				h.x=(((h.x+1)%a.dimension)+a.dimension)%a.dimension;
				
			}
			// TODO Auto-generated method stub
		
		
		
		// TODO Auto-generated method stub

	}

}


public class Matriz {
	
	    public int[][] multi;
	    public int dimension;
	    
	    public Matriz (int size){
	    	dimension=size;
	    	multi= new int[dimension][dimension];
	    	for (int i=0; i<dimension; i++){
	    		for(int j=0; j<dimension; j++){
	    			multi[j][i]=0;
	    			
	    		}
	    	}
	    	
	    }

		public int[][] getMulti() {
			return multi;
		}

		public void setMulti(int[][] multi) {
			this.multi = multi;
		}
		
		public void show(){
			for (int i=0; i<dimension; i++){
	    		for(int j=0; j<dimension; j++){
	    			System.out.print(multi[j][i]);
	    			
	    		}
    			System.out.println();

	    	}
		}
	    

}

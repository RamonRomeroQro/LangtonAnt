
public class Hormiga {
	
	public Estado viendoDerecha= new Derecha();
	public Estado viendoIzquierda= new Izquierda();
	public Estado viendoAbajo= new Abajo();
	public Estado viendoArriba= new Arriba();
	public Estado current=viendoArriba;

	public int x;
	public int y;
	
	
	public Hormiga(int nx, int ny){
		this.x=nx;
		this.y=ny;
	}
	
	public void  accion (Matriz a , Hormiga h){
		this.current.accion(a, this);
	}
	
	
	public Estado getViendoDerecha() {
		return viendoDerecha;
	}
	public Estado getViendoIzquierda() {
		return viendoIzquierda;
	}
	public Estado getViendoAbajo() {
		return viendoAbajo;
	}
	public Estado getViendoArriba() {
		return viendoArriba;
	}
	public Estado getCurrent() {
		return current;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setViendoDerecha(Estado viendoDerecha) {
		this.viendoDerecha = viendoDerecha;
	}
	public void setViendoIzquierda(Estado viendoIzquierda) {
		this.viendoIzquierda = viendoIzquierda;
	}
	public void setViendoAbajo(Estado viendoAbajo) {
		this.viendoAbajo = viendoAbajo;
	}
	public void setViendoArriba(Estado viendoArriba) {
		this.viendoArriba = viendoArriba;
	}
	public void setCurrent(Estado current) {
		this.current = current;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	
	


}

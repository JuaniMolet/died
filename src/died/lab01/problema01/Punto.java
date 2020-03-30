/**
 * 
 */
package died.lab01.problema01;

/**
 * @author USUARIO
 *
 */
public class Punto {
	
	public float x;
	public float y;


//CONSTRUCTOR.
	public Punto (float x, float y) {
	this.x = x;
	this.y = y;
	}

//METODOS.
public float getX() {
	return x;
}

public float getY() {
	return y;
}

public void setX(float x) {
	this.x = x;
}

public void setY(float y) {
	this.y = y;
}

public boolean equals(Object otroPunto) {
	if(otroPunto instanceof Punto){
		if(this.equals(otroPunto)) {
			return true;
		}
	}
	return false;
}



}


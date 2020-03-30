package died.lab01.problema01;

public class Recta {

	public Punto p1;
	public Punto p2;
	public float pendiente;
	
	
//CONSTRUCTORES.
	public Recta (Punto c1, Punto c2) {
		this.p1 = c1; //Origen.
		this.p2 = c2; //Cola.
		this.pendiente = ((p2.y)-(p1.y))/((p2.x)-(p1.x)); 
	}
	
	public Recta () {
		this.p1 = this.p2;
		this.pendiente = 1;
	}
	
//METODOS.

	public Punto getP1() {
		return p1;
	}

	public void setP1(Punto p1) {
		this.p1 = p1;
	}

	public Punto getP2() {
		return p2;
	}

	public void setP2(Punto p2) {
		this.p2 = p2;
	}
	
	public float pendiente(Recta r) {
		return r.pendiente;
	}
	
	public boolean paralelas(Recta otraRecta) {
		if(this.pendiente == otraRecta.pendiente) {
			return true;
		}
		return false;
	}
	
	public boolean equals(Object otraRecta) {
		if(otraRecta instanceof Recta) {
			Recta c1 = new Recta(((Recta) otraRecta).p1, this.p1);
			if((c1.pendiente == this.pendiente) && (c1.pendiente == ((Recta)otraRecta).pendiente)) {
				return true;
			}
		}
		return false;
	}
	
	
}

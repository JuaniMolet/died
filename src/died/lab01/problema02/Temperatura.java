package died.lab01.problema02;

public class Temperatura {
	
	public double grados;
	public Escala escala;
	
	//CONSTRUCTORES.
	public Temperatura () {
		this.grados = 0;
		this.escala = Escala.CELCIUS; 
	}
	public Temperatura (double grad, Escala esc){
		this.grados = grad;
		this.escala = esc;
	}
	
	//METODOS.
	//a)
	@Override
	public String toString() {
		String s1 = new String();
		
		switch (this.escala) {
		case CELCIUS: 
			s1 = ("" + (this.grados) + " " + "C°");
			break;
		case FAHRENHEIT: 
			s1 = ("" + (this.grados) + " "+"F°");
			break;
		}
		return s1;
	}
	
	//b)
	public double asCelcius() {
		double g = this.grados;
		switch (this.escala) {
		case FAHRENHEIT: 
		g = ((g - 32d)*(5d/9d));
		break;
		}
		return g;
	}
	//c)
	public double asFahrenheit() {
		double g = this.grados;
		switch (this.escala) {
		case CELCIUS: 
		g = (g*(9d/5d))+32;
		break;
		}
		return g;
	}
	
	//d)
	//Aumentar.
	public void aumentar(Temperatura unaTemperatura) {
		if(unaTemperatura.grados == 0.0) {
			System.out.println("La temperatura ingresada no puede ser 0");
		}
		else {
		
		switch (this.escala) {
			case CELCIUS: 
				switch (unaTemperatura.escala) {
					case CELCIUS:
					this.grados = this.grados + unaTemperatura.grados;
					break;
					case FAHRENHEIT:
					this.grados = this.grados + unaTemperatura.asCelcius();
					break;
				}
			break;
			case FAHRENHEIT: 
				switch (unaTemperatura.escala) {
				case CELCIUS:
				this.grados = this.grados + unaTemperatura.asFahrenheit();
				break;
				case FAHRENHEIT:
				this.grados = this.grados + unaTemperatura.grados;
				break;
			}
			break;
		}
	  }
	}
	//Disminuir.
	public void disminuir(Temperatura unaTemperatura) {
		if(unaTemperatura.grados == 0.0) {
			System.out.println("La temperatura ingresada no puede ser 0");
		}
		else {
		switch (this.escala) {
			case CELCIUS: 
				switch (unaTemperatura.escala) {
					case CELCIUS:
					this.grados = this.grados - unaTemperatura.grados;
					break;
					case FAHRENHEIT:
					this.grados = this.grados - unaTemperatura.asCelcius();
					break;
				}
			break;
			case FAHRENHEIT: 
				switch (unaTemperatura.escala) {
				case CELCIUS:
				this.grados = this.grados - unaTemperatura.asFahrenheit();
				break;
				case FAHRENHEIT:
				this.grados = this.grados - unaTemperatura.grados;
				break;
			}
			break;
		}
	  }
	}
}

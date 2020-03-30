package died.lab01.problema03;

import died.lab01.problema02.Escala;
import died.lab01.problema02.Temperatura;

public class Registro {
	private String ciudad;
	private Temperatura[] historico;
	private int indiceUltimoElemento;
	private int capacidadRestante;
	
	//CONSTRUCTORES.
	public Registro() {
		ciudad = "-";
		historico = new Temperatura[30];
		indiceUltimoElemento = 0;
		capacidadRestante = 30;
	}
	
	public Registro(String unaCiudad) {
		ciudad = unaCiudad;
		historico = new Temperatura[30];
		indiceUltimoElemento = 0;
		capacidadRestante = 30; 
	}
	
	//METODOS.
	
	//getCiudad()
	public String getCiudad() {
		return ciudad;
	}
	
	//imprimir indiceUltimoElemento();
	public void imprimirIndiceUltimoElemento() {
		System.out.println("El indice donde esta el ultimo elemento es: " +this.indiceUltimoElemento);
	}
	
	//imprimir capacidadRestante();
	public void imprimirCapacidadRestante() {
		System.out.println("La capacidad restante es: " +this.capacidadRestante);
	}
	
	//imprimir();
	public void imprimir() {
		System.out.println("TEMPERATURAS REGISTRADAS EN: "+ this.getCiudad());
		for(int i = 0; i<indiceUltimoElemento; i++) {
			System.out.println((i+1) +" "+ historico[i].toString());
		}
	}
	
	//agregar();
	public void agregar(Temperatura unaTemp) {
		if(capacidadRestante>0) {
			historico[indiceUltimoElemento] = unaTemp;
			indiceUltimoElemento++;
			capacidadRestante--;
		}
	}
	
	//mediaAsCelcius();
	public double mediaAsCelcius(){
		int cantC = 0;
		double tempC = 0.0;
		for(int i=0; i<indiceUltimoElemento; i++) {
			switch (historico[i].escala) {
			case CELCIUS:
				tempC += historico[i].grados;
				cantC++;
				break;
			}
		}
		return tempC/cantC;
	}
	
	//mediaAsFahrenheit();
	public double mediaAsFahrenheit() {
		int cantF = 0;
		double tempF = 0.0;
		for(int i=0; i<indiceUltimoElemento; i++) {
			switch (historico[i].escala) {
			case FAHRENHEIT:
				tempF += historico[i].grados;
				cantF++;
				break;
			}
		}
		return tempF/cantF;
	}
	
	//Temperatura Maxima.
	public Temperatura temperaturaMaxima() {
		int indice = this.retornarIndice();
		return historico[indice];
	}
	
	//Retornar indice de maxima temperatura en una sola escala.
	public int retornarIndice() {
		double[] b = new double[indiceUltimoElemento];
		double tMax = 0;
		int indice = 0;
		for(int i = 0; i<indiceUltimoElemento; i++) {
			b[i] = historico[i].asCelcius();
		}
		
		tMax = b[0];
		for(int j = 1; j<indiceUltimoElemento; j++) {
			if(tMax < b[j]) {
				tMax = b[j];
				indice = j;
			}
		}
		return indice;
	}
	
}

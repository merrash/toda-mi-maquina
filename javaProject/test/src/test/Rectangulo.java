package test;

public class Rectangulo {
	private double base = 0;
	private double altura = 0;
	
	//Método que dado el radio calcula el area de un rectangulo. {
	
		public double area() {

		double result;

		//result = altura*base;
		result = this.getAltura()*this.getBase();

		return result;
	}

	//Método que dado el radio calcula el area de un círculo. {
	
		public double perimetro() {

		double result;

		result = this.getAltura()*2+this.getBase()*2;

		return result;
	}

	public double getAltura() {

		return altura;
	}	

	public void setAltura(double alt) {

		altura = alt;
	} 
	public double getBase() {

		return base;
	}	

	public void setBase(double bas) {

		base = bas;
	} 

}

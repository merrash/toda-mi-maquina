import java.util.Scanner;

public class OperacionesCirculo {

	
	public static void main(String[] args) {
		
		double radio, resultadoArea, resultadoCircunferencia;
		Circulo operaciones = new Circulo();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\ningresa el radio: ");
		radio = sc.nextDouble();

		resultadoArea = operaciones.area(radio);		
		resultadoCircunferencia = operaciones.circunf(radio);

		System.out.println("\nEl resultado AREA es: " + resultadoArea);
		System.out.println("\nEl resultado CIRCUNFERENCIA es: " + resultadoCircunferencia);
		
		
		System.out.println("\n\nCORRECTO!!\n");
	}

}

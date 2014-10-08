import java.util.Scanner;
import com.zubiri.geometria.Circulo;
import com.zubiri.geometria.Rectangulo;
public class OperacionesGeometricas {
	

	public static void main(String[] args) {
		System.out.print("\Buenos dias");	
				
		String opcion		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nElige una opcion: Circulo o Rectangulo");
		opcion = sc.nextInt();		
		
		if (opcion.equalsIgnoreCase("Circulo") == 1)
		
		{
		double radio, result
		Circulo circulo = new Circulo();
		
		System.out.print("\ningresa el radio: ");
		radio = sc.nextDouble();

		circulo.SetRadio(radio);		
		result = circulo.circunferencia();
		System.out.println("\nEl resultado CIRCUNFERENCIA es: " + result);
		
		result = circulo.area();
		System.out.println("\nEl resultado AREA es: " + result);

		}

		else 
		{
			double altura, base, result;
			Rectangulo operaciones = new Rectangulo();
		
			System.out.print("\ningresa altura rectangulo: ");
			altura = sc.nextDouble();
			
		
			System.out.print("\ningresa base: ");
			base = sc.nextDouble();
			
			rectangulo.setAltura(altura);
			rectangulo.setBase(base);
			
			result = rectangulo.area();
			System.out.println("\nEl resultado AREA es: " + resultadoArea);
			
			result = rectangulo.perimetro();
			System.out.println("\nEl resultado PERIMETRO es: " + resultadoPerimetro);
		
			}
		
		}
	}	
				
		

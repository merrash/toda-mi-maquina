import java.util.Scanner;
import com.zubiri.Geometria.*;
public class OperacionesGeometricas {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nPara operaciones circulo escriba 1 y para operaciones rectangulo escriba 2");
		operaciones = sc.nextInt();		
		
		if (operaciones == 1){
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

			}else if (operaciones == 2){
			double altura, base, resultadoArea, resultadoPerimetro;
			Rectangulo operaciones = new Rectangulo();
		
			Scanner sc = new Scanner(System.in);
			System.out.print("\ningresa altura: ");
			altura = sc.nextDouble();
			operaciones.setAltura(altura);
		
			System.out.print("\ningresa base: ");
			base = sc.nextDouble();
			operaciones.setBase(base);

			resultadoArea = operaciones.area();		
			resultadoPerimetro = operaciones.perimetro();

			System.out.println("\nEl resultado AREA es: " + resultadoArea);
			System.out.println("\nEl resultado PERIMETRO es: " + resultadoPerimetro);
		
		
			System.out.println("\n\nLO HAS CONSEGUIDO!!\n");
				}
		else {
			System.out.print("\nDebe teclear uno de los numeros indicados");
			}
		}
	}	
				
		

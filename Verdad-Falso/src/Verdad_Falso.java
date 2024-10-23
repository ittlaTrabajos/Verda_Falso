import java.util.Scanner;

public class Verdad_Falso {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double n,d,p;
		boolean j;
		
		System.out.println("Ingresa un valor para n");
		n= entrada.nextDouble();
		
		System.out.println("Ingresa un valor para d");
		d= entrada.nextDouble();
		
		p=(n%d);
		
		j= p==0;
		System.out.println("el resultado es "+p);
		System.out.println("el resultado es "+j);
		
		
	}

}

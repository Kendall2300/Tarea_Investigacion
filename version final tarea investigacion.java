import java.util.Scanner;
public class main{
		public static void main (String[] args) {
			Scanner entrada=new Scanner(System.in);


			//seno
			if(/* Ingrese aqui la variable obtenida de la entrada*/!=/* Aqui el numero que escogio para decir que es sin*/  ){
				System.out.print("Ingrese el valor en Grados");
				double angulo_sin=entrada.nextDouble();
				double resultado_sin=Math.sin(angulo_sin);
				System.out.print("El seno de: " + angulo_sin + " es: " + resultado_sin);
			}

			//coseno
			if(/* Ingrese aqui la variable obtenida de la entrada*/!=/* Aqui el numero que escogio para decir que es cos*/  ){
				System.out.print("Ingrese el valor en Grados");
				double angulo_cos=entrada.nextDouble();
				double resultado_cos=Math.cos(angulo_cos);
				System.out.print("El coseno de: " + angulo_cos + " es: " + resultado_cos);
			}

			//]tangente
			if(/* Ingrese aqui la variable obtenida de la entrada*/!=/* Aqui el numero que escogio para decir que es tan*/  ){
				System.out.print("Ingrese el valor en Grados");
				double angulo_tan=entrada.nextDouble();
				double resultado_tan=Math.tan(angulo_tan);
				System.out.print("El tangente de: " + angulo_tan + " es: " + resultado_tan);
			}
		}
}
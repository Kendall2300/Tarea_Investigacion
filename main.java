import java.util.Scanner;
public class main{
		public static void main (String[] args) {
			Scanner entrada=new Scanner(System.in);


			//arc seno
			if(/* Ingrese aqui la variable obtenida de la entrada*/!=/* Aqui el numero que escogio para decir que es arcsin*/  ){
				System.out.print("Ingrese el valor en Grados");
				double angulo_arcsin=entrada.nextDouble();
				double resultado_arcsin=Math.asin(angulo_arcsin);
				System.out.print("El arco seno de: " + angulo_arcsin + " es: " + resultado_arcsin);
			}

			//arco coseno
			if(/* Ingrese aqui la variable obtenida de la entrada*/!=/* Aqui el numero que escogio para decir que es arccos*/  ){
				System.out.print("Ingrese el valor en Grados");
				double angulo_arccos=entrada.nextDouble();
				double resultado_arcsin=Math.acos(angulo_arccos);
				System.out.print("El arco coseno de: " + angulo_arccos + " es: " + resultado_arccos);
			}

			//arco tangente
			if(/* Ingrese aqui la variable obtenida de la entrada*/!=/* Aqui el numero que escogio para decir que es arctan*/  ){
				System.out.print("Ingrese el valor en Grados");
				double angulo_arctan=entrada.nextDouble();
				double resultado_arctan=Math.asin(angulo_arctan);
				System.out.print("El arco tangente de: " + angulo_arctan + " es: " + resultado_arctan);
			}
		}
}
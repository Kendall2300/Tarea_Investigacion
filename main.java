import java.util.Scanner;
public class main{
	public static void main(String[] args) {
            Scanner entrada=new Scanner(System.in);
            /*Men tiene que agarrar esto, cada if esta separado por comentarios. 
            Hice una variable especifica para cada uno, hay que terminar las condiciones
            para que funcione correctamente, le puse en comentado mas o menos lo que hay que escribir
            si considera necesario hacer paso de radianes a grados use el "Math.toDegrees(aqui la variable)"
            */
            //Seno hiperbolico
            
            if(/* Ingrese aqui la variable obtenida de la entrada*/!=/* Aqui el numero que escogio para decir que es sinh*/  ){
                System.out.print("Ingrese el valor en grados");
                double angulo_sinh=entrada.nextDouble();
                double resultado_sinh=Math.sinh(angulo_sinh);
                System.out.println("El seno hiperbolico de: "+angulo_sinh+" es: "+resultado_sinh);
            }
            //Coseno hiperbolico
            if (/* Ingrese aqui la variable obtenida de la entrada*/!=/* Aqui el numero que escogio para decir que es cosh*/){
                System.out.print("Ingrese el valor en grados");
                double angulo_cosh=entrada.nextDouble();
                double resultado_cosh=Math.cosh(angulo_cosh);
                System.out.println("El coseno hiperbolico de: "+angulo_cosh+" es: "+resultado_cosh);
            }
            //Tangente hiperbolica
            if (/* Ingrese aqui la variable obtenida de la entrada*/!=/* Aqui el numero que escogio para decir que es tanh*/){
                System.out.print("Ingrese el valor en grados");
                double angulo_tanh=entrada.nextDouble();
                double resultado_tanh=Math.tanh(angulo_tanh);
                System.out.println("La tangente hiperbolica de: "+angulo_tanh+" es: "+resultado_tanh);
            }
	}
}
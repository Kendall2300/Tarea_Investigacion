import java.util.Scanner;
public class main{
	public static void main(String[] args) {
            Scanner entrada=new Scanner(System.in);
            /*Men tiene que agarrar esto, cada if esta separado por comentarios. 
            Hice una variable especifica para cada uno, hay que terminar las condiciones
            para que funcione correctamente, le puse en comentado mas o menos lo que hay que escribir
            si considera necesario hacer paso de radianes a grados use el "Math.toDegrees(aqui la variable)"
            */

            System.out.println("Ingrese el numero que es respectivo a la operacion trigonometrica que desee:");
            System.out.println("1. seno (sin)");
            System.out.println("2. coseno (cos)");
            System.out.println("3. tangente (tan)");
            System.out.println("4. operacion inversa sobre seno (arcsin)");
            System.out.println("5. operacion inversa sobre coseno (arccos)");
            System.out.println("6. operacion inversa sobre tangente (arctan)");
            System.out.println("7. operacion hiperbolica sobre seno (sinh)");
            System.out.println("8. operacion hiperbolica sobre coseno (cosh)");
            System.out.println("9. operacion hiperbolica sobre tangente (tanh)");


            int op_trigonom = myObj.nextLine();

            //Seno hiperbolico
            
            if(op_trigonom == 7 ){

                System.out.print("Ingrese el valor en grados");
                double angulo_sinh = entrada.nextDouble();
                double resultado_sinh = Math.sinh(angulo_sinh);
                System.out.println("El seno hiperbolico de: "+angulo_sinh+" es: "+resultado_sinh);
            }
            //Coseno hiperbolico
            if (op_trigonom== 8){
                System.out.print("Ingrese el valor en grados");
                double angulo_cosh=entrada.nextDouble();
                double resultado_cosh=Math.cosh(angulo_cosh);
                System.out.println("El coseno hiperbolico de: "+angulo_cosh+" es: "+resultado_cosh);
            }
            //Tangente hiperbolica
            if (op_trigonom== 9){
                System.out.print("Ingrese el valor en grados");
                double angulo_tanh=entrada.nextDouble();
                double resultado_tanh=Math.tanh(angulo_tanh);
                System.out.println("La tangente hiperbolica de: "+angulo_tanh+" es: "+resultado_tanh);
            }
	}
}
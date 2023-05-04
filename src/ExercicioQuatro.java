import java.util.Scanner;

public class ExercicioQuatro {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero ");
        int numero = scanner.nextInt();
        double polegadas = 0.0254;
        double resultado = numero * polegadas;

        System.out.println(" O resultado e " + resultado + " Polegadas" );



    }
}

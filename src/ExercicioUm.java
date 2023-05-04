import java.util.Scanner;

public class ExercicioUm {
        public static boolean todosDigitosPares(int num) {
            while (num > 0) {
                int digito = num % 10;
                if (digito % 2 != 0) {
                    return false;
                }
                num /= 10;
            }
            return true;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int num1 = scanner.nextInt();
            boolean resultado1 = todosDigitosPares(num1);
            System.out.println(resultado1);


            int num2 = scanner.nextInt();
            boolean resultado2 = todosDigitosPares(num2);
            System.out.println(resultado2);


        }
    }




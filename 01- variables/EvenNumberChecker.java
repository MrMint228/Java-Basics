import java.util.Scanner;

/**
 * EvenNumberChecker - программа для проверки чётности чисел.
 * Поддерживает положительные, отрицательные числа и ноль
 * с проверкой корректности ввода.
 */

public class EvenNumberChecker {
    public static void main(String[] args){

        System.out.println("Введите число для проверки чётности: ");

        Scanner scan = new Scanner(System.in);

        if(scan.hasNextInt()){
            int number = scan.nextInt();
            if (number == 0)
                System.out.println("Вы ввели 0, он не подходит");
            else if (number < 0){
                if(number % 2 == 0) {
                System.out.println("Число чётное, но отрицательное, оно делиться на 2");

            }   else {
                    System.out.println("Число отрицательное, нечётное, оно не делится на 2");
                }

            } else {
                if (number % 2 == 0) {
                    System.out.println("Число чётное, оно делиться на 2");

                } else
                    System.out.println("Число нечётное, оно не делится на 2");
            }
        } else System.out.println("Ошибка, число вообще не целое");

        scan.close();

    }
}

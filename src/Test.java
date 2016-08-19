import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

    public static void main(String[] argv) {

        Integer[] arr = new Integer[10];
        Scanner input = new Scanner(System.in);


        for (int i = 0; i < arr.length; i++) {
            boolean notError = true;


                try {
                    System.out.print("#" + i + ": ");
                    arr[i] = input.nextInt();



                } catch (InputMismatchException e) {
                    System.out.println("Введены некоректные данные");
                }finally {
                    throw new IllegalStateException();
                }

        }






            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);

            }
    }
}


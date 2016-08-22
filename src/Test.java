import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

    public static void main(String[] argv) {
        ArrayList<String> name = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        try {
            while (exit == false) {
                System.out.print("Введите имя ");
                name.add(input.next());

               if ((name.get(name.size() - 1).compareTo("00") == 0) ) {
                   System.out.println("Ввод завершен");
                    exit = true;


                } else {if (name.get(name.size() - 1).matches("(.*[0-9].*)")){
                    name.remove(name.size() - 1);
                   System.out.println("Имя не может содержать цифр");

                    /*if (name.get(name.size() - 1).indexOf('9') >= 0 ) {
                       name.set(i, name.get(i).replaceAll("[^0-9]+", " "));
                   System.out.println("Имя не может содержать цифр");
                   exit = true;*/
                    /*name.set(i,name.get(i).replaceAll(".*[0-9].*",(name.get(i))))*/
               } else{

                   System.out.print("Введите возраст ");
                   age.add(input.nextInt());}



               }



               }
        } catch (InputMismatchException e) {
            System.out.println("Введены некоректные данные");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Ввод завершен");
        }

        name.remove(name.size() - 1);

            try {
                name.size();
                for (int i =0; i<name.size(); ++i)  {

                    System.out.println(" Имя:  " + name.get(i)  + "     Возраст:  " + age.get(i) );
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Нету данных");
            }
    }
}

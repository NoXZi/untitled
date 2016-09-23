import java.util.*;
import  java.util.regex.Pattern;
import  java.util.regex.Matcher;
import java.util.Stack;
import java.util.Stack;
import java.lang.Enum;
import java.util.Scanner;

public class Test {

       /* ArrayList<String> name = new ArrayList<>();
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
                    *//*if (name.get(name.size() - 1).indexOf('9') >= 0 ) {
                       name.set(i, name.get(i).replaceAll("[^0-9]+", " "));
                   System.out.println("Имя не может содержать цифр");
                   exit = true;*//*
                    *//*name.set(i,name.get(i).replaceAll(".*[0-9].*",(name.get(i))))*//*
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
            }*/




        /*for (int i =  a.length() - 1;  i>=0; i--) {

            System.out.print(a.charAt(i));
        }*/
       /* for ( i = 0; i < a.length(); ++i) {
            if (a.charAt(i) != a.charAt(a.length() - i - 1)) {



            }


        }*/





            /**
             * Переворот слова с использованием временной переменной размерности Char
             *
             * @param str Строка для перевертывания, переданная по ссылке
             * @param index1 Индекс первого символа
             * @param index2  Индекс второго символа
             */
            private static void swap_withTmp(StringBuilder str, Integer index1, Integer index2) {
                System.out.println("Swap: " + index1 + "(" + str.charAt(index1) + ") & " + index2 + "(" + str.charAt(index2) + ")");
                Character tmpChar = str.charAt(index2); // Во временную переменную помещаем символ по инлексу второго символа
                str.setCharAt(index2, str.charAt(index1)); // Меняем второй символ на первый
                str.setCharAt(index1, tmpChar); // Устанавливаем по индексу первого символа, сохраненный второй символ
            }

            /**
             * Переворот слова без использования временной переменной
             *
             * @param str Строка для перевертывания, переданная по ссылке
             * @param index1 Индекс первого символа
             * @param index2  Индекс второго символа
             */
            private static void swap_withoutTmp(StringBuilder str, Integer index1, Integer index2) {
                System.out.println("Swap: " + index1 + "(" + str.charAt(index1) + ") & " + index2 + "(" + str.charAt(index2) + ")");
                str.insert(index2.intValue() + 1, str.charAt(index1)); // Вставляем первый символ по индексу второго символа + 1
                str.setCharAt(index1, str.charAt(index2)); // Устанавливаем вместо первого символва - второй
                str.deleteCharAt(index2); // Удаляем второй символ по его индексу
            }

            public static void main(String[] argv) {
                Scanner scan = new Scanner(System.in);
                //StringBuilder someStr = new StringBuilder("Соловецкие острова это наш выбор!");
                StringBuilder someStr = new StringBuilder(scan.nextLine());
                Integer index = 0;
                System.out.println("Фраза (слово) для перевертыша: " + someStr);
                System.out.println("Всего символов во фразе (слове): " + someStr.length());

                while (index < someStr.length() / 2) {
                    System.out.print(index + ": ");
                    swap_withTmp(someStr, index, someStr.length() - index - 1);
                    //swap_withoutTmp(someStr, index, someStr.length() - index - 1);
                    System.out.println(someStr);
                    ++index;
                }

            }
        }




        /*boolean hasSurrogates = false;
        int n = count - 1;
        for (int j = (n-1) >> 1; j >= 0; j--) {
            int k = n - j;
            char cj = value[j];
            char ck = value[k];
            value[j] = ck;
            value[k] = cj;
            if (Character.isSurrogate(cj) ||
                    Character.isSurrogate(ck)) {
                hasSurrogates = true;
            }
        }
        char[] value;
        for (int i = 0; i < a.length() - 1; i++) {

            char c2 = value[i];
            if (Character.isLowSurrogate(c2)) {
                char c1 = value[i + 1];
                if (Character.isHighSurrogate(c1)) {
                    value[i++] = c1;
                    value[i] = c2;
                }
            }
        }
*/


        /*String b = "";

        for (int i = a.length() - 1; i >= 0; i--) {
            b += a.charAt(i);
        }
        System.out.println("Оригинальное слово:  " + a + "\nПеревернутое слово:  " + b);*/


      /*  String c = "собака была со мною и соответственно ничего не съела";
            Integer y = c.indexOf(".*(со).*");
            System.out.println("\nКоличество слогов со: "+y);*/

        /*String txt = "собака была со мною и соответственно ничего не съела";
        HashMap<Character, Integer> map = new HashMap<Character, Integer>(40);
        for (int i = 0; i < txt.length(); ++i) {
            char c = txt.charAt(i);
            // если надо, то проверяем является ли символ буквой
            if (Character.isLetter(c)) {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
        }

        System.out.println("\nКоличество слогов со: "+map.get('c'));*/


     /*   Pattern pattern = Pattern.compile("со+");
        String s = "собака была со мною и соответственно ничего не съела";
        System.out.println("\nCтрока:  "+s);
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println("\nНайден слог: " + matcher.group());
            System.out.println("Начальная позиция: " + matcher.start());
            System.out.println("Конечная позиция: " + matcher.end());
        }

        Integer w=0;
        for (int g = 0; i < s.length(); g++) {
            String t = "со";
            if (s.codePointAt(g)=='о' )  w++;

            }
        System.out.println("\nКоличество букв о:  "+ w);

*/









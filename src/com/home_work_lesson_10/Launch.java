package com.home_work_lesson_10;
import com.home_work_lesson_10.arraylist.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.stream.StreamSupport;

public class Launch {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.println("Хотите добавить свои элементы в коллекцию?");
        System.out.println("ответьте yes/no:");
        String answer =s.next();


        if (answer.equals("yes")){
            System.out.println("Какое количество? ");
            System.out.println("Введите целое число: ");
            int i=s.nextInt();
            System.out.println("Вводите коллекцию:");
            for (int j = 0; j<i; j++){

                strings.add(s.next());
            }
        }else if (answer.equals("no")){
            System.out.println("Жаль что ты не поработаешь своими ручками :(");
            System.out.println("Загружаю.....");
            System.out.println();
        }
        s.close();


        strings.add("GAV1");
        strings.add("GAV2");
        strings.add("GAV3");
        strings.add("Lukoil");
        strings.add("GAV3^3");
        strings.add("GAV3%");
        strings.add("Tom");
        strings.add("Alice");
        strings.add("Kate");
        strings.add("Egor");
        strings.add("Andrei");
        strings.add("Kamaz");


        Iterator<String> sourceIterator = strings.iterator();
        Iterable<String> iterable = () -> sourceIterator;
        String last = StreamSupport.stream(iterable.spliterator(), false)     ///находим последний элемент нашей коллекции
                .reduce((first, second) -> second).orElse(null);               ///он нам пригодится


        System.out.println("Собираем коллекцию: ");
        for (String x: strings){
            System.out.println(x);
        }

        System.out.println();
        System.out.println("Добавление элемента: ");
        strings.change(4,"newEgor");
        System.out.println(strings.get(4));

        System.out.println();
        System.out.println("Получение элемента по индексу: ");
        System.out.println(strings.get(7));


        System.out.println();
        System.out.println("Удаление элемента по индексу: ");
        strings.delete(2);
        for (String x : strings) {
            System.out.println(x);
            if (x== strings.get(3))
                break;
        }


        System.out.println();
        System.out.print("Размер: ");
        System.out.println(strings.size());
        for (String x : strings) {
            if (x== strings.get(strings.size()-1)){
                System.out.print(last+".");
            }else
                System.out.print(x+", ");
        }
        System.out.println();
    }
}

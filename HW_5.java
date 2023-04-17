package Homework;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;

public class HW_5 {
  /**
   * @param args
   */
  public static void main(String[] args) {
    // Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1
    // человек может иметь несколько телефонов.
    // Добавить функции 1) Добавление номера 2) Вывод всего
    // Пример:
    // Я ввожу: 1
    // К: Введите фамилию
    // Я: Иванов
    // К: Введите номер
    // Я: 1242353
    // К: Введите 1) Добавление номера
    // 2) Вывод всего
    // Я ввожу: 1
    // К: Введите фамилию
    // Я: Иванов
    // К: Введите номер
    // Я: 547568
    // К: Введите 1) Добавление номера
    // 2) Вывод всего
    // Я: 2
    // Иванов: 1242353, 547568

    // Map<String, ArrayList<String>> contacts = new HashMap<String,
    // ArrayList<String>>();

    // while (true) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Введите 1- Добавление номера, 2- Вывод всего");
    // int command = sc.nextInt();
    // if (command == 1) {
    // System.out.println("Введите фамилию");
    // String surname = sc.next();
    // System.out.println("Введите номер телефона");
    // String phone = sc.next();
    // if (!contacts.containsKey(surname)) {
    // ArrayList<String> phoneList = new ArrayList<>();
    // phoneList.add(phone);
    // contacts.put(surname, phoneList);
    // } else {
    // ArrayList<String> phoneList = contacts.get(surname);
    // phoneList.add(phone);
    // }
    // }
    // if (command == 2) {
    // for (String surname : contacts.keySet()) {
    // System.out.println(surname + " " + String.join(", ", contacts.get(surname)));
    // }
    // }
    // }

    // Пусть дан список сотрудников
    // Написать программу, которая найдет и выведет повторяющиеся имена с
    // количеством повторений.
    // Отсортировать по убыванию популярности Имени.

    Map<String, String> nameBook = new HashMap<>();
    nameBook.put("Иванов", "Иван");
    nameBook.put("Петрова", "Светлана");
    nameBook.put("Белова", "Кристина");
    nameBook.put("Мусина", "Анна");
    nameBook.put("Крутова", "Анна");
    nameBook.put("Юрин", "Иван");
    nameBook.put("Лыков", "Петр");
    nameBook.put("Чернов", "Павел");
    nameBook.put("Чернышов", "Петр");
    nameBook.put("Федорова", "Мария");
    nameBook.put("Савина", "Мария");
    nameBook.put("Светлова", "Марина");
    nameBook.put("Рыкова", "Мария");
    nameBook.put("Лугова", "Марина");
    nameBook.put("Владимирова", "Анна");
    nameBook.put("Мечников", "Иван");
    nameBook.put("Петин", "Петр");
    nameBook.put("Ежов", "Иван");
    ArrayList<String> newArray = new ArrayList<>();
    Map<String, Integer> newBook = new HashMap<>();
    newArray.addAll(nameBook.values());
    int count = 0;
    for (int i = 0; i < newArray.size(); i++) {
      for (int j = 0; j < newArray.size(); j++) {
        if (newArray.get(i) == newArray.get(j)) {
          count += 1;
        }
      }
      newBook.put(newArray.get(i), count);
      count = 0;
    }
    System.out.println(newBook);
    
  }
}

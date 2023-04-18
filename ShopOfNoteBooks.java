package Homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import javax.swing.text.html.FormView;
// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
// Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий фильтрации 
//и выведет ноутбуки, отвечающие фильтру.
// NoteBook notebook1 = new NoteBook
// NoteBook notebook2 = new NoteBook
// NoteBook notebook3 = new NoteBook
// NoteBook notebook4 = new NoteBook
// NoteBook notebook5 = new NoteBook

// Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет

// Далее нужно запросить минимальные значения для указанных критериев - 
//сохранить параметры фильтрации можно также в Map.

// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

// Класс сделать в отдельном файле
public class ShopOfNoteBooks {

  public static void main(String[] args) {
    Class_NoteBook noteBook1 = new Class_NoteBook(1, 4, 500, "Windows", "gray");
    Class_NoteBook noteBook2 = new Class_NoteBook(2, 8, 1000, "MacOS", "black");
    Class_NoteBook noteBook3 = new Class_NoteBook(3, 16, 800, "Linux", "gray");
    Class_NoteBook noteBook4 = new Class_NoteBook(4, 8, 800, "Windows", "red");
    Class_NoteBook noteBook5 = new Class_NoteBook(5, 32, 2000, "MacOS", "silver");

    HashMap<String, Class_NoteBook> notebookMap = new HashMap<>();
    notebookMap.put("notebook1", noteBook1);
    notebookMap.put("notebook2", noteBook2);
    notebookMap.put("notebook3", noteBook3);
    notebookMap.put("notebook4", noteBook4);
    notebookMap.put("notebook5", noteBook5);

    HashMap<String, Class_NoteBook> sortedMap = new HashMap<>();
    System.out.println("Введите цифру, соответствующую необходимому критерию:");
    System.out.println("1 - ОЗУ");
    System.out.println("2 - Объем ЖД");
    System.out.println("3 - Операционная система");
    System.out.println("4 - Цвет");
    Scanner sc = new Scanner(System.in);
    int NumOfComatd = sc.nextInt();

    if (NumOfComatd == 1) {
      System.out.println("Введите минимальное значение ОЗУ");
      int variable = sc.nextInt();
      if (variable <= (notebookMap.get("notebook1").getRAM())) {
        sortedMap.put("notebook1", noteBook1);
      }
      if (variable <= notebookMap.get("notebook2").getRAM()) {
        sortedMap.put("notebook2", noteBook2);
      }
      if (variable <= notebookMap.get("notebook3").getRAM()) {
        sortedMap.put("notebook3", noteBook3);
      }
      if (variable <= notebookMap.get("notebook4").getRAM()) {
        sortedMap.put("notebook4", noteBook4);
      }
      if (variable <= notebookMap.get("notebook5").getRAM()) {
        sortedMap.put("notebook5", noteBook5);
      }

    } else if (NumOfComatd == 2) {
      System.out.println("Введите минимальное значение Объема ЖД");
      int variablehdd = sc.nextInt();
      if (variablehdd <= (notebookMap.get("notebook1").getMemory())) {
        sortedMap.put("notebook1", noteBook1);
      }
      if (variablehdd <= notebookMap.get("notebook2").getMemory()) {
        sortedMap.put("notebook2", noteBook2);
      }
      if (variablehdd <= notebookMap.get("notebook3").getMemory()) {
        sortedMap.put("notebook3", noteBook3);
      }
      if (variablehdd <= notebookMap.get("notebook4").getMemory()) {
        sortedMap.put("notebook4", noteBook4);
      }
      if (variablehdd <= notebookMap.get("notebook5").getMemory()) {
        sortedMap.put("notebook5", noteBook5);
      }

    } else if (NumOfComatd == 3) {
      sc.nextLine();
      System.out.println("Введите название ОС: Windows, MacOS или Linux");
      String variable1 = sc.nextLine();
      if (variable1.equals(notebookMap.get("notebook1").getOperating_system())) {
        sortedMap.put("notebook1", noteBook1);
      }
      if (variable1.equals(notebookMap.get("notebook2").getOperating_system())) {
        sortedMap.put("notebook2", noteBook2);
      }
      if (variable1.equals(notebookMap.get("notebook3").getOperating_system())) {
        sortedMap.put("notebook3", noteBook3);
      }
      if (variable1.equals(notebookMap.get("notebook4").getOperating_system())) {
        sortedMap.put("notebook4", noteBook4);
      }
      if (variable1.equals(notebookMap.get("notebook5").getOperating_system())) {
        sortedMap.put("notebook5", noteBook5);
      }
      
    } else if (NumOfComatd == 4) {
      sc.nextLine();
      System.out.println("Введите Цвет: silver, black, gray, red");
      String variable2 = sc.nextLine();
      if (variable2.equals(notebookMap.get("notebook1").getColor())) {
        sortedMap.put("notebook1", noteBook1);
      }
      if (variable2.equals(notebookMap.get("notebook2").getColor())) {
        sortedMap.put("notebook2", noteBook2);
      }
      if (variable2.equals(notebookMap.get("notebook3").getColor())) {
        sortedMap.put("notebook3", noteBook3);
      }
      if (variable2.equals(notebookMap.get("notebook4").getColor())) {
        sortedMap.put("notebook4", noteBook4);
      }
      if (variable2.equals(notebookMap.get("notebook5").getColor())) {
        sortedMap.put("notebook5", noteBook5);
      }
    }

    for (HashMap.Entry<String, Class_NoteBook> entry : sortedMap.entrySet()) {
      String key = entry.getKey();
      Class_NoteBook value = entry.getValue();
      System.out.println(key + ": " + value);
    }
  }
}

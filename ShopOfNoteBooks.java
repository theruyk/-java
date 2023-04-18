package Homework;

import java.util.ArrayList;
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
    Class_NoteBook noteBook1 = new Class_NoteBook(4, 500, "Windows", "gray");
    Class_NoteBook noteBook2 = new Class_NoteBook(8, 1000, "MacOS", "black");
    Class_NoteBook noteBook3 = new Class_NoteBook(16, 800, "Linux", "gray");
    Class_NoteBook noteBook4 = new Class_NoteBook(8, 800, "Windows", "red");
    Class_NoteBook noteBook5 = new Class_NoteBook(32, 2000, "MacOS", "gray");

    ArrayList<Class_NoteBook> NoteBook1 = new ArrayList<Class_NoteBook>();
    NoteBook1.add(noteBook1);
    NoteBook1.add(noteBook2);
    NoteBook1.add(noteBook3);
    NoteBook1.add(noteBook4);
    NoteBook1.add(noteBook5);

    // for (int i = 0; i < NoteBook1.size(); i++) {
    //   Class_NoteBook notebook = NoteBook1.get(i);
    //   System.out.println("Notebook " + (i + 1) + ":");
    //   System.out.println("  RAM size: " + notebook.getRAM());
    //   System.out.println("  OS: " + notebook.getOperating_system());
    //   System.out.println("  Color: " + notebook.getColor());
    //   System.out.println("  Mamory: " + notebook.getMemory());
    //}
    System.out.println("Введите цифру, соответствующую необходимому критерию:");
    System.out.println("1 - ОЗУ");
    System.out.println("2 - Объем ЖД");
    System.out.println("3 - Операционная система");
    System.out.println("4 - Цвет");
    Scanner sc = new Scanner(System.in);
    int NumOfComatd = sc.nextInt();
    if (NumOfComatd ==1){
      System.out.println("Введите минимальное значение ОЗУ");
      int variable = sc.nextInt();
    }
    else if (NumOfComatd == 2){
      System.out.println("Введите минимальное значение Объема ЖД");
      int variable = sc.nextInt();
    }
    else if (NumOfComatd == 3){
      System.out.println("Введите название ОС");
      String variable = sc.next();
    }
    else if (NumOfComatd == 4){
      System.out.println("Введите Цвет");
      String variable = sc.next();
    }
  }
}

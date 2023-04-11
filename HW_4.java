package Homework;

import java.sql.Array;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class HW_4 {
  public static void main(String[] args) {
    // Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void),
    // который вернет “перевернутый” список.

    LinkedList<Integer> list1 = new LinkedList<>();
    Random rm = new Random();
    for (int index = 0; index < 6; index++) {
    list1.add(rm.nextInt(100));
    }
    System.out.println(list1);
    
// не смог сделать метод

  }
  }

    // Реализуйте очередь с помощью LinkedList со следующими методами:
    // enqueue() - помещает элемент в конец очереди,
    // dequeue() - возвращает первый элемент из очереди и удаляет его,
    // first() - возвращает первый элемент из очереди, не удаляя.
//     LinkedList<Integer> list = new LinkedList<>();
//     while (true) {

//       Scanner sc = new Scanner(System.in);
//       String str = sc.nextLine();
//       // int elem =sc.nextInt();
//       if (str.equals("enqueue")) {
//         list.add(sc.nextInt());
//       } else if (str.equals("dequeue")) {
//         System.out.println(list.getFirst());
//         list.removeFirst();
//       } else if (str.equals("first")) {
//         System.out.println(list.getFirst());
//       }
//       System.out.println(list);
//     }
//   }
// }
// В калькулятор добавьте возможность отменить последнюю операцию

// Deque<Integer> list = new ArrayDeque<>();
// while (true) {
// Scanner sc = new Scanner(System.in);

// String step = sc.next();
// if (step.equals("старт")) {

// int num_1 = sc.nextInt();
// String str = sc.next();
// int num_2 = sc.nextInt();
// int result = 0;
// if (str.equals("+")) {
// result = num_1 + num_2;
// } else if (str.equals("-")) {
// result = num_1 - num_2;
// } else if (str.equals("*")) {
// result = num_1 * num_2;
// } else if (str.equals("/")) {
// result = num_1 / num_2;
// }

// System.out.println(result);

// list.add(result);

// } else if (step.equals("отмена")) {
// list.removeLast();
// System.out.println(list.getLast());
// }
// else if (step.equals("стоп")){
// sc.close();
// break;
// }
// //System.out.println(list);
// }
// }
// }

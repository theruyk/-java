package Homework;
//Вычислить n-ое треугольного число(сумма чисел от 1 до n), 

//а так же n! (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120

//import java.util.Scanner;
// public class HW_1 {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int num = sc.nextInt();
//     int result = 1;
//     for (int i = 1; i <= num; i++) {
//       result = result * i;
//     }
//     System.out.println(result);
//     sc.close();
//     }
//   }

// public class HW_1 {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int num = sc.nextInt();
//     int result=(num * (num+1))/2;
//     System.out.println(result);
//     sc.close();
//   }
// }

//Вывести все простые числа от 1 до 1000
/**
 * HW_1
 */
public class HW_1 {
  public static void main(String[] args) {
    int num = 1000;
    boolean b = true;
    for (int i = 2; i <= num; i++) {
      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          b = false;
          break;
        }
      }
      if (b)
        System.out.println(i);
      else
        b = true;
    }
  }
}

// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->

/**
 * HW_1
 */

// import java.util.Scanner;

// public class HW_1 {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
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
// sc.close();
// System.out.println(result);
// }
// }


package Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.ToDoubleBiFunction;

public class HW_3 {
  public static void main(String[] args) {
    // // Пусть дан произвольный список целых чисел, удалить из него чётные числа

    // List<Integer> data = new ArrayList<>(Arrays.asList(22,55,7,8,9));
    // for (int index = 0; index < data.size(); index++) {
    // if (data.get(index) % 2 == 0) {
    // data.remove(data.get(index));
    // }
    // }
    // System.out.println(data);
    // }
    // }

    // Задан целочисленный список ArrayList. Найти минимальное, максимальное и
    // среднее ариф. из этого списка.

    List<Integer> data = new ArrayList<>(Arrays.asList(22, 55, 7, 8, 9, 64, 91));
    int max = data.get(0);
    int min = data.get(0);
    float sum=0;
    for (int i : data) {
      if (i < min) {
        min = i;
      }
      if (i > max) {
        max = i;
      }
      sum +=i;
    }
     float average = (sum/ data.size());
    System.out.println(max);
    System.out.println(min);
    System.out.println(average);
  }
}


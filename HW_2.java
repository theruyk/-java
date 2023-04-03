package Homework;

// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации запишите в лог-файл.

// import java.io.File;
// import java.io.FileReader;
// import java.io.FileWriter;
// import java.net.SocketTimeoutException;
// import java.util.Arrays;

// public class HW_2 {
//   /**
//    * @param args
//    */
//   public static void main(String[] args) {
//     String Homework = "1.txt";
//     File file = new File("1.txt");
//     try {
//       FileWriter writer = new FileWriter(file, false);
//       int[] Array1 = new int[] { 11, 33, 44, 2, 6 };
//       boolean isSorted = false;
//       int buf;
//       String text;
//       while (!isSorted) {
//         isSorted = true;
//         for (int i = 0; i < Array1.length - 1; i++) {
//           if (Array1[i] > Array1[i + 1]) {
//             isSorted = false;
//             text = Integer.toString(Array1[i]);
//             buf = Array1[i];
//             writer.write(text);
//             writer.write("=>");
//             text = Integer.toString(Array1[i + 1]);
//             Array1[i] = Array1[i + 1];
//             Array1[i + 1] = buf;
//             writer.write(text);
//             writer.write("=>");
//           }
//         }
//       }
//       System.out.println(Arrays.toString(Array1));
//       writer.close();
//       System.out.println("Получилось!)");
//     } catch (Exception e) {
//       System.out.println("Что то пошло не так");
//     }
//   }
// }


// Дана строка (получение через обычный текстовый файл!!!)

// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода в консоль:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.



import java.io.*;
import java.util.Arrays;
 
  public class HW_2 {
 
    public static void main(String[] args) {
        
        try(FileReader reader = new FileReader("addition.txt"))
        {
           StringBuilder sb = new StringBuilder();
            int c;
            while((c=reader.read())!=-1){
                 sb.append((char)c);                
            }
            String s = new String(sb);
            s = s.replaceAll(":", " ");
            s = s.replaceAll(",", " ");
            String[] words = s.split(" ");
            //System.out.println(Arrays.toString(words));
            String newstr = "Студент "+ words[1] + " получил "+ words[3]+ " по предмету " +words[5]+"\n"+"Студент "+ words[7] + " получил "+ words[9]+ " по предмету " +words[11];
            System.out.println(newstr);
            
             
        }
        catch(IOException ex){
             
            System.out.println("Что то пошло не так");
        }   
    } 
}
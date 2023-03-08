/*
 * Вычислить n-ое треугольного число(сумма чисел от 1 до n), n!
 *  (произведение чисел от 1 до n)
 */
package tasks;

import java.util.Scanner;

public class taskd1 {
   public static void main(String[] args) {
      System.out.println("Введите число n ->");
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      int res = 0;
      for (int i = 1; i <= n; i++) {
         int count = (i + (i + 1)) / 2;
         res = res + count;
      }
      System.out.println(res);
      scanner.close();
   }
}

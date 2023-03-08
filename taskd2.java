/*
 * Вывести все простые числа от 1 до 1000
 */

package tasks;

public class taskd2 {
   public static void main(String[] args) {
      int number = 1000;
      boolean isPrime = false;
      System.out.println("2");
      System.out.println("3");
      for (int i = 5; i <= number; i++) {
         for (int k = 2; k <= Math.sqrt(i); k++) {
            isPrime = !(i % k == 0);
            if (!isPrime)
               break;
         }
         if (isPrime)
            System.out.println("" + i);
      }
   }
}

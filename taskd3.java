package tasks;

import java.util.Scanner;

public class taskd3 {
   public static void main(String[] args) {
      System.out.println("Операции : \n" +
            "1. Сумма (+) \n" +
            "2. Вычитание (-) \n" +
            "3. Умножение (*) \n" +
            "4. Деление (/) \n");
      Scanner scanner = new Scanner(System.in);

      System.out.println("Введите первоё число: ");
      double num1 = scanner.nextDouble();

      System.out.println("Введите операцию: (+ или - или * или /)");
      char operation = scanner.next().charAt(0);

      System.out.println("Введите второе число: ");
      double num2 = scanner.nextDouble();
      switch (operation) {
         case '+':
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            break;
         case '-':
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
            break;
         case '*':
            System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
            break;
         case '/':
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            break;
         default:
            System.err.println("Invalid Operator Specified.");
            break;
      }
      scanner.close();
   }
}

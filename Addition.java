import java.util.*;

class Addition {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number1:");

    int a = sc.nextInt();
    System.out.print("Enter the number2:");

    int b = sc.nextInt();
    int c = a + b;
    System.out.println("Addition=" + c);
  }
}

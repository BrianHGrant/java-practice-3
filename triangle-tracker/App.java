import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myBox = System.console();
    boolean programRunning = true;

    while (programRunning) {
      System.out.println("You got a triangle and your itching to know what type?\n Look know further because you have come to...\n The Triangle Tracker!!!!");
      System.out.println("Enter Side A Measurement:");
      int sideA = Integer.parseInt(myBox.readLine());
      System.out.println("Enter Side B Measurement:");
      int sideB = Integer.parseInt(myBox.readLine());
      System.out.println("Enter Side C Measurement:");
      int sideC = Integer.parseInt(myBox.readLine());
      Triangle myTriangle = new Triangle(sideA, sideB, sideC);
      String triangleType = myTriangle.isType();
      System.out.println("Based on the entered measurements, your triangle is:\n" + triangleType);
    }
  }
}

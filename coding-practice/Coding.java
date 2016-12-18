import java.io.Console;

public class Coding {
  public static void main(String[] args) {
    Double total = 0.0;
    total += askTime("today");
    total += askTime("yesterday");
    total += askTime("the day before");

    System.out.println("You have spent " + total + " hours coding in the last three days!" );
    if (total <=3) {
      System.out.println("Let's get motivated!");
    } else if (total > 3 && total < 6) {
      System.out.println("Doing good, but a few more hours would be of help");
    } else {
      System.out.println("You're a code warrior.");
    }
  }

  public static double askTime(String day) {
    Console myConsole = System.console();
    System.out.println("How much time did you spend coding " + day + "?");
    return Double.parseDouble(myConsole.readLine());
  }
}

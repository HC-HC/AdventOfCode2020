import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = 0;
    while (sc.hasNextLine()) {
      String[] line = sc.nextLine().split(" ");
      String[] bounds = line[0].split("-");
      char letter = line[1].charAt(0);
      String pw = line[2];
      if (isValid(Integer.parseInt(bounds[0]), Integer.parseInt(bounds[1]), letter, pw)) {
        count ++;
      }
    }
    System.out.println(count);
    sc.close();
  }

  static boolean isValid(int low, int high, char letter, String pw) {
    if ((pw.charAt(low - 1) == letter && pw.charAt(high - 1) != letter) || (pw.charAt(low - 1) != letter && pw.charAt(high - 1) == letter)) {
      return true;
    }
    return false;
  }
}
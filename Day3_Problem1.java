import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = 0;
    int count = 0;
    while (sc.hasNextLine()) {
      String line = sc.nextLine();
      int len = line.length();
      if (isTree(line, num % len)) {
        count++;
      }
      num += 3;
    }
    System.out.println(count);
    sc.close();
  }

  static boolean isTree(String line, int num) {
    if (line.charAt(num) == '#') {
      return true;
    }
    return false;
  }

}
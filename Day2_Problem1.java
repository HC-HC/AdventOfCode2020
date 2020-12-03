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
      if (isPassword(Integer.parseInt(bounds[0]), Integer.parseInt(bounds[1]), letter, pw)) {
        count ++;
      }
      sc.close();
    }
    System.out.println(count);
  }

  static boolean isPassword(int low, int high, char letter, String pw) {
    int count = 0;
    for (int i = 0; i < pw.length(); i++) {
      if (pw.charAt(i) == letter){ 
        count++;
      }
    }
    if (low <= count && count <= high) {
      return true;
    }
    return false;
  }
}
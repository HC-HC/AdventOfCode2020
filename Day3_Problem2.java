import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1_2 = 0;
    int lineCount = 0;
    int count1_2 = 0;
    int[] num = new int[] {0, 0, 0, 0};
    int[] arr = new int[] {1, 3, 5, 7};
    int[] count = new int[] {0, 0, 0, 0};

    while (sc.hasNextLine()) {
      String line = sc.nextLine();
      int len = line.length();
      for (int i = 0; i < 4; i++) {
        if (isTree(line, num[i] % len)) {
          count[i]++;
        }
        num[i] += arr[i];
      }

      if (lineCount % 2 == 0) {
        if(isTree(line, num1_2 % len)) {
          count1_2++;
        }
        num1_2++;
      }
      lineCount++;
    }
    long product = 1;
    for (int i = 0; i < 4; i++) {
      product *= count[i];
    }
    product *= count1_2;
    System.out.println(product);
    sc.close();
  }

  static boolean isTree(String line, int num) {
    if (line.charAt(num) == '#') {
      return true;
    }
    return false;
  }
}
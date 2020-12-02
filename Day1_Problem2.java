import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> lst = new ArrayList<>();
    while (sc.hasNextLine()) {
      lst.add(Integer.parseInt(sc.nextLine()));
    }
    Collections.sort(lst);
    System.out.println(sumTo2020(lst));
    sc.close();
  }

  static int sumTo2020(List<Integer> lst) {
    int len = lst.size();
    for (int i = 0; i < len - 1; i++) {
      int target = 2020 - lst.get(i);
      int j = i + 1;
      int k = len - 1;
      while (j < k) {
        if (lst.get(j) + lst.get(k) == target) {
          return lst.get(i) * lst.get(j) * lst.get(k);
        }
        else if (lst.get(j) + lst.get(k) < target) {
          j++;
        }
        else if (lst.get(j) + lst.get(k) > target) {
          k--;
        }
      }
    }
    return 0;
  }
}
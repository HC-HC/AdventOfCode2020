import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashSet<Integer> set = new HashSet<>();
    while (sc.hasNextLine()) {
      set.add(Integer.parseInt(sc.nextLine()));
    }
    System.out.println(sumTo2020(set));
    sc.close();
  }
  
  //Find two numbers that sum to 2020
  //Return their product
  static int sumTo2020(HashSet<Integer> set) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (Integer i : set) {
      if (map.containsKey(i)) {
        return map.get(i) * i;
      }
      else {
        map.put(2020 - i, i);
      }
    }
    return 0;
  }

}

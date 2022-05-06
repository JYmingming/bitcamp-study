import java.util.ArrayList;
import java.util.Scanner;

public class TeamMaker {
  public static void main(String[] args) throws Exception {
    Scanner keyScan = new Scanner(System.in);

    String[] names = {
        "강동우", "곽민규", "김규범", "김기현", "김민수", "김재원", "김주은", "김지현", "명준호", "박경현",
        "박력", "서영범", "양성은", "양승범", "오민현", "오승지", "이상준", "이장일", "이재훈", "임성현",
        "장창훈", "장효범", "전영민", "정요섭", "정창성", "조원석", "채다해", "최리나", "한상은", "허정윤"
    };

    for (int i = 0; i < 100; i++) {
      int x = (int)(Math.random() * 30);
      int y = (int)(Math.random() * 30);
      String temp = names[x];
      names[x] = names[y];
      names[y] = temp;
    }

    ArrayList<String> members = new ArrayList<>();
    for (String name : names) {
      members.add(name);
    }

    int count = 0;
    while (members.size() > 0) {
      Thread.sleep(2000);
      System.out.printf("%3s ", members.remove((int)(Math.random() * members.size())));
      if ((++count % 6) == 0) {
        System.out.println();
        keyScan.nextLine();
      }
    }

    keyScan.close();
  }
}

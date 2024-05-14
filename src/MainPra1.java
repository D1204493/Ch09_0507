import java.util.*;

public class MainPra1 {
  public static void main(String [] args) {

      //使用者輸入一個長度大於等於6的英文字串
      Scanner sc = new Scanner(System.in);
      System.out.println("請輸入長度大於等於6的英文字串：");
      String str = sc.nextLine();

      //編碼規則如下：
      //a or A => 4
      // s/S => 5
      // t/T => 7
      // o/O => 0

      if(str.length() >= 6 ){
        str = str.replace("a", "4");
        str = str.replace("A", "4");

        str = str.replace("s", "5");
        str = str.replace("S", "5");

        str = str.replace("t", "7");
        str = str.replace("T", "7");

        str = str.replace("o", "0");
        str = str.replace("O", "0");

        System.out.println("編碼後的密碼字串為：" + str);
      }
      else{
        System.out.println("密碼長度必須大於等於6");
      }
      //example: School => 5ch00l
      //         Student => 57uden7
      //最後把編碼的結果印出


  }
}

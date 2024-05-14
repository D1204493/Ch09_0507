import java.util.*;
public class MainPra2 {
  public static void main(String [] args) {

    //使用者輸入一個長度大於等於6的英文字串
    System.out.println("請輸入長度大於等於6的英文字串：");
    Scanner sc = new Scanner(System.in);
    String word = sc.nextLine();

    //取得一個子字串，從e開頭F結尾，我就把此子字串印出
    int beginIndex = word.indexOf("e"); //p.10-11
    int endIndex = word.indexOf("F");
    if((beginIndex >= 0) && (endIndex > 0) && (endIndex > beginIndex)){
      String subWord = word.substring(beginIndex,endIndex+1);
      System.out.println(subWord);
    }
    else{
      System.out.println("此子字串不存在");
    }
    //如果沒有的話，就印出此子字串不存在


  }
}

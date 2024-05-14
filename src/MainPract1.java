public class MainPract1 {
  public static void main(String [] args){

    String a = "這是一個測試字串";
    StringBuffer b = new StringBuffer(a);
    b.setCharAt(2,'二');
    System.out.println(b);

//    String a = "這是一個測試字串";
//    StringBuffer b = new StringBuffer(a);
//    System.out.println(b.reverse());
//    System.out.println(b.reverse());

//    String a = "這是一個測試字串";
//    StringBuffer b = new StringBuffer(a);
//    System.out.println(b.deleteCharAt(2));
//    System.out.println(b.replace(1,3,"好像不是"));

//    String a = "這是一個測試字串";
//    StringBuffer b = new StringBuffer(a);
//    System.out.println(b.delete(1,2));
//    System.out.println(b.delete(0,3));

//    String a = "這是一個測試字串";
//    StringBuffer b = new StringBuffer(a);
//    System.out.println(b.insert(0,20));
//    System.out.println(b.insert(3,"字串內容已改變"));
//    System.out.println(b.insert(b.length(),b));

//    String a = "這是一個測試字串";
//    StringBuffer b = new StringBuffer(a);
//    System.out.println(b.append(20));
//    System.out.println(b.append("字串內容已改變"));
//    System.out.println(b.append(b));

//    String a = "這是一個測試字串\t";
//    System.out.print(a.trim());
//    System.out.println("...定位字元不見了");
//    System.out.print(a);
//    System.out.println("...定位字元還在");

//    String a = "這是一個測試字串";
//    System.out.println(a.substring(4));
//    System.out.println(a.substring(4,6));

//    String a = "abcd";
//    System.out.println(a + "的開頭是cd:"
//            + a.startsWith("cd"));
//    System.out.println(a + "從第3個字開始算的開頭是cd:"
//            + a.startsWith("cd",2));

//    String a = "這是一個測試字串";
//    System.out.println(a.replace('測','考'));
//    System.out.println(a);

//    String a = "這是一個測試字串";
//    System.out.println(a.indexOf('測'));
//    System.out.println(a.indexOf('空'));//為包含會回傳-1

//    String a = "這是一個測試字串";
//    char [] chars = new char[4];
//    a.getChars(1,5,chars,0);
//    System.out.println(new String(chars));

//    String a = "abcd";
//    System.out.println(a.endsWith("cd"));

//    String a = "abcd";
//    System.out.println(a.contains("abcd"));
//    System.out.println(a.contains("abc"));
//    System.out.println(a.contains("abcde"));
//    System.out.println(a.contains("lkk"));

//    String a = "abcd";
//    System.out.println(a.compareTo("abcb"));
//    System.out.println(a.compareTo("abcd"));
//    System.out.println(a.compareTo("abce"));
//    System.out.println(a.compareTo("abcde"));
//    System.out.println(a.compareTo("Abcd"));

//    String a = "這是一個測試字串";
//    System.out.println("索引0的字元: " + a.charAt(0));
//    System.out.println("索引5的字元: " + a.charAt(5));

//    Pract1 a = new Pract1("Joy");
//    System.out.println("I am " + a );
//    String a = "這是一個測試字串";
//    String b = "這是一個測試字串";
//    String c = new String("這是一個測試字串");
//    System.out.println("a:" + a);
//    System.out.println("b:" + b);
//    System.out.println("c:" + c);
//    System.out.println("d:" + d);
//    System.out.println("a == b: " + a.equals(b));
//    System.out.println("b == c: " + b.equals(c));
//    System.out.println("a == c: " + a.equals(c));

  }
}

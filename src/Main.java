//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {

    //Car car = new Car(111,"White");

    StringBuffer word = new StringBuffer();
    for(int i=0; i<10; i++){
      word.append(i);
    }
    System.out.println(word.toString());

    /*String word1 = "My name is Tom. I study at FCU";
    String word2 = " \n \t  ";
    String word3 = null; //null
    System.out.println(word2.isEmpty());
    System.out.println(word2.isBlank());
    //System.out.println(word3.isEmpty());
    */

    /*String word1 = "abb";
    String word2 = "Abc";
    //考慮大小寫
    System.out.println(word1.compareTo(word2));
    //不考慮大小寫
    System.out.println(word1.compareToIgnoreCase(word2));
    */

    //car.setColor("Yellow");
    /*String greeting = "Hello";
    String newGreeting = greeting.replace("l","L");
    System.out.println(newGreeting);
    System.out.println(greeting);
     */
    //greeting += "FCU";
    //System.out.println(greeting + " " + car);

    //String greeting = new String("Hello");
    //簡化
    /*String greeting = "Hello";
    String greeting2 = "Hello";
    String greeting3 = new String("Hello");

    System.out.println("Reference comparison: " + (greeting == greeting2));
    System.out.println("Reference comparison: " + (greeting == greeting3));

    System.out.println("Content comparison: " + greeting.equals(greeting2));
    System.out.println("Content comparison: " + greeting.equals(greeting3));
    */




  }
}
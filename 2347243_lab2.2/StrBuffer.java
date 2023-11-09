import java.lang.*;

public class StrBuffer {

  public static void main(String[] args) {

    StringBuffer sb = new StringBuffer("Hello");

    //1. append()
    sb.append("World"); 
    System.out.println(sb); 
    System.out.println();

    //2. insert() 
    sb.insert(0, "Say :"); 
    System.out.println(sb);
    System.out.println();

    //3. replace()
    sb.replace(0, 4, "Good morning");
    System.out.println(sb);
    System.out.println();

    //4. delete()
    sb.delete(0, 5);
    System.out.println(sb);
    System.out.println();

    //5. charAt()
    char ch = sb.charAt(0);
    System.out.println("First character: " + ch);
    System.out.println();

    //6. setCharAt()
    sb.setCharAt(0, 'M');
    System.out.println(sb);
    System.out.println();

    //7. length()
    int len = sb.length();
    System.out.println("Length: " + len+"\n");

    //8. capacity() 
    int cap = sb.capacity(); 
    System.out.println("Capacity: " + cap+"\n");

    //9. ensureCapacity()
    sb.ensureCapacity(50);
    System.out.println("New Capacity: " + sb.capacity());
    System.out.println();

    //10. toString()
    String str = sb.toString();
    System.out.println("String: " + str+"\n"); 

    //11. substring()
    String sub = sb.substring(2,5);
    System.out.println("Substring: " + sub+"\n");

    //12. substring()
    sub = sb.substring(3);
    System.out.println("Substring: " + sub+"\n");
  }
}
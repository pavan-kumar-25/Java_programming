public class StringMethods {

  public static void main(String[] args) {

    String text = "We realizes that while our workers were thriving, thesurrounding villages were still suffering. It became our goal to uplift theirquality of life as well. I remember seeing a family of 4 on a motorbike in theheavy Bombay rain — I knew I wanted to do more for these families who wererisking their lives for lack of an alternative The alternative mentioned hereis the Tata Nano, which soon after came as the world’s cheapest car on retailat a starting price of only Rs 1 lakh. These were the words of Ratan Tata in arecent post by Humans of Bombay which formed the basis of his decision to comeup with a car like Tata Nano.";
    
    // charAt()
    char ch = text.charAt(5);
    System.out.println("Character at index 5: " + ch);
    System.out.println();

    // compareTo()
    String str2 = "Hello"; 
    int result = text.compareTo(str2);
    System.out.println("text compared to str2: " + result);
        System.out.println();

    // concat()
    String text2 = text.concat(str2);
    System.out.println("Concatenated string: " + text2);
    System.out.println();


    // contains()
    boolean b = text.contains("workers");
    System.out.println("Text contains 'workers': " + b);
    System.out.println();


    // endsWith()
    b = text.endsWith("Tata Nano.");  
    System.out.println("Text ends with 'Tata Nano.': " + b);
    System.out.println();


    // equals()
    b = text.equals(str2);
    System.out.println("Text equals str2: " + b);
    System.out.println();


    // equalsIgnoreCase()
    b = text.equalsIgnoreCase(str2);
    System.out.println("Text equals str2 (ignore case): " + b);
    System.out.println();


    // format()
    String formattedStr = String.format("Text has %d characters", text.length());
    System.out.println(formattedStr);
    System.out.println();


    // getBytes()
    byte[] bytes = text.getBytes();
    System.out.println("Text to bytes: " + new String(bytes));
    System.out.println();


    // getChars()
    char[] chars = new char[10];
    text.getChars(0, 10, chars, 0);
    System.out.println("First 10 chars: " + String.valueOf(chars));
    System.out.println();


    // indexOf()
    int index = text.indexOf("workers");
    System.out.println("Index of 'workers': " + index);
    System.out.println();


    // intern()
    String textInterned = text.intern();
    System.out.println("Interned string: " + textInterned);
    System.out.println();


    // isEmpty()
    b = text.isEmpty();
    System.out.println("Text is empty: " + b);
    System.out.println();


    // join()
    String joined = String.join("-", "hello", "world");
    System.out.println("Joined string: " + joined);
    System.out.println();


    // lastIndexOf()
    index = text.lastIndexOf("were");
    System.out.println("Last index of 'were': " + index);
    System.out.println();


    // length()
    int length = text.length();
    System.out.println("Length of text: " + length);
    System.out.println();


    // replace()
    String replaced = text.replace("were", "are");
    System.out.println("Replaced text: " + replaced);
    System.out.println();


    // replaceAll()
    replaced = text.replaceAll("were", "are");
    System.out.println("Replaced all text: " + replaced);
    System.out.println();


    // split()
    String[] split = text.split(" ");
    System.out.println("Split text: " + String.join(", ", split));
    System.out.println();


    // startsWith() 
    b = text.startsWith("We");
    System.out.println("Text starts with 'We': " + b);
    System.out.println();


    // substring()
    String sub = text.substring(10, 20);
    System.out.println("Substring: " + sub);
    System.out.println();


    // toCharArray()
    char[] textChars = text.toCharArray();
    System.out.println("Text to chars: " + String.valueOf(textChars));
    System.out.println();


    // toLowerCase()
    String lower = text.toLowerCase();
    System.out.println("Lower case: " + lower);
    System.out.println();


    // toUpperCase()
    String upper = text.toUpperCase();
    System.out.println("Upper case: " + upper);
    System.out.println();


    // trim()
    String trimmed = text.trim(); 
    System.out.println("Trimmed: [" + trimmed + "]");
    System.out.println();


    // valueOf()
    String textObj = String.valueOf(text);
    System.out.println("String object: " + textObj);

  }

}
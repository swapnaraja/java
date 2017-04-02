import java.util.*;
public class LettersCount {
public static void main(String args[]) {

String line = "hadoop is bigdata framework";
    Map<Character, Integer> charMap = new HashMap<Character, Integer>();
    char[] charList = line.toCharArray();

    for (char value: charList) {

       if (Character.isAlphabetic(value)) {
           if (charMap.containsKey(value)) {
               charMap.put(value, charMap.get(value) + 1);

           } else {
               charMap.put(value, 1);
           }
       }
    }

    System.out.println(charMap);
    }
    }

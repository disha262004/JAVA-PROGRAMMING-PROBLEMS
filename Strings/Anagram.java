import java.util.*;

public class Anagram{
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String s1, String s2) {
    char arr1[] = s1.toCharArray();
    char arr2[] = s2.toCharArray();
    
    Arrays.sort(arr1);
    Arrays.sort(arr2);

    String str1 = new String(arr1);
    String str2 = new String(arr2);
    
    if(str1.compareToIgnoreCase(str2) != 0){
            return false;
        }
    
    return true;
    
    }

    public static void main(String args[]){
        String s1 = "geeks";
        String s2 = "kseeg";
        System.out.print(areAnagrams(s1,s2));
        
    }
}

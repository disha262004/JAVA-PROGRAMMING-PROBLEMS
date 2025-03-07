import java.util.*;
public class subsets{
    public static void subsets(String s,String ans, int i){
        if(i == s.length()){
            System.out.println(ans);
            return;
        }
        subsets(s, ans+s.charAt(i), i+1);
        subsets(s, ans, i+1);
    }
    public static void main(String args[]){
        String s = "abc";
        subsets(s , "", 0);

    }
}
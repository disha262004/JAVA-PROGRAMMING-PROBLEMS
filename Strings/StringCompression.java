public class StringCompression{
    public static String stringCompression(String s){

    StringBuilder str = new StringBuilder("");

    for(int i=0 ; i<s.length() ; i++){
        Integer count = 1 ;
        while(i<str.length()-1 && s.charAt(i) == s.charAt(i+1)){
            count++;
            i++;
        }
        str.append(s.charAt(i));
        if(count > 1){
            str.append(count.toString());
        }
        
    }
    return str.toString();
    }
    public static void main(String args[]){
        String s = "aaaabbbbccccc";
        System.out.print(stringCompression(s));
    }
}
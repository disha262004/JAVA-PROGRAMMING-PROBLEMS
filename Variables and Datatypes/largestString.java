public class largestString{
    public static String largest(String fruits[]){
        String largest = fruits[0];
        for(int i=1 ; i<fruits.length ; i++){
            if(largest.compareToIgnoreCase(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        String fruits[] = {"apple","mango","banana"};
        System.out.print(largest(fruits));
    }
}
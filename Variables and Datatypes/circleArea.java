import java.util.Scanner;

public class circleArea{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float r = sc.nextInt();
        float area = 3.14f*r*r;
        System.out.println("Area is :  "+area);
    }
}
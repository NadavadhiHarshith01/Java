import java.util.*;
public class Swapping {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.print("Enter number a b:");
        a=sc.nextInt();
        b=sc.nextInt();

        System.out.println("Before swapping");
        System.out.println("a="+a);
        System.out.println("b="+b);

        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("After swapping");
        System.out.println("a="+a);
        System.out.println("b="+b);


    }
}

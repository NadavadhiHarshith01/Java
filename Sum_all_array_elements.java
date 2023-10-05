import java.util.*;
class Sum_all_array_elements{

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n=sc.nextInt();
        int arr[]= new int[n];
        int sum=0;

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }

        System.out.println("Array elements:");
        
        for(int i=0;i<n;i++){
        System.out.printf("a[%d]:%d\n",i,arr[i]);

        }
        System.out.println("Sum of Array elements:"+sum);


    }

}
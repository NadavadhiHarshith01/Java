import java.util.*;
class Find_largest_number_in_array{

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n=sc.nextInt();
        int arr[]= new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Array elements:");
        int max=arr[0];
        for(int i=0;i<n;i++){
            System.out.printf("a[%d]:%d\n",i,arr[i]);
            if(arr[i]>max){
                max=arr[i];
            }

        }
        System.out.println("Largest number in array : "+max);


    }

}
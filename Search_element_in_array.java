import java.util.*;
class Search_element_in_array{

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n=sc.nextInt();
        int arr[]= new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
      
        }

        System.out.println("Enter the element to search:");
        int s=sc.nextInt();
        String flag="false";
        for(int i=0;i<n;i++){
            if(s==arr[i]){
                System.out.println("Element found");
                System.out.println("Index of the element : "+i);
                flag="true";
                break;

            }

        }
        if(flag=="false")
            System.out.println("Element is not found");


    }

}
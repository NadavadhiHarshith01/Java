import java.util.*;

class Insert_elements_in_array{
  
  public static void main(String args[]){
    
     int arr[]={1,2,3,4,5,6,7,8};
     int arr2[]= new int[arr.length+1];
     //Scanner sc=new Scanner(System.in);
     System.out.println("Enter index number to insert:");
    // int index=sc.nextInt();
     int index=3;
     System.out.println("Enter number to insert:");
     //int nunber=sc.nextInt();
     int number=33;
     System.out.println("Before insert:");
     for(int i=0;i<arr.length;i++){
        
        System.out.println(arr[i]);
       
       }
     
     int i,j;
     if(index<arr.length && index>-1 ){
       
         for(i=0,j=0;i<arr.length;j++){
        
           if(j==index){
             
              arr2[j]=number;
           }
           else{
             
              arr2[j]=arr[i];
              i++;
             
             }
       
         }
       
       
       }
       
       arr=arr2;
       System.out.println("After insert:");
       for( i=0;i<arr.length;i++){
        
        System.out.println(arr[i]);
       
       }
     }
}
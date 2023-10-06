class Second_highest{
  
  public static void main(String arg[]){
    
    
    int arr[]={7,1,2,3,4,5};
    
    int first_max=arr[0];
    
    int second_max=arr[0];
    
    for(int i=0;i<arr.length;i++){
      
      System.out.println(arr[i]);
      
      if(first_max<arr[i]){
        second_max=first_max;
        first_max=arr[i];
        
        }
      
      }
      
      
      System.out.println("First max"+first_max);
      
      if(first_max==arr[0]){
        
        second_max=arr[1];
        for(int i=1;i<arr.length;i++){
      
           if(second_max<arr[i]){
             second_max=arr[i];
        
           }
      
         }
     
        }
      
      
     System.out.println("Second max"+second_max);
    }
    
}
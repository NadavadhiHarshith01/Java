class Left_right_rotation{
  
  
  public static void main(String args[]){
    
    
      int arr[]={1,2,3,4,5,6};
      int temp=arr[0];
      
      for(int i=0;i<arr.length;i++){
        
           
           System.out.println(arr[i]);
           
           
      }
        
      
      
      for(int i=0;i<arr.length;i++){
        
           if(i!=arr.length-1){
             arr[i]=arr[i+1];
          
           }else{
           
            arr[arr.length-1]=temp;
           
           }
           
      }
        
        
      System.out.println("left rotation:");
        
        for(int i=0;i<arr.length;i++){
           
           System.out.println(arr[i]);
           
      }
      
      int tempr=arr[arr.length-1];
        
      for(int i=arr.length-1;i>=0;i--){
        
           if(i!=0){
             arr[i]=arr[i-1];
          
           }else{
           
            arr[0]=tempr;
           
           }
           
      }
        
        System.out.println("right rotation:");
        
        for(int i=0;i<arr.length;i++){
           
           System.out.println(arr[i]);
                      
      }
    }
}
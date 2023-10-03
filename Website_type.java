class Website_type{
  
  public static void main(String arg[]){
    
    
    String url="https://www.google.com";
    String str1=url.substring(0,url.indexOf(":"));
    String str2=url.substring(url.lastIndexOf(".")+1,url.length());
    
    
    System.out.println("protocol:");
    if(str1.equals("https")){
      
      System.out.println("Hyper text transfer protocol secure");
      }
    else if(str1.equals("ftps")){
      
      System.out.println("File transfer protocol secure");
      }
    else{
      System.out.println("error");
      }
      
    System.out.println("website type:");
    if(str2.equals("com")){
      
      System.out.println("Commarcial");
      }
    else if(str2.equals("org")){
      
      System.out.println("Organisation");
      }
    else if(str2.equals("net")){
      
      System.out.println("Network");
      }
    else{
      System.out.println("error");

      }
      }
    }

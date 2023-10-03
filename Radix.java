import java.util.*;
import java.io.*;
class Radix{
  public static void main(String args[]){
    
    Scanner sc = new Scanner(System.in);
    
    String num=sc.nextLine();
    
    if(num.matches("[01]*")){
       System.out.println("Radix of "+num+" : 2");
      
      }
    else if(num.matches("[0-7]*")){
      System.out.println("Radix of "+num+" : 8");
      
      }
    else if(num.matches("[0-9]*")){
      System.out.println("Radix of "+num+" : 10");
      
      }
    
    else if(num.matches("[0-9A-F]*")){
      System.out.println("Radix of "+num+" : 16");
      
      }
    else{
      System.out.println("Not a valid input");
        
        }
    }
}
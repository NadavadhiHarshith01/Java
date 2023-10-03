import java.io.*;
import java.util.*;

class Reverse_armstrong_palindrome{
  public static void main(String args[]){
    
    Scanner sc = new Scanner(System.in);
    
    int num=sc.nextInt();
    int r,n=num,k=0;
    double c=0;
    while(n!=0){
      r=n%10;
      n=n/10;
      k=k*10+r;
      c=c+Math.pow(r,3);
      
      }
    
    System.out.println("Reverse of "+num+" : "+ k);
    if(num==(int)c){
        System.out.println("Armstrong number");
      }
    else{
        System.out.println("Not Armstrong number");
      }
    if(num==k){
        System.out.println("palindrome number");
      }
    else{
        System.out.println("Not palindrome number");
      }
    }
}
//Question: Number inversions

// Rahul is facing a unique problem, which he doesn't know how to solve. The problem asks him to build the smallest possible number by applying inversion on any digit of the number any number of times.
// Inversion of a digit is defined as that digit being replaced by 9 minus that digit. Meaning that inversion of 9 will be 9 - 9 = 0 and inversion of 1 will be 9 - 1 = 8 and so on.

// The final output should not have any leading zeroes.

// Input Format:
// The only line of the input contains an integer N

// Output Format:
// Print only one single integer on a line as described above.

// Constraints:
// 1 <= N <= 10^18

// Examples:
// Input:
// 87
// Output:
// 12

// Explanation:

// 9-8 = 1

// and 9 -7 = 2

// if we see carefully, 12 is the smallest possible number we can get.
 

// Example:
// Input:
// 99
// Output:
// 90

// Explanation:

// In this case, we do not replace the first 9 since it will lead to a leading zero.




import java.util.*;

class Number_inversions{
    
    public static void main(String arg[]){
        
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String output="";

        int d[]=new int[str.length()];

        
        for(int i=0;i<str.length();i++){
            char myChar= str.charAt(i);
            String single_str=String.valueOf(myChar);
            d[i]=Integer.parseInt(single_str);
            //System.out.println(d[i]);
        }
        
        // for(int x:d){
        //  System.out.println(x);
        // }
        
        
        
        
        int flag=1;
        for(int j=0;j<d.length;j++){
             //System.out.println(d[j]);
             if(d[0]==9 && flag==1){
                 flag=0;

             }
             else if(d[j]<6){
                 
             }
             else{
                 d[j]=9-d[j]; 
             
             }
          // System.out.println(d[j]);
            output=output+d[j];
            

        }
        System.out.println(output);

        
    }
    
}
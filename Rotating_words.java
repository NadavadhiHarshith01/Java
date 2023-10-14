// Rotating Words
// After solving the previous problem, Kartik is stuck on yet another new problem given to him by his teacher.
// The problem wants him to find out the number of unique words that can be formed by cyclically rotating a given string.

// Cyclic rotation of a string is defined as moving the last character of the string on the first position.

// Kartik can apply Cyclic rotation any number of times.

// You have to help him in finding the maximum number of unique words that can be formed by applying Cyclic rotation any number of times.

// Input Format:
// The only line of the input contains a string S containing of lowercase characters

// Output Format:
// Print only one single integer denoting the number of unique words that can be formed as explained above.

// Constraints:
// 1 <= len(s) <= 50

// Example:
// Input:
// abcd
// Output:
// 4
// Explanation:
// abcd,dabc,cdab,bcda
// 4 unique strings are possible

// Input:
// cc
// Output:
// 1
// Explanation:
// Only 1 unique string is possible , 'cc'



import java.util.*;
class Rotating_words{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char str_chr_array[]=new char[str.length()];
        String str_array[]=new String[str.length()];


        for(int i=0;i<str.length();i++){
            char character = str.charAt(i);
            str_chr_array[i]=character;
        }
        
        for(int i=0;i<str.length();i++){
            
            String temp="";
            for(int j=0;j<str.length();j++){
                temp=temp+str_chr_array[j];
            }
            

            char char_temp=str_chr_array[0];
            for(int j=0;j<str.length()-1;j++){
                str_chr_array[j]=str_chr_array[j+1];
            }
            str_chr_array[str.length()-1]=char_temp;
            
            //System.out.println(temp);
            str_array[i]=temp;
        }
        
       Set<String> uniqueStrings = new HashSet<>();
       for (String string : str_array) {
             uniqueStrings.add(string);
        }

        System.out.println(uniqueStrings.size());
        
    }
}
/*  
Problem:
Game of Dragons
IronMan is stuck on a level of the Infinity War game which he is playing now. To advance this level, he has to kill all the N dragons that are present on this level. IronMan and the dragons have strength, which is represented by an integer. In the fight between him and dragon, the fight's outcome is determined by their strength. Initially, IronMan's strength equals S.

If IronMan starts dueling with the ith (1 <= i <= N) dragon and IronMan's strength is not greater than the dragon's strength Xi, then IronMan loses the duel and dies. But if IronMan's strength is greater than the dragon's strength, then he defeats the dragon and gets a bonus strength increase by Yi.

IronMan can fight the dragons in any order. Your task is to find out if he will be able to win all the duels without any loss.

Input Format:
The first line will contain two space-separated integers, the initial strength S and the number of dragons N.
Then N lines follow, each of which contains two space-separated integers Xi and Yi, where Xi is the strength of the dragon and Yi is the bonus strength which IronMan gains after defeating this dragon.

Output Format:
Print a single line containing either "YES" (without quotes), if IronMan can defeat all dragons or "NO" (without quotes) if he can't.

For example:
Input:
2 2
1 99
100 0

Output:
YES

Explanation:
IronMan's initial strength is 2 and the number of dragons also equals 2
The first dragon has strength equal to 1 and thus IronMan can defeat this dragon and gain 99 points
making his strength equal to 2 + 99 = 101.
Since 101 > 100, IronMan can defeat this dragon also and thus the answer is YES.

Second example:

Input:
8 1
100 100

Output:
NO

Explanation:
IronMan's initial strength is 8 but the required strength for the first dragon is 100 and hence, he dies and we print "NO". 

*/

import java.util.*;
class Game_of_Dragons{
    
    public static void main(String arg[]){
        
        Scanner sc=new Scanner(System.in);
        int initial_strength=sc.nextInt();
        int no_of_dragons=sc.nextInt();
        int dragon_power[]=new int[no_of_dragons];
        int bonus[]=new int[no_of_dragons];
        int index[]=new int[no_of_dragons];
        int k=0,flag2=1;
   
        for(int i=0;i<no_of_dragons;i++){
            dragon_power[i]=sc.nextInt();
            bonus[i]=sc.nextInt();
        }
        
        for(int i=0;i<no_of_dragons;i++){

                if(dragon_power[i]<initial_strength && index.length==0){
                    initial_strength=initial_strength+bonus[i];
                    //System.out.println(initial_strength);
                    index[k]=i;
                    k++;
                    i=0;
                }else{
                    
                    for(int x: index){
                        if(dragon_power[i]==x){
                            flag2=0;
                            break;
                        }
                    }
                    
                    if(flag2==1 && initial_strength>dragon_power[i]){
                        initial_strength=initial_strength+bonus[i];
                        //System.out.println(initial_strength);
                        index[k]=i;
                        k++;
                    }
                }
        }
        
        int flag=1;
        int total_power=0;
           for(int x: bonus){
               total_power=total_power+x;
           }
       // System.out.println(total_power+" "+initial_strength);
           if(initial_strength<total_power){
               flag=0;
        }
        
        if(flag==1){
            System.out.println("YES");
        }
        else{
             System.out.println("NO");
        }
        
    }
    
}
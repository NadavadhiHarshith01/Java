class Gcd{

      static int GCD(int x,int y){
        while(y!=0){
            if(x>y){
                x=x-y;

            }
            else{
                y=y-x;
            }
            
        }
        return (int) x;
    }


    public static void main(String arg[]){

        int gcd=GCD(13,17);
        System.out.println("GCD: "+gcd);
    }

}
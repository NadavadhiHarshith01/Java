class Exceptions{

    static int division(int x,int y) {
        try{
            return x/y;
        }
        catch(Exception e){
            System.out.println(e);
        }
        return x/y;
    }
    public static void main(String arg[]){
        int a=20;
        int b=0;
        int c=division(a,b);
        System.out.println(c);
    }


}
class User_define_division extends Exception{
    public int division(int x,int y)throws User_define_division{
        
        try{
             return x/y;
        }catch(Exception e){
            System.out.println("Division by zero");
        }
        return x/y;
    }
}



class User_define_exceptions{
    public static void main(String arg[]){
        int a=8;
        int b=0;
        User_define_division abc= new User_define_division();
        try{
            abc.division(a,b);
        }catch(User_define_division e){
            System.out.println(e);
        }
        
    }
}
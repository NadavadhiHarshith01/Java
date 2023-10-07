class Variable_arguments{

    static void max(int...x){
        for(int y:x){
            System.out.println(y);
        }
    }

    public static void main(String arg[]){
        max(1,2,43,5,343);
    }

}
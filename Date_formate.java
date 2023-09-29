public class Date_formate {
    public static void main(String rg[]){
        String date="29/09/2023";
        if(
              (date.matches("[0-2][0-9]/[0][0-9]/[0-9][0-9][0-9][0-9]"))
            ||(date.matches("[3][0-1]/[1][0-2]/[0-9][0-9][0-9][0-9]"))
            ||(date.matches("[3][0-1]/[0][0-9]/[0-9][0-9][0-9][0-9]"))
            
        ){
            System.out.println("Correct formate and date is valid");
        }else{
            System.out.println("Incorrect formate or date is valid");

        }

    }
}

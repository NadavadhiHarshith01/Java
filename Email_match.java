class Email_match{
	
	public static void main(String arg[]) {
		String str="harshith@gmail.com";
		
		if(str.matches(".*gmail.*")) {
			String username=str.substring(0,str.indexOf("@"));
			String domine=str.substring(str.indexOf("@")+1);
			System.out.println("username: "+username);
			System.out.println("Domine: "+domine);

		}
		else {
			System.out.println("It is not in gmail");
		}
	}
	
}
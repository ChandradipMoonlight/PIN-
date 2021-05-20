package regex.pincode;

import java.util.regex.*;

public class PinCode {
	
	public static boolean validatePin(String pinCode) {
		String regex = "^[1-9]{1}[0-9]{2}[0-9]{3}$";
		
		Pattern p = Pattern.compile(regex);
		
		if (pinCode == null) {
			System.out.println("Invalid PIN");	
		}
		Matcher m = p.matcher(pinCode);
		return m.matches();
		 }
	
	public static void main(String[] args) {
		System.out.println("Welcome to the PIN validation program");
		String pin1 = "400088";
		 System.out.println(pin1+" "+validatePin(pin1));
		 String pin2 = "A400088";
		 System.out.println(pin2+" "+validatePin(pin2));
		 String pin3 = "400088B";
		 System.out.println(pin3+" "+validatePin(pin3));
	}
}

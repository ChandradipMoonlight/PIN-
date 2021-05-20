package regex.pincode;

import java.util.Scanner;
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
		String pin = "400088";
		boolean a = validatePin(pin);
		if (a == true ) {
			System.out.println(pin+" is valid pin");
		} else {
			System.out.println(pin+" is invalid pin");
		}
		
	}
}

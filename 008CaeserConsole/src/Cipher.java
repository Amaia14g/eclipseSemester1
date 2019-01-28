import java.util.Scanner;

public class Cipher {
	
	private String alpha = "zebracdfghijklmnopqstuvwxy0123456789.: ";
	private String plainText ="";
	private String encodedText = "";
	private String answer = "";
	private int key = 0;
	Scanner kbd = new Scanner(System.in);
	

	
	
	
	public Cipher() {
		System.out.println("Entered the Caeser constructor");

	}

	public void getPlainText() {
		
		System.out.println("Enter plain text message ");
		plainText = kbd.nextLine();
		System.out.println("You have entered: " + plainText);
		
		
	}
	public void getEncodedText() {
		
	}

	public void getKey() {
		System.out.println("Enter the shift key");
		key = kbd.nextInt();
		System.out.println("this is the shift key entered: " + key);
		
	}


	public void encrypt() {

		for(int i = 0; i < plainText.length(); i++) {
			if(!alpha.contains(String.valueOf(plainText.charAt(i)))) {
				encodedText += " ";
			}
			else {
				encodedText += alpha.charAt(
						(alpha.indexOf(String.valueOf(plainText.charAt(i)).toLowerCase())+ key)%alpha.length());
			}
			System.out.println(plainText.charAt(i));
			
			
			
		}
		System.out.println(encodedText);
	}
	
	
	
	public void decrypt() {
	}

	
	
	public String getEncryptDecrypt() {
		while(true) {
		System.out.println("Do you want to encrypt or decrypt?");
		answer = kbd.nextLine();
		answer = String.valueOf(answer.charAt(0)).toUpperCase();
		System.out.println(answer);
		if (answer.equals ("E") || answer.equals("D")) {
			break;
		}
		else {
			System.out.println("I dont recognize that answer please try again");
		}
		}

			
		
		return answer;
		
	}

}

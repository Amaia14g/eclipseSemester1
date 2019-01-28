import java.util.Scanner;

import javax.swing.JOptionPane;

public class Cipher {
	
	private String alpha = "zebracdfghijklmnopqstuvwxy0123456789.: ";
	private String plainText ="";
	private String encodedText = "";
	private String answer = "";
	private int key = 0;
	Scanner kbd = new Scanner(System.in);
	

	
	
	
	public Cipher() {
		JOptionPane.showMessageDialog(null, "Entered the Caeser constructor");

	}

	public void getPlainText() {
		
		plainText = JOptionPane.showInputDialog("Enter plain text message ");
		plainText = kbd.nextLine();
		JOptionPane.showMessageDialog(null, "You have entered: " + plainText);
		
		
	}
	public void getEncodedText() {
		
		encodedText = JOptionPane.showInputDialog("Enter encoded text message ");
		encodedText = kbd.nextLine();
		JOptionPane.showMessageDialog(null,"You have entered: " + encodedText);
		
			
	}

	public void getKey() {
		JOptionPane.showInputDialog("Enter the shift key");
		key = kbd.nextInt();
		JOptionPane.showMessageDialog(null,"this is the shift key entered: " + key);
		
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
			JOptionPane.showMessageDialog(null, plainText.charAt(i));
			
			
			
		}
		JOptionPane.showMessageDialog(null, encodedText);
	}
	
	
	
	public void decrypt() {
		for(int i = 0; i < encodedText.length(); i++) {
			if(!alpha.contains(String.valueOf(encodedText.charAt(i)))) {
				plainText += " ";
			}
			else {
				plainText += alpha.charAt(
						(alpha.indexOf(String.valueOf(encodedText.charAt(i)).toLowerCase())+ 39-key)%alpha.length());
			}
			JOptionPane.showMessageDialog(null,encodedText.charAt(i));
			
			
			
		}
		JOptionPane.showMessageDialog(null, plainText);
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

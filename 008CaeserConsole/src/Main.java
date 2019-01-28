
public class Main {
	public static void main(String[] args) {
		Cipher openCaeser = new Cipher();
		
		
		//first ask if they want to encrypt or decrypt
		String crypt = openCaeser.getEncryptDecrypt();
		System.out.println("main, returned: " + crypt);
	
		switch (crypt) {

		case "E":
		System.out.println("you chose to encrypt");
		openCaeser.getPlainText();
		openCaeser.getKey();
		openCaeser.encrypt();

		break;
		
		case "D":
		System.out.println("you chose to decrypt");
		openCaeser.getEncodedText();
		openCaeser.getKey();
		openCaeser.decrypt();
	
		break;
		}
		
	}
}

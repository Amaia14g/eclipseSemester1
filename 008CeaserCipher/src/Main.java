import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Cipher openCaeser = new Cipher();
		
		
		//first ask if they want to encrypt or decrypt
		String crypt = openCaeser.getEncryptDecrypt();
		JOptionPane.showMessageDialog(null, "main, returned: " + crypt);
	
		switch (crypt) {

		case "E":
		JOptionPane.showMessageDialog(null,"you chose to encrypt");
		openCaeser.getPlainText();
		openCaeser.getKey();
		openCaeser.encrypt();

		break;
		
		case "D":
		JOptionPane.showMessageDialog(null,"you chose to decrypt");
		openCaeser.getEncodedText();
		openCaeser.getKey();
		openCaeser.decrypt();
	
		break;
		}
		
	}
}

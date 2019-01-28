import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Reader {

	public static void main(String[] args) {
		String fileName = "/home/compsci/eclipse-workspace/textfiles/Kennedy_Cuba_Crisis.txt";
		String line;
		ArrayList aList = new ArrayList();
		String alpha = "abcdefghijklmnopqrstuvwxyz0123456789.,:;?\"-['] ";
		
		int [] alphaCount = new int[alpha.length()];
		for (int a = 0; a < alpha.length(); a++) {
			alphaCount[a]=0;
		}

				
try {
	BufferedReader input = new BufferedReader(new FileReader(fileName));
	if(!input.ready()) {
		input.close();
		throw new IOException();
	}
	while ((line = input.readLine()) != null) {
		aList.add(line);
	}
	
	input.close();} 
catch(IOException e) {
	System.out.println("Error: " + e);
}
	//test did it work
		String listString = String.join("", aList).toLowerCase();

		int sz = aList.size();
		for (int i = 0; i < sz; i++) {
			for (int z = 0; z < aList.get(i).toString().length(); z++) {
				alphaCount[alpha.indexOf(String.valueOf((aList.get(i).toString()).charAt(z)).toLowerCase())] += 1;
			
		}
		System.out.println(aList.get(i).toString());
	}
		
		for(int i = 0; i < alpha.length(); i++) {
		System.out.println(alpha.charAt(i) + ":" +alphaCount[i]);
		}


	}// end of main

}//end of reader

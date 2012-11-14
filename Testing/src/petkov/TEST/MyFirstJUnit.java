package petkov.TEST;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyFirstJUnit {

	/**
	 * @param args
	 */

	//publi
	public static int readFile(String filePath){
		FileInputStream fistream = null;
		DataInputStream distream = null;
		int counter = 0;
		try{
			fistream = new FileInputStream(filePath);
			distream = new DataInputStream(fistream);
			BufferedReader bufreader = new BufferedReader(new InputStreamReader(distream));
			String currentLine = null;
			while((currentLine = bufreader.readLine()) != null){
				System.out.println(currentLine);
				counter++;
			}
			
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try {
				distream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return counter;
	}
	public static void main(String[] args) throws IOException{
		readFile("petkov.txt");
//		my comment before pull
	}

}

package hallojava9;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class expression20901 {

	public static void main(String[] args) {
		File file = new File("");
		FileReader fileReader;
		try{
			fileReader = new FileReader(file);
			int text;
			while((text = fileReader.read()) !=-1){
				System.out.println((char)text);
			}

	    fileReader.close();
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}

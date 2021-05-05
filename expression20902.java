package hallojava9;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class expression20902 {

	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			File file = new File("");
			fw = new FileWriter(file);
			fw.write("");
			fw.flush();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fw != null) {
					fw.close();
				}
			}catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}

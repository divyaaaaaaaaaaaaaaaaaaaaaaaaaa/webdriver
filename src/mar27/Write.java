package mar27;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Write {

	public static void main(String[] args)throws Throwable {
		//create new file
		File f = new File("G:/seleniumwrite.doc") ;
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("i want job in top MNC");
		bw.newLine();
		bw.write("with 20Lpackage");
		bw.newLine();
		bw.write("with work at home facility");
		bw.flush();
		bw.close();
	}

}

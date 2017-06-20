import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy {
	
	static void copy(String name1, String name2){

		File a = new File(name1);
		File b = new File(name2);
		
		FileReader file1 = null;
		FileWriter file2 = null;
		
		BufferedReader one = null;
		BufferedWriter two = null;
		
		if (a.exists()){
			try{
				
				
				if (b.exists()){
					b.delete();
				}
				
				b.createNewFile();
				
				file1 = new FileReader(name1);
				file2 = new FileWriter(name2);
				
				one = new BufferedReader(file1);
				two = new BufferedWriter(file2);
				
				while(true){
					String line = one.readLine();
					if (line == null) break;
					System.out.println(line);
					two.write(line);
				}
			} catch(IOException e){
				e.printStackTrace();
			} finally {
				try{
					one.close();
					file1.close();
					two.close();
					file2.close();
					
				} catch(IOException e1){
					e1.printStackTrace();
				}
			}
		} else {
			System.out.print("Всё грустноо!!!");
		}
		
	}
	
	public static void main(String[] args) throws IOException {
	
		if (args.length == 2){
			copy("/home/pikatolik/Документы/Java/texts/text.txt", "/home/pikatolik/Документы/Java/texts/text1.txt");
		}
		String current = new java.io.File( "." ).getCanonicalPath();
	    System.out.println("Current dir:"+current);
	    String currentDir = System.getProperty("user.dir");
	    System.out.println("Current dir using System:" +currentDir);
	}

}

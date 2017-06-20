import java.io.FileInputStream; 
import java.io.FileOutputStream;
import java.io.IOException;

public class Input {

	int somedata[]= {56,230,123,43,11,37};
	FileOutputStream myFile = null;
	try {
		myFile = new FileOutputStream("xyz.dat");
		for (int i = 0; i <somedata.length; i++){
			myFile.write(somedata[i]);
		}
	} catch (IOException e) {
		System.out.println("Невозможно записать данные в файл: "+
		e.toString());
	} finally{
		try{
			myFile.close();
		} catch (Exception e1){
			e1.printStackTrace();
		}
	}
}

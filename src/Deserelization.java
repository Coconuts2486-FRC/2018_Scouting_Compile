import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Deserelization {
@SuppressWarnings("unchecked")
private static int i=0;
@SuppressWarnings("unchecked")
public void Deserelize() {
	
	
	while(i<Game_Array.files.size()) {
		ArrayList<Game_Data> e = new ArrayList<Game_Data>();
	 try {
       FileInputStream fileIn = new FileInputStream(System.getProperty("user.dir") + "//"+"Scout Data/"+Game_Array.files.get(i));
       ObjectInputStream in = new ObjectInputStream(fileIn);
       e = (ArrayList<Game_Data>) in.readObject();
       System.out.println(e.toString());
       Game_Array.GameList.addAll(e);
       in.close();
       fileIn.close();
       i++;
    }catch(IOException ie) {
       ie.printStackTrace();
       
    }catch(ClassNotFoundException c) {
       System.out.println("Employee class not found");
       c.printStackTrace();
       
    }
       
    }
}
public void FileGetters() {
	File fil = new File(System.getProperty("user.dir") + "//"+"Scout Data");
	File fil2 = new File(System.getProperty("user.dir") + "//"+"Scout Data2");
	if(!fil.exists()) {
		fil.mkdirs();
	}
	if(!fil2.exists()) {
		fil2.mkdirs();
	}
	File[] files = new File(System.getProperty("user.dir") + "//"+"Scout Data").listFiles();
	
	//System.out.println(files.length);

	for (File file : files) {
	    if (file.isFile()) {
	        Game_Array.files.add("/"+file.getName());
	    }
	}
	Game_Array.files.remove(0);
}
}

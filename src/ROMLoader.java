import java.io.*;

//Loads game ROM

public class ROMLoader {
	
	public ROMLoader() {
		
	}
	
	public InputStream load(String path) throws FileNotFoundException {
		File f = new File(path);
		FileInputStream fis = null;
		fis = new FileInputStream(f);
		return fis;
	}
	
	public OutputStream write(String path) throws FileNotFoundException {
		File f = new File(path);
		FileOutputStream fos = null;
		fos = new FileOutputStream(f);
		return fos;
	}
}

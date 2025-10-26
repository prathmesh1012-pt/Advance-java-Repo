import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
class demoFileHandling{
	public static void main(String[] args){
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream("input.txt");
			out = new FileOutputStream("input.txt");
			int c;
			while((c = in.read()) != -1){
				out.write(c);
				
			}
		
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally {
			try{
				
			if(in != null){
				in.close();	
			}
			}
			catch(IOException e){
				e.printStackTrace();
			}
			try{
			if(out != null){
				out.close();
			}
			}
			catch(IOException e){
				e.printStackTrace();
			}
			System.out.print("Done!");
		}
	}
}
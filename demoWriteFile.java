import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

class demoWriteFile{
	public static void main(String[] args){
		try{
		FileWriter FW = new FileWriter("input.txt");
			FW.write("Java is programming language");
			System.out.println(FW);
			FW.close();
			System.out.println("Write Successfuly!");
		}
		catch (IOException e){
			System.out.println("Error Occured!");
		}
	}
}
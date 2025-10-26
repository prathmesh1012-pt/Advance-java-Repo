import java.io.File;
import java.io.IOException;
class createFileDemo{
	public static void main(String[] args){
		File obj = new File("D:\\input.txt");
		try{
			if(obj.createNewFile()){
				System.out.println(obj.getName());
			}
			else{
				System.out.println("File was not created!");
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
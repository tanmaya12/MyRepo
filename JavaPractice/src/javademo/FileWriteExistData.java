package javademo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileWriteExistData 
{
	public static void main(String[] args) 
	{
		try 
		{
			File file= new File("./Tan.txt");
			if (!file.exists()) 
			{
				System.out.println("file not found");
				file.createNewFile();
			}
			//PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("outfilename", true)));
			FileWriter fw= new FileWriter(file.getAbsoluteFile(),true);// (file,true);
			BufferedWriter bw= new BufferedWriter(fw);
			bw.write("\n\nOdisha\nIndia\nTanmaya Kumar Behera\nCuttack");
			bw.flush();
			bw.close();
			FileReader fr= new FileReader("./Tan.txt");
			BufferedReader br= new BufferedReader(fr);//new FileReader(file));
			String str;
			
			//System.out.println(br.readLine()+"----");
			while((str=br.readLine())!=null)
			{
				System.out.println(str);
			}
			br.close();
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

}

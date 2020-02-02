package javafifty;
//Write a program Create a file and How to Read a File Line By Line in Java?
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileLineRead 
{
	public static void main(String[] args)
	{		
		try 
		{
			File f= new File("./Files/data.txt");
			if (!f.exists()) 
			{
				System.out.println("File not exist.");
				f.createNewFile();
			}
			FileReader fb= new FileReader(f);
			BufferedReader br= new BufferedReader(fb);
			String str;
			while ((str=br.readLine())!=null)
			{
				System.out.println(str);
			}
			br.close();
		} 
		catch (IOException e) 
		{			
			e.printStackTrace();
			e.getMessage();
		}
	}
}

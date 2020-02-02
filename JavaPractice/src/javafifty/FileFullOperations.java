package javafifty;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.Scanner;

//How to check a file exist or not? How to renaming a file? How to copy one file into another file? How to delete a file? How to read a file? How to write to a file?
public class FileFullOperations
{
	public static void main(String[] args) 
	{
		File f= new File("./Files/data1.txt");
		try
		{
			if (!f.exists()) 
			{
				System.out.println("File doesn't exits.");
				createFile(f);
				System.out.println("File Created.");
			}
			else 
			{
				System.out.println("File exits.");
				//fileRename(f);
				//deleteFile(f);
				writeFile(f);
				readFile(f);
				copyFile2(f);
				
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}//main()
	static void copyFile2(File src) throws IOException
	{
		FileReader fr= new FileReader(src);
		FileWriter fw= new FileWriter(new File("./Copy/my.txt"));
		int i;
		while ((i=fr.read())!=-1) 
		{
			fw.write(i);
		}
		fw.close();
		fr.close();
	}
	static void copyFile(File src) throws IOException 
	{		
		Files.copy(src.toPath(), new File("./Copy/my.txt").toPath());
		//org.openqa.selenium.io.FileHandler.copy(src, new File("./Copy/my.txt"));
		//org.apache.commons.io.FileUtils.copyFile(src, new File("./Copy/my.txt"));
	}
	static void writeFile2(File f) throws IOException 
	{
		PrintWriter pw= new PrintWriter(new BufferedWriter(new FileWriter(f)));
		pw.write("Naranapara,\nChandol,\nKendrapara,");
//		while(true)
//        {
//            System.out.println("Enter the text : ");
//            String str = br.readLine();
//            if(str.equalsIgnoreCase("exit"))
//                break;
//            else
//                pw.println(str);
//        }
		pw.flush();
		pw.close();
	}
	static void writeFile(File f) throws IOException 
	{
		FileWriter fw= new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Naranapara,\nChandol");
		bw.flush();
		bw.close();		
	}
	static void readFile3(File f) throws IOException
	{
		FileInputStream fis= new FileInputStream(f);
		int i;		
		do {
			i=fis.read();
			System.out.print((char)i);
		} while (i!=-1);
		fis.close();
	}
	static void readFile2(File f) throws IOException
	{
		Scanner sc= new Scanner(f);
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
		sc.close();
	}
	static void readFile(File f) throws IOException
	{
		FileReader fr= new FileReader(f);
		BufferedReader br= new BufferedReader(fr);
		String str=br.readLine();
		while(str!=null)
		{
			System.out.println(str);
			str=br.readLine();
		}
		br.close();
	}
	static void deleteFile(File f) 
	{
		if (f.delete()) //f.deleteOnExit();
		{
			System.out.println("deleted");
		} else {
			System.out.println("not deleted");
		}		
	}

	static void fileRename(File fold) 
	{		
		File fnew= new File("./Files/Newtext.txt");
		if (fold.renameTo(fnew)) 
		{
			System.out.println("Renames sucessfully.");
		} else {
			System.out.println("Renames unsucessfully.");
		}
	}

	static void createFile(File f) throws IOException 
	{		
		f.createNewFile();		 
	}
}

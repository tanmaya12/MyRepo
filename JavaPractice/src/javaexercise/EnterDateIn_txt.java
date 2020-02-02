package javaexercise;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;


public class EnterDateIn_txt
{
	public static void main(String[] args) throws Exception
	{
		File fis= new File("C:\\Workplace\\MavenProjects\\AppiumDemo\\test.txt");
		FileReader fr= new FileReader(fis);
		BufferedReader br= new BufferedReader(fr);
		String s="";
		ArrayList<String> li= new ArrayList<>();
		
		while ((s=br.readLine())!=null)
		{ li.add(s); }
		br.close();
		li.remove(li.size()-1); //last row removed
		
		Date d= new Date();
		Format sd= new SimpleDateFormat("ddMMMyyyy");		
		li.add(sd.format(d)); // entry current date in last row
		
		System.out.println(li);
		FileWriter fw= new FileWriter(fis);
		BufferedWriter bw= new BufferedWriter(fw);
		for (Iterator<String> iterator = li.iterator(); iterator.hasNext();)
		{
			String str = (String) iterator.next();
			bw.write(str);
			bw.newLine();
		}
		bw.flush(); bw.close();
		
	}
}

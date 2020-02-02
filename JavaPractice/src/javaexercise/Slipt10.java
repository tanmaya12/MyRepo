package javaexercise;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Slipt10 {

	public static void main(String[] args) throws Exception {
		File f= new File("C:\\Workplace\\MavenProjects\\AppiumDemo\\order.txt");
		FileReader fr= new FileReader(f);
		BufferedReader br= new BufferedReader(fr);
		String s="";
		ArrayList<String> li= new ArrayList<>();
		
		while ((s=br.readLine())!=null)
		{ li.add(s); }		
		br.close();	
		FileOutputStream fw;
		BufferedWriter bw;
		String str="";
		
		int j = 0;
		for (int i = 0; i < 10; i++) 
		{
			fw= new FileOutputStream(new File("C:\\Workplace\\MavenProjects\\AppiumDemo\\order"+1+".txt"));
			bw= new BufferedWriter(new OutputStreamWriter(fw));
			int count=0;
			while((j < li.size())&&(count<10))			
			{
				str=li.get(j);
				//System.out.print(li.get(j)+",");				
				bw.write(str);
				bw.newLine();				
				j++;
				count++;
			}	
			bw.flush(); bw.close();	
			//System.out.println();
		}

	}

}

package javaexercise;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class Split2 {

	public static void main(String[] args) throws Exception {
		ArrayList<String> li= new ArrayList<>(Arrays.asList("tanu","kumar","cabu"));
		
		FileOutputStream fw= new FileOutputStream(new File("C:\\Workplace\\MavenProjects\\AppiumDemo\\orderreee.txt"));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(fw));
		int count=0;
		int j=0;
		while((j < li.size())&&(count<10))			
		{
			String str=li.get(j);
			System.out.print(li.get(j)+",");				
			bw.write(str);
			bw.newLine();				
			j++;
			count++;
		}	
		bw.flush(); bw.close();	
	
	
	}

}

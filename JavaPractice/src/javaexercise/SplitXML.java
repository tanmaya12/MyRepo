package javaexercise;

import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.*;
import javax.xml.transform.*; 
import javax.xml.transform.dom.DOMSource; 
import javax.xml.transform.stream.StreamResult;

public class SplitXML
{
 static public void main(String[] arg) throws Exception
 {
	 DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	 DocumentBuilder builder = factory.newDocumentBuilder();
	 Document doc = builder.parse("C:\\Workplace\\cucu.xml");
	
	 TransformerFactory tranFactory = TransformerFactory.newInstance(); 
	 Transformer aTransformer = tranFactory.newTransformer(); 
	
	
	 NodeList list = doc.getFirstChild().getChildNodes();
	 int jN=0;
	 for (int i=0; jN<list.getLength(); i++)
	 {
		 int count=1;
		 while((count<=10)&&(jN<list.getLength()))
		 {
			 if(jN==list.getLength())
			 {break;}
			 Node element = list.item(jN).cloneNode(true);

		 if(element.hasChildNodes())
		 {
//		   Source src = new DOMSource(element); 
//		   FileOutputStream fs=new FileOutputStream("C:\\Workplace\\xml\\"+ i +".xml");
//		   Result dest = new StreamResult(fs);
//		   aTransformer.transform(src, dest);
//		   fs.close();
		   addNode(element,i);
		   }
		 count++; jN++;
	   }
	 }
	 System.out.println("done");

  }
 static void addNode(Node node, int i) throws Exception
 {
	 TransformerFactory tranFactory = TransformerFactory.newInstance(); 
	 Transformer aTransformer = tranFactory.newTransformer(); 
	 File f= new File("C:\\Workplace\\xml\\n"+ i +".xml");
	 if (f.exists()) 
	 {
		 writeToFile(node,f);
		//append
		 System.out.println("if");
	} else 
	{
		Source src = new DOMSource(node); 
		   FileOutputStream fs=new FileOutputStream("C:\\Workplace\\xml\\"+ i +".xml");
		   Result dest = new StreamResult(fs);
		   aTransformer.transform(src, dest);
		   fs.close();
		   System.out.println("else");
	}
 }
 private static void writeToFile(Node node, File file) throws Exception 
 {
	 DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	 DocumentBuilder builder = factory.newDocumentBuilder();
	 Document doc = builder.parse(file);
	 Node n= doc.appendChild(node);
	 Transformer transformer = TransformerFactory.newInstance().newTransformer();
	 transformer.transform(new DOMSource(node), new StreamResult(new FileWriter(file)));
	}
}


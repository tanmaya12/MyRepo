package javaexercise;
import java.io.File;
import java.io.FileWriter;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class SplitXML2 
{
    public static void main(String[] args) throws Exception 
    {
	    File input = new File("C:\\Workplace\\cucu.xml");
	    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
	    Document doc = (Document) dbf.newDocumentBuilder().parse(input);
	    XPath xpath = XPathFactory.newInstance().newXPath();
	    NodeList nodes = (NodeList) xpath.evaluate("//dependency", doc,  XPathConstants.NODESET);
	    int itemsPerFile = 10;
	    int fileNumber = 1;
	    Document currentDoc = (Document) dbf.newDocumentBuilder().newDocument();
	    Node rootNode;
	    rootNode = currentDoc.createElement("dependencies");
	    File currentFile = new File("C:\\Workplace\\xml\\"+fileNumber+".xml");
	    for (int i=1; i <= nodes.getLength(); i++) 
	    {
	        Node imported = currentDoc.importNode(nodes.item(i-1), true);
	        rootNode.appendChild(imported);	
	        if (i % itemsPerFile == 0)
	        {
	            writeToFile(rootNode, currentFile);
	            rootNode = currentDoc.createElement("dependencies");
	            currentFile = new File("C:\\Workplace\\xml\\"+(++fileNumber)+".xml");
	        }
	        else
	        {
	            writeToFile(rootNode, currentFile);
	        }
	    }
	    System.out.println("done");

    }

	private static void writeToFile(Node node, File file) throws Exception 
	{
	    Transformer transformer = TransformerFactory.newInstance().newTransformer();
	    transformer.transform(new DOMSource(node), new StreamResult(new FileWriter(file)));
	}
}
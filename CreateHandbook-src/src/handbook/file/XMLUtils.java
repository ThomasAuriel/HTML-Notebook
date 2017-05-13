package handbook.file;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import handbook.structure.note.Note;

public class XMLUtils {

	/**
	 * Parse a string in XML
	 * 
	 * @param content
	 * @return
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 * @throws IOException
	 */
	public static Document parseXML(String content) throws ParserConfigurationException, SAXException, IOException {

		// Parse the balise in XML.
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse(new InputSource(new StringReader(content)));

		return document;
	}

	/**
	 * Save note XML element in a output file.
	 * 
	 * @param note
	 * @param output
	 */
	public static void writeFile(Note note, File output) {
		try {
			
			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();

			// Add new line after each balises. Easier to read.
			// For debug only
			// transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			// transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount",
			// "2");
			// transformer.setOutputProperty("{http://xml.apache.org/xalan}indent-amount",
			// "2");

			DOMSource source = new DOMSource(note.getElement());
			StreamResult result = new StreamResult(output);

			transformer.transform(source, result);
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Impossible to convert the final note or impossible to write the file at : "
					+ output.getAbsolutePath());
		}
	}

}
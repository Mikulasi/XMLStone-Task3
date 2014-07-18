package by.epam.stone.xml;

import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class DOMParser {
    public static final Logger LOGGER = Logger.getLogger(DOMParser.class);

    public static void parse() {
        try {

            File fXmlFile = new File("src/resources/stone.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

            LOGGER.info("Root element :" + doc.getDocumentElement().getNodeName());

            NodeList stoneList = doc.getElementsByTagName("stone");


            for (int temp = 0; temp < stoneList.getLength(); temp++) {

                Node nNode = stoneList.item(temp);

                LOGGER.info("\nCurrent Element :" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;

                    LOGGER.info("Stone id : " + eElement.getAttribute("id"));
                    LOGGER.info("Preciousness : " + eElement.getElementsByTagName("preciousness").item(0).getTextContent());
                    LOGGER.info("Origin : " + eElement.getElementsByTagName("origin").item(0).getTextContent());
                    LOGGER.info("Color : " + eElement.getElementsByTagName("color").item(0).getTextContent());
                    LOGGER.info("Transparency : " + eElement.getElementsByTagName("transparency").item(0).getTextContent());
                    LOGGER.info("Number of faces : " + eElement.getElementsByTagName("faces").item(0).getTextContent());
                    LOGGER.info("Value : " + eElement.getElementsByTagName("value").item(0).getTextContent());

                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}

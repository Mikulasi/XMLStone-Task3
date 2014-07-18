package by.epam.stone.xml;

import by.epam.stone.entities.Stone;
import org.apache.log4j.Logger;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.parsers.SAXParser;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class XMLSAXParser {
    public static final Logger LOGGER = Logger.getLogger(XMLSAXParser.class);

    public ArrayList<Stone> parsingSAX(){

        try {
            SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
            SAXParser parser = saxParserFactory.newSAXParser();
            SAXHandler handler = new SAXHandler();
            parser.parse(new File("src/resources/stone.xml"), handler);
            for (Stone st : handler.getStoneList()) {
                LOGGER.info(st);
            }
        }catch (ParserConfigurationException e){
            LOGGER.error("Parser config error: " +e);
        } catch (SAXException e) {
            LOGGER.error("SAX Parser exception: " +e);
        } catch (IOException e){
            LOGGER.error("I/O exception: " +e);
        }return null;
    }
}

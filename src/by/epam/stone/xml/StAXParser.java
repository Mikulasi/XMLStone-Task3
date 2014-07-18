package by.epam.stone.xml;

import by.epam.stone.entities.Stone;

import javax.xml.stream.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class StAXParser {
    private ArrayList<Stone> stones;
    private Stone stone;

    public List<Stone> parseXML(String fileName) {
        try {
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLStreamReader xmlReader = xmlInputFactory.createXMLStreamReader(new FileInputStream(fileName));
            parseStAX(xmlReader);
            return stones;
        } catch (FileNotFoundException | XMLStreamException e) {
            e.printStackTrace();
            return null;
        }
    }

    private void parseStAX(XMLStreamReader xmlReader) throws XMLStreamException {
        while (xmlReader.hasNext()) {
            int event = xmlReader.next();
            switch (event) {
                case XMLStreamConstants.START_ELEMENT:
                    String localName = xmlReader.getLocalName();
                    switch (localName) {
                        case "stone":
                            stone = new Stone();
                            stone.setId(Integer.parseInt(xmlReader.getAttributeValue("", "id")));
                            break;
                        case "name":
                            stone.setName(xmlReader.getElementText());
                            break;
                        case "preciousness":
                            stone.setPreciousness(xmlReader.getElementText());
                            break;
                        case "origin":
                            stone.setOrigin(xmlReader.getElementText());
                            break;
                        case "color":
                            stone.setColor(xmlReader.getElementText());
                            break;
                        case "transparency":
                            stone.setTransparency(Double.parseDouble(xmlReader.getElementText()));
                            break;
                        case "faces":
                            stone.setFaces(Integer.parseInt(xmlReader.getElementText()));
                            break;
                        case "value":
                            stone.setValue(Integer.parseInt(xmlReader.getElementText()));
                            break;
                    }
                    break;
                case XMLStreamConstants.END_ELEMENT:
                    if (xmlReader.getLocalName().equals("stone")) {
                        stones.add(stone);
                    }
                    break;
            }
            break;
        }
    }
}
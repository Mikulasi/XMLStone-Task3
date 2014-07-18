package by.epam.stone.xml;

import by.epam.stone.entities.Stone;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class StAXParser {
    public void parseStAX() {
        String fileName = "src/resources/stone.xml";
        StAXParser.parseXML(fileName);
        List<Stone> stList = parseXML(fileName);
        for (Stone stn : stList) {
            System.out.println(stn.toString());
        }
    }

    private static List<Stone> parseXML(String fileName) {
        ArrayList<Stone> stnList = new ArrayList<>();
        Stone stn = null;
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        try {
            XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(new FileInputStream(fileName));
            while (xmlEventReader.hasNext()) {
                XMLEvent xmlEvent = xmlEventReader.nextEvent();
                if (xmlEvent.isStartElement()) {
                    StartElement startElement = xmlEvent.asStartElement();
                    if (startElement.getName().getLocalPart().equals("stone")) {
                        stn = new Stone();
                        Attribute idAttr = startElement.getAttributeByName(new QName("id"));
                        if (idAttr != null) {
                            stn.setId(Integer.parseInt(idAttr.getValue()));
                        }
                    } else if (startElement.getName().getLocalPart().equals("name")) {
                        xmlEvent = xmlEventReader.nextEvent();
                        stn.setName(xmlEvent.asCharacters().getData());
                    } else if (startElement.getName().getLocalPart().equals("preciousness")) {
                        xmlEvent = xmlEventReader.nextEvent();
                        stn.setPreciousness(xmlEvent.asCharacters().getData());
                    } else if (startElement.getName().getLocalPart().equals("origin")) {
                        xmlEvent = xmlEventReader.nextEvent();
                        stn.setOrigin(xmlEvent.asCharacters().getData());
                    } else if (startElement.getName().getLocalPart().equals("color")) {
                        xmlEvent = xmlEventReader.nextEvent();
                        stn.setColor(xmlEvent.asCharacters().getData());
                    } else if (startElement.getName().getLocalPart().equals("transparency")) {
                        xmlEvent = xmlEventReader.nextEvent();
                        stn.setTransparency(Double.parseDouble(xmlEvent.asCharacters().getData()));
                    } else if (startElement.getName().getLocalPart().equals("faces")) {
                        xmlEvent = xmlEventReader.nextEvent();
                        stn.setFaces(Integer.parseInt(xmlEvent.asCharacters().getData()));
                    } else if (startElement.getName().getLocalPart().equals("value")) {
                        xmlEvent = xmlEventReader.nextEvent();
                        stn.setValue(Integer.parseInt(xmlEvent.asCharacters().getData()));
                    }
                }
                if (xmlEvent.isEndElement()) {
                    EndElement endElement = xmlEvent.asEndElement();
                    if (endElement.getName().getLocalPart().equals("helm-type")) {
                        stnList.add(stn);
                    }
                }
            }

        } catch (FileNotFoundException | XMLStreamException e) {
            e.printStackTrace();
        }
        return stnList;
    }
}

package by.epam.stone.xml;

import by.epam.stone.entities.Stone;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;

public class SAXHandler extends DefaultHandler {
    ArrayList<Stone> stoneList = new ArrayList<>();
    Stone stone;
    private StringBuilder dataBuffer;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        switch (qName) {

            case "stone":
                stone = new Stone() {};
                stone.setId(Integer.parseInt(attributes.getValue("id")));
                break;
        }
    }


        @Override
        public void endElement (String uri, String localName, String qName)throws SAXException {
            switch (qName) {

                case "stone":
                    stoneList.add(stone);
                    break;

                case "name":
                    stone.setName(dataBuffer.toString());
                    break;
                case "preciousness":
                    stone.setPreciousness(dataBuffer.toString());
                    break;
                case "origin":
                    stone.setOrigin(dataBuffer.toString());
                    break;
                case "color":
                    stone.setColor(dataBuffer.toString());
                    break;
                case "transparency":
                    stone.setTransparency(Double.parseDouble(dataBuffer.toString()));
                    break;
                case "faces":
                    stone.setFaces(Integer.parseInt(dataBuffer.toString()));
                    break;
                case "value":
                    stone.setValue(Integer.parseInt(dataBuffer.toString()));
                    break;
            }
        }


        @Override
        public void characters ( char[] ch, int start, int length)throws SAXException {
            dataBuffer = new StringBuilder();
            dataBuffer.append(ch, start, length);
        }
    }

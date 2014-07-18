package by.epam.stone.xml;

import by.epam.stone.entities.Stone;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;

public class SAXHandler extends DefaultHandler {
    private ArrayList<Stone> stoneList = new ArrayList<>();
    private Stone stone;
    private String holder;

    public ArrayList<Stone> getStoneList() {
        return stoneList;
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        switch (qName) {

            case "stone":
                stone = new Stone();
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
                    stone.setName(holder);
                    break;
                case "preciousness":
                    stone.setPreciousness(holder);
                    break;
                case "origin":
                    stone.setOrigin(holder);
                    break;
                case "color":
                    stone.setColor(holder);
                    break;
                case "transparency":
                    stone.setTransparency(Double.parseDouble(holder));
                    break;
                case "faces":
                    stone.setFaces(Integer.parseInt(holder));
                    break;
                case "value":
                    stone.setValue(Integer.parseInt(holder));
                    break;
            }
        }


        @Override
        public void characters ( char[] ch, int start, int length)throws SAXException {
            holder = String.valueOf(ch, start, length);
        }
    }

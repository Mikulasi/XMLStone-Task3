package by.epam.stone.main;

import by.epam.stone.xml.StAXParser;

public class StoneMain {
    public static void main(String[] args) {
        /*DOMParser.parse();*/
        /*XMLSAXParser xmlsaxParser = new XMLSAXParser();
        xmlsaxParser.parsingSAX();*/
        StAXParser stAXParser = new StAXParser();
        stAXParser.parseXML("src/resources/stone.xml");

    }
}

package by.epam.stone.main;

import by.epam.stone.xml.DOMParser;
import by.epam.stone.xml.SAXParser;
import by.epam.stone.xml.StAXParser;

public class StoneMain {
    public static void main(String[] args) {
        DOMParser.parse();
        SAXParser.parsingSAX();
        StAXParser stAXParser = new StAXParser();
        stAXParser.parseStAX();

    }
}

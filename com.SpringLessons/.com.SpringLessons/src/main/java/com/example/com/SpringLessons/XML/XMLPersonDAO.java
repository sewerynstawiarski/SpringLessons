package com.example.com.SpringLessons.XML;

import org.springframework.beans.factory.annotation.Autowired;


public class XMLPersonDAO {

    public XMLJdbcConnection getXMLJdbcConnection() {
        return XMLjdbcConnection;
    }

    public void setXMLJdbcConnection(XMLJdbcConnection XMLjdbcConnection) {
        this.XMLjdbcConnection = XMLjdbcConnection;
    }

    XMLJdbcConnection XMLjdbcConnection;

}

package com.example.com.SpringLessons.XML;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;


public class XMLJdbcConnection {
    XMLJdbcConnection() {
        System.out.println("XMLJdbc Connection");
    }
}

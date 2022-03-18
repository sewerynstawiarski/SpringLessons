package com.example.com.SpringLessons.CDI;

import javax.inject.Inject;
import javax.inject.Named;

@Named()
public class SomeCDIBusiness {
    @Inject
    SomeCDIDAO someCDIDAO;

    public SomeCDIDAO getSomeCDIDAO() {
        return someCDIDAO;
    }

    public void setSomeCDIDAO(SomeCDIDAO someCDIDAO) {
        this.someCDIDAO = someCDIDAO;
    }
    public int findGreatest() {
        int greatest = Integer.MIN_VALUE;
        int[] data = someCDIDAO.getData();
        for (int i : data) {
            if (i > greatest) {
                greatest = i;
            }
        }
        return greatest;
    }
}

package com.SpringKurs.Mockito.MockitoKurs;

public class SomeBusinessImplementation {
    private DataService dataService;

    public SomeBusinessImplementation(DataService dataService) {
        this.dataService = dataService;
    }

    int findTheGreatestValue() {
        int data[] = dataService.retrieveAllData();
        int greatest =Integer.MIN_VALUE;
        for (int value : data) {
            if (value > greatest) {
                greatest=value;
            }
        }
        return greatest;
    }

}

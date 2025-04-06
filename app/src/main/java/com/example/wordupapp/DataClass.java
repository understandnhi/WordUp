package com.example.wordupapp;

public class DataClass {
    private String deckName;
//    private String dataFront;
//    private String dataBack;
    private int known;
    private int notKnown;
    private int dataImage;

    public String getDeckName() {
        return deckName;
    }

//    public String getDataFront() {
//        return dataFront;
//    }
//
//    public String getDataBack() {
//        return dataBack;
//    }

    public int getKnown() {
        return known;
    }

    public int getNotKnown() {
        return notKnown;
    }

    public int getDataImage() {
        return dataImage;
    }

    public DataClass(int dataImage, String deckName, int known, int notKnown) {
        this.dataImage = dataImage;
        this.known = known;
        this.notKnown = notKnown;
//        this.dataBack = dataBack;
//        this.dataFront = dataFront;
        this.deckName = deckName;
    }
}

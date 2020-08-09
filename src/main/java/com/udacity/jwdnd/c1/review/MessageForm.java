package com.udacity.jwdnd.c1.review;

public class MessageForm {
    private String animalName;

    private String adjective;

    public MessageForm(String animalName, String adjective){
        this.animalName = animalName;
        this.adjective = adjective;
    }

    public String getAnimalName(){
        return this.animalName;
    }

    public void setAnimalName(String animalName){
        this.animalName = animalName;
    }

    public String getAdjective(){
        return this.adjective;
    }

    public void setAdjective(String adjective){
        this.adjective = adjective;
    }
}

package com.deepaknautiyal.storyteller.model;

/**
 * Created by deepak.nautiyal on 12/1/15.
 */
public class Choice {

    private String mChoiceText;
    private int mNextPage;

    public Choice(String text, int nextPage){
        mChoiceText = text;
        mNextPage = nextPage;
    }

    public String getChoiceText(){
        return mChoiceText;
    }

    public void setChoiceText(String text){
        mChoiceText = text;
    }

    public int getNextPage(){
        return mNextPage;
    }

    public void setNextPage(int nextPage){
        mNextPage = nextPage;
    }

}

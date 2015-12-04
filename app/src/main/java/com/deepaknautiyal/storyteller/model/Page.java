package com.deepaknautiyal.storyteller.model;

/**
 * Created by deepak.nautiyal on 12/1/15.
 */
public class Page {

    private int mImageId;
    private String mStoryText;
    private Choice mChoice1;
    private Choice mChoice2;
    private boolean mIsFinal = false;

    public Page(int imageId, String text, Choice choice1, Choice choice2){
        mImageId = imageId;
        mStoryText = text;
        mChoice1 = choice1;
        mChoice2 = choice2;
    }

    public Page(int imageId, String text){
        mImageId = imageId;
        mStoryText = text;
        mChoice1 = null;
        mChoice2 = null;
        mIsFinal = true;

    }

    public int getImageId() {
        return mImageId;
    }

    public void setImageId(int mImageId) {
        this.mImageId = mImageId;
    }

    public String getStoryText() {
        return mStoryText;
    }

    public void setStoryText(String mStoryText) {
        this.mStoryText = mStoryText;
    }

    public Choice getChoice1() {
        return mChoice1;
    }

    public void setChoice1(Choice mChoice1) {
        this.mChoice1 = mChoice1;
    }

    public Choice getChoice2() {
        return mChoice2;
    }

    public void setChoice2(Choice mChoice2) {
        this.mChoice2 = mChoice2;
    }

    public boolean isIsFinal() {
        return mIsFinal;
    }

    public void setIsFinal(boolean mIsFinal) {
        this.mIsFinal = mIsFinal;
    }
}

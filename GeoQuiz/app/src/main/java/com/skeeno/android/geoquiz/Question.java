package com.skeeno.android.geoquiz;

/**
 * Created by Johnry on 7/28/2016.
 */
public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;
    private boolean previouslyCheated = false;

    public Question(int textResId, boolean answerTrue) {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public boolean isPreviouslyCheated() {
        return previouslyCheated;
    }

    public void setPreviouslyCheated(boolean previouslyCheated) {
        this.previouslyCheated = previouslyCheated;
    }
}

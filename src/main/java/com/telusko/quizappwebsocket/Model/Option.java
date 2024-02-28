package com.telusko.quizappwebsocket.Model;

public class Option {
    private String optionText;
    private boolean correct;

    public Option() {
    }

    public Option(String optionText, boolean correct) {
        this.optionText = optionText;
        this.correct = correct;
    }

    // Getters and setters
    public String getOptionText() {
        return optionText;
    }

    public void setOptionText(String optionText) {
        this.optionText = optionText;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }
}

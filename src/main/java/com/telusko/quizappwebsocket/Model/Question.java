package com.telusko.quizappwebsocket.Model;

import java.util.List;

public class Question {
    private String questionText;
    private List<Option> options;

    public Question() {
    }

    public Question(String questionText, List<Option> options) {
        this.questionText = questionText;
        this.options = options;
    }

    // Getters and setters
    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }
}

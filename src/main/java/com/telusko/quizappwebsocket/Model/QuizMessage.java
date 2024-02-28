package com.telusko.quizappwebsocket.Model;

public class QuizMessage {
    private String type; // e.g., "QUESTION", "ANSWER"
    private Object payload; // Can be a Question object, a user response, etc.

    public QuizMessage() {
    }

    public QuizMessage(String type, Object payload) {
        this.type = type;
        this.payload = payload;
    }

    // Getters and setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getPayload() {
        return payload;
    }

    public void setPayload(Object payload) {
        this.payload = payload;
    }
}

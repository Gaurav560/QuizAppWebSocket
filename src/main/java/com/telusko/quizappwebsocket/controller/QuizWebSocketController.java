package com.telusko.quizappwebsocket.controller;

import com.telusko.quizappwebsocket.Model.Question;
import com.telusko.quizappwebsocket.Model.QuizMessage;
import com.telusko.quizappwebsocket.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

@Controller
@CrossOrigin
public class QuizWebSocketController {

    @Autowired
    private QuizService quizService;

    @MessageMapping("/nextQuestion")
    @SendTo("/topic/question")
    public QuizMessage sendNextQuestion() {
        Question nextQuestion = quizService.getNextQuestion();
        if (nextQuestion != null) {
            return new QuizMessage("QUESTION", nextQuestion);
        } else {
            // Signal that the quiz is over
            return new QuizMessage("END", "Quiz has ended.");
        }
    }


}

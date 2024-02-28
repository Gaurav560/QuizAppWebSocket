package com.telusko.quizappwebsocket.service;

import com.telusko.quizappwebsocket.Model.Question;
import com.telusko.quizappwebsocket.Model.Option;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

@Service
public class QuizService {

    private final List<Question> questions = Arrays.asList(
            new Question("What is the capital of France?", Arrays.asList(new Option("Paris", true), new Option("Rome", false), new Option("Madrid", false), new Option("Berlin", false))),
            new Question("Who is the CEO of Tesla?", Arrays.asList(new Option("Jeff Bezos", false), new Option("Elon Musk", true), new Option("Bill Gates", false), new Option("Mark Zuckerberg", false))),
            new Question("What is the largest planet in our solar system?", Arrays.asList(new Option("Earth", false), new Option("Jupiter", true), new Option("Mars", false), new Option("Saturn", false))),
            new Question("Which element has the chemical symbol 'O'?", Arrays.asList(new Option("Gold", false), new Option("Oxygen", true), new Option("Osmium", false), new Option("Oganesson", false))),
            new Question("What year did the Titanic sink in the Atlantic Ocean?", Arrays.asList(new Option("1912", true), new Option("1911", false), new Option("1913", false), new Option("1914", false)))
    );

    private final AtomicInteger currentQuestionIndex = new AtomicInteger(-1);

    public Question getNextQuestion() {
        if (currentQuestionIndex.get() < questions.size() - 1) {
            return questions.get(currentQuestionIndex.incrementAndGet());
        }
        return null; // Or signal the end of the quiz
    }

    public void resetQuiz() {
        currentQuestionIndex.set(-1);
    }
}

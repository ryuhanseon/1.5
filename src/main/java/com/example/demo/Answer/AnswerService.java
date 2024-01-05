package com.example.demo.Answer;


import com.example.demo.Qusetion.Question;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class AnswerService {

    private final AnswerRepository answerRepository;

    public void answerCreate(Question question, String content){
       Answer a = new Answer();
       a.setContent(content);
       a.setQuestion(question);
       a.setCreateDate(LocalDateTime.now());
       this.answerRepository.save(a);

    }

}

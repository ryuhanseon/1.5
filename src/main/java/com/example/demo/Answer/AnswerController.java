package com.example.demo.Answer;


import com.example.demo.Qusetion.Question;
import com.example.demo.Qusetion.QuestionService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/answer")
@RequiredArgsConstructor
public class AnswerController {

    private final QuestionService questionService;
    private final AnswerService answerService;

    @PostMapping("/detail/{id}")
    public String answerDetail(Model model, @PathVariable("id") Integer id,
    @Valid AnswerForm answerform, BindingResult bindingResult){
        Question question = this.questionService.getQuestion(id);
        if (bindingResult.hasErrors()){
            model.addAttribute("question", question);
            return "question_detail";
        }
        this.answerService.answerCreate(question,answerform.getContent());
        return String.format("redirect:/question/detail/%s", id);
    }


}

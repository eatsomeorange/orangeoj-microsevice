package com.taotao.orangebackendquestionservice.controller.inner;

import com.taotao.orangebackendmodel.model.entity.Question;
import com.taotao.orangebackendmodel.model.entity.QuestionSubmit;
import com.taotao.orangebackendmodel.model.entity.User;
import com.taotao.orangebackendquestionservice.service.QuestionService;
import com.taotao.orangebackendquestionservice.service.QuestionSubmitService;
import com.taotao.orangebackendserviceclient.service.QuestionFeignClient;
import com.taotao.orangebackendserviceclient.service.UserFeignClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/inner")
public class QuestionInnerController implements QuestionFeignClient {

    @Resource
    private QuestionService questionService;

    @Resource
    private QuestionSubmitService questionSubmitService;

    @GetMapping("/get/id")
    @Override
    public Question getQuestionById(@RequestParam("questionId") long questionId){
        return questionService.getById(questionId);
    }

    @GetMapping("/question_submit/get/id")
    @Override
    public QuestionSubmit getQuestionSubmitById(@RequestParam("questionId") long questionSubmitId){
        return questionSubmitService.getById(questionSubmitId);
    }

    @PostMapping("/question_submit/update")
    @Override
    public boolean updateQuestionSubmitById(@RequestBody QuestionSubmit questionSubmit){
        return questionSubmitService.updateById(questionSubmit);
    }

}

package com.taotao.orangebackendjudgeservice.controller.inner;


import com.taotao.orangebackendjudgeservice.judge.JudgeService;
import com.taotao.orangebackendmodel.model.entity.QuestionSubmit;
import com.taotao.orangebackendserviceclient.service.JudgeFeignClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/inner")
public class JudgeInnerController implements JudgeFeignClient {
    @Resource
    private JudgeService judgeService;
    /**
     * 判题
     * @param questionSubmitId
     * @return
     */
    @PostMapping("/do")
    @Override
    public QuestionSubmit doJudge(@RequestParam("questionSubmitId") long questionSubmitId){
        return judgeService.doJudge(questionSubmitId);
    }

}

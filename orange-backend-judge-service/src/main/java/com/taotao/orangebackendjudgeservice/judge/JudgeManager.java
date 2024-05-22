package com.taotao.orangebackendjudgeservice.judge;


import com.taotao.orangebackendjudgeservice.judge.strategy.DefaultJudgeStrategy;
import com.taotao.orangebackendjudgeservice.judge.strategy.JavaLanguageJudgeStrategy;
import com.taotao.orangebackendjudgeservice.judge.strategy.JudgeContext;
import com.taotao.orangebackendjudgeservice.judge.strategy.JudgeStrategy;
import com.taotao.orangebackendmodel.model.codesandbox.JudgeInfo;
import com.taotao.orangebackendmodel.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}

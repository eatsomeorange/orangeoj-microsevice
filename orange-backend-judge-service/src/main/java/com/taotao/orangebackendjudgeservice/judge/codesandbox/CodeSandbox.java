package com.taotao.orangebackendjudgeservice.judge.codesandbox;


import com.taotao.orangebackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.taotao.orangebackendmodel.model.codesandbox.ExecuteCodeResponse;

/**
 *
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}

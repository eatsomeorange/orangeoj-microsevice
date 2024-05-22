package com.taotao.orangebackenduserservice.controller.inner;

import com.taotao.orangebackendmodel.model.entity.User;
import com.taotao.orangebackendserviceclient.service.UserFeignClient;
import com.taotao.orangebackenduserservice.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/inner")
public class UserInnerController implements UserFeignClient {
    @Resource
    private UserService userService;
    /**
     * 根据id获取用户
     *
     * @param userId
     * @return
     */
    @Override
    @GetMapping("/get/id")
    public User getById(@RequestParam("userId") long userId){
        return userService.getById(userId);
    }
    /**
     * 根据id获取用户
     *
     * @param idList
     * @return
     */
    @Override
    @GetMapping("/get/ids")
    public  List<User> listByIds(@RequestParam("idList") Collection<Long> idList){
        return userService.listByIds(idList);
    }

}

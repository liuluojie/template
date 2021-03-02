package com.liuluojie.template.controller;

import com.liuluojie.template.entities.User;
import com.liuluojie.template.utils.Result;
import org.springframework.web.bind.annotation.*;

/**
 * @author Lljieeeeee
 * @date 2021/3/2 16:33
 * @url https://www.lljieeeeee.top/
 * @QQ 2015743127
 */
@RestController
@RequestMapping("/login")
@CrossOrigin
public class Login {

    @PostMapping("test")
    public Result test(@RequestBody User user) {
        System.out.println(user);
        return Result.success();
    }
}

package cn.xiaoyh.nenu.controller;


import cn.xiaoyh.pojo.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 人员 前端控制器
 * </p>
 *
 * @author xiaoyh
 * @since 2021-03-20
 */
@RestController
@RequestMapping("/nenu/people")
public class PeopleController {

    @GetMapping("/**")
    public Result test() {
        return Result.ok().message("user");
    }
}


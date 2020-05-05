package com.king.spring.demo

import org.springframework.web.bind.annotation.*

/**
 * @author <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */

@RequestMapping("/api")
@RestController
class Controller{


    @GetMapping("/getRequest")
    fun getRequest(@RequestParam username: String?): Result<User?>{
        if(username == "king123456"){
            return Result(0,"success",User(username,null,null))
        }
        return Result(1,"fail",null)
    }

    @PostMapping("/postRequest")
    fun postRequest(@RequestParam username: String?): Result<User?> {
        if (username == "king123456") {
            return Result(0, "success", User(username, null, null))
        }
        return Result(1, "fail", null)
    }
}
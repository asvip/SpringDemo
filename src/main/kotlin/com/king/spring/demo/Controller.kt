package com.king.spring.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

/**
 * @author <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */

@RequestMapping("/api")
@RestController
class Controller{

    @GetMapping("/request")
    fun request(@RequestParam username: String?): Result<User?>{
        if(username == "king123456"){
            return Result(0,"success",User(username,null,null))
        }
        return Result(1,"fail",null)
    }
}
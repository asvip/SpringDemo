package com.king.spring.demo

import com.king.spring.demo.bean.Result
import com.king.spring.demo.bean.User
import org.springframework.web.bind.annotation.*

/**
 * @author <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */

@RequestMapping("/api")
@RestController
class Controller{


    @GetMapping("/getRequest")
    fun getRequest(@RequestParam username: String?): Result<User?> {
        if(username == "king1234569"){
            return Result(0, "success", User(username, null, null))
        }
        return Result(1, "fail", null)
    }

    @PostMapping("/postRequest")
    fun postRequest(@RequestParam username: String?): Result<User?> {
        if (username == "king1234569") {
            return Result(0, "success", User(username, null, null))
        }
        return Result(1, "fail", null)
    }

    @PutMapping("/puttRequest")
    fun puttRequest(@RequestBody user: User?): Result<User?> {
        if (user != null) {
            return Result(0, "success",user)
        }
        return Result(1, "fail", null)
    }
}
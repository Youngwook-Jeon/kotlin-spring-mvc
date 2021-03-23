package com.example.mvc.controller.put

import com.example.mvc.model.http.Result
import com.example.mvc.model.http.UserRequest
import com.example.mvc.model.http.UserResponse
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class PutApiController {

    @PutMapping("/put-mapping")
    fun putMapping(): String {
        return "put-mapping"
    }

    @RequestMapping(method = [RequestMethod.PUT], path = ["/request-mapping"])
    fun requestMapping(): String {
        return "request-mapping -put method"
    }

    @PutMapping(path = ["/put-mapping/object"])
    fun putMappingObject(@RequestBody userRequest: UserRequest): UserResponse {
        return UserResponse().apply {
            this.result = Result().apply {
                this.resultCode = "OK"
                this.resultMessage = "성공"
            }
        }.apply {
            this.description = "~~~~~~~~~~~~~~"
        }.apply {
            val userList = mutableListOf<UserRequest>()

            userList.add(userRequest)
            userList.add(UserRequest().apply {
                this.name = "abc"
                this.age = 10
                this.email = "ggg@gmail.com"
                this.address = "abc add"
                this.phoneNumber = "010-1111-1234"
            })

            userList.add(UserRequest().apply {
                this.name = "abc"
                this.age = 10
                this.email = "ggg@gmail.com"
                this.address = "abc add"
                this.phoneNumber = "010-1111-1234"
            })

            this.userRequest = userList
        }
    }
}
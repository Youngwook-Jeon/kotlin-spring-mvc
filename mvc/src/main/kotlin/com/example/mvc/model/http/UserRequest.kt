package com.example.mvc.model.http

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy::class)
data class UserRequest(
        var name: String ?= null,
        var age: Int ?= null,
        var email: String ?= null,
        var address: String ?= null,

        // @JsonProperty("phone_number") 각 멤버에 붙여줄수 있지만 클래스 단위에서 규칙 지정 가능
        var phoneNumber: String ?= null
)

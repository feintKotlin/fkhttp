package com.feint.simplehttpserver.controller

import com.feint.simplehttpserver.service.HttpService
import com.feint.simplehttpserver.utility.PathUtil
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpServletRequest

@RestController
class HttpController{
    @Autowired
    lateinit var httpSerivce:HttpService

    @GetMapping("/**")
    fun httpRequest(@RequestHeader("Host")host:String, request: HttpServletRequest)=
            httpSerivce.response(PathUtil.getPath(request.requestURL.toString(),host))

}
package com.feint.simplehttpserver.utility

import org.springframework.http.MediaType



object MediaUtil{
    val APPLICATION_JAVASCRIPT=MediaType.valueOf("application/javascript")
    val TEXT_CSS=MediaType.valueOf("text/css")

    val mediaMap:Map<String,MediaType> = mapOf(Pair("html",MediaType.TEXT_HTML),
            Pair("js",APPLICATION_JAVASCRIPT),
            Pair("css", TEXT_CSS),
            Pair("png",MediaType.IMAGE_PNG),
            Pair("gif",MediaType.IMAGE_GIF),
            Pair("jpeg",MediaType.IMAGE_JPEG),
            Pair("jpg", MediaType.IMAGE_JPEG))

    fun getMedia(type:String)= mediaMap[type]
}
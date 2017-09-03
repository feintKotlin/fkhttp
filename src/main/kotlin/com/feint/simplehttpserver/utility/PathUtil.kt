package com.feint.simplehttpserver.utility

object PathUtil {

    fun getPath(fullUrl:String,host:String):String{

        return fullUrl.removePrefix("http://").removePrefix("https://").removePrefix(host)
    }
}
package com.feint.simplehttpserver.service

import com.feint.simplehttpserver.utility.MediaUtil
import org.springframework.beans.factory.annotation.Value
import org.springframework.core.io.InputStreamResource
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import java.io.File

@Service
class HttpService {

    @Value("\${html.resource.path}")
    lateinit var resPath:String

    fun response(hfile:String):ResponseEntity<InputStreamResource>{
        val file= File(resPath,hfile)
        return ResponseEntity.ok()
                .contentLength(file.length())
                .contentType(MediaUtil.getMedia(file.extension))
                .body(InputStreamResource(file.inputStream()))
    }
}
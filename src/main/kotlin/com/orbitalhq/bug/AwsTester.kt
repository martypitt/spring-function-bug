package com.orbitalhq.bug

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class AwsTester {
    @GetMapping("/2018-06-01/runtime/invocation/next")
    fun getNextMessage(): String {
        return """Hello, world"""
    }
}

package example.br.com.controller

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller(value = "/hello")
class HelloController {

    @Get
    fun hello(): String {
        return "Hello World!"
    }

}
package example.br.com.controller

import example.br.com.TodoRepository
import example.br.com.model.Todo
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post

@Controller(value = "/todos")
class TodoController(private val todoRepository: TodoRepository) {
    @Get
    fun getTodos(): List<Todo> {
        return todoRepository.findAll()
    }

    @Post
    fun addTodo(todo: Todo): HttpResponse<Todo> {
        return HttpResponse.created(todoRepository.save(todo))
    }
}
package example.br.com

import example.br.com.model.Todo
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository

@Repository
interface TodoRepository: JpaRepository<Todo, Long> {
}
package org.example

import org.axonframework.commandhandling.gateway.CommandGateway
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
class TodoController(
    private val commandGateway: CommandGateway
) {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(request: CreateTodoRequest) {
        commandGateway.send<CreateTodoCommand>(
            CreateTodoCommand(
                title = request.title
            )
        )
    }
}

data class CreateTodoRequest(
    val title: String
)
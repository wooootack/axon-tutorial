package org.example

import org.axonframework.commandhandling.CommandHandler
import org.axonframework.spring.stereotype.Aggregate
import java.util.*
import org.axonframework.modelling.command.AggregateLifecycle.apply
import org.springframework.stereotype.Component

object Todo {
    fun create(command: CreateTodoCommand): TodoCreatedEvent {
        return TodoCreatedEvent(
            todo = UUID.randomUUID().toString(),
            title = command.title,
            completed = false
        )
    }
}

data class CreateTodoCommand(
    val title: String,
)

data class TodoCreatedEvent(
    val todo: String,
    val title: String,
    val completed: Boolean
)

@Aggregate
object TodoAggregate {
    @CommandHandler
    fun handle(command: CreateTodoCommand) {
        val event = Todo.create(command)
        apply(event)
    }
}

@Component
object Todo
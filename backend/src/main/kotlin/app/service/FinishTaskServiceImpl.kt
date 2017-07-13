package app.service

import app.entity.Task
import app.repository.RepositoryException.Companion.handle
import app.repository.TaskRepository
import com.github.kittinunf.result.Validation
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

/**
 *
 * @author nsoushi
 */

data class FinishTaskCommand(val id: Long)

typealias FinishTaskService = ApplicationService<FinishTaskCommand, Task>

@Service("finishTaskService")
class FinishTaskServiceImpl(private val taskRepository: TaskRepository) : FinishTaskService {

    @Transactional
    override fun invoke(command: FinishTaskCommand): Task {
        return taskRepository.finishById(command.id).fold({
            task -> task
        }, {
            error -> throw handle(error)
        })
    }
}
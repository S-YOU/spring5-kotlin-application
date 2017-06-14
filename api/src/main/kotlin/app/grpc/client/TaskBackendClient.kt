package app.grpc.client

import app.config.AppProperties
import app.grpc.GrpcException.Companion.with
import app.grpc.server.gen.task.*
import io.grpc.Status
import io.grpc.netty.NettyChannelBuilder
import mu.KotlinLogging
import org.springframework.stereotype.Component
import valencia.currency.gateway.grpc.client.ShutdownLoan

/**
 *
 * @author nsoushi
 */
@Component
class TaskBackendClient(private val appProperties: AppProperties) {

    private val logger = KotlinLogging.logger {}

    fun getTask(taskId: Long): TaskOutbound =
            try {
                ShutdownLoan.using(getChannel(), { channel ->
                    val msg = TaskInbound.newBuilder().setTaskId(taskId.toInt()).build()
                    TaskServiceGrpc.newBlockingStub(channel).getTaskService(msg)
                })
            } catch (e: Exception) {
                val status = Status.fromThrowable(e)
                logger.error(e) { "gRPC server error, code:{%d}, description:{%s}".format(status.code.value(), status.description) }
                throw status with status.description
            }


    fun getTaskList(): List<TaskOutbound> =
            try {
                ShutdownLoan.using(getChannel(), { channel ->
                    val msg = TaskListInbound.newBuilder().setPage(1).build()
                    TaskServiceGrpc.newBlockingStub(channel).getTaskListService(msg).asSequence().map { it }.toList()
                })
            } catch (e: Exception) {
                val status = Status.fromThrowable(e)
                logger.error(e) { "gRPC server error, code:{%d}, description:{%s}".format(status.code.value(), status.description) }
                throw status with status.description
            }

    fun createTask(title: String): TaskOutbound =
            try {
                ShutdownLoan.using(getChannel(), { channel ->
                    val msg = CreateTaskInbound.newBuilder().setTitle(title).build()
                    TaskServiceGrpc.newBlockingStub(channel).createTaskService(msg)
                })
            } catch (e: Exception) {
                val status = Status.fromThrowable(e)
                logger.error(e) { "gRPC server error, code:{%d}, description:{%s}".format(status.code.value(), status.description) }
                throw status with status.description
            }

    fun updateTask(id: Long, title: String): TaskOutbound =
            try {
                ShutdownLoan.using(getChannel(), { channel ->
                    val msg = UpdateTaskInbound.newBuilder().setTaskId(id.toInt()).setTitle(title).build()
                    TaskServiceGrpc.newBlockingStub(channel).updateTaskService(msg)
                })
            } catch (e: Exception) {
                val status = Status.fromThrowable(e)
                logger.error(e) { "gRPC server error, code:{%d}, description:{%s}".format(status.code.value(), status.description) }
                throw status with status.description
            }

    fun deleteTask(id: Long): TaskOutbound =
            try {
                ShutdownLoan.using(getChannel(), { channel ->
                    val msg = TaskInbound.newBuilder().setTaskId(id.toInt()).build()
                    TaskServiceGrpc.newBlockingStub(channel).deleteTaskService(msg)
                })
            } catch (e: Exception) {
                val status = Status.fromThrowable(e)
                logger.error(e) { "gRPC server error, code:{%d}, description:{%s}".format(status.code.value(), status.description) }
                throw status with status.description
            }

    fun finishTask(id: Long): TaskOutbound =
            try {
                ShutdownLoan.using(getChannel(), { channel ->
                    val msg = TaskInbound.newBuilder().setTaskId(id.toInt()).build()
                    TaskServiceGrpc.newBlockingStub(channel).finishTaskService(msg)
                })
            } catch (e: Exception) {
                val status = Status.fromThrowable(e)
                logger.error(e) { "gRPC server error, code:{%d}, description:{%s}".format(status.code.value(), status.description) }
                throw status with status.description
            }

    private fun getChannel() = NettyChannelBuilder.forAddress(appProperties.grpc.backend.host, appProperties.grpc.backend.port)
            // for testing
            .usePlaintext(true)
            .build()
}
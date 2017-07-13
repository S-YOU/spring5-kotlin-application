package app.grpc.server

import app.grpc.server.gen.echo.EchoMessage
import app.grpc.server.gen.echo.EchoServiceGrpc
import io.grpc.stub.StreamObserver

/**
 *
 * @author nsoushi
 */
@GRpcService
class EchoBackendServer() : EchoServiceGrpc.EchoServiceImplBase() {

    override fun echoService(request: EchoMessage?, responseObserver: StreamObserver<EchoMessage>?) {
        val msg = EchoMessage.newBuilder().setMessage("(backend) echo \\${request?.message}/").build()
        responseObserver?.onNext(msg)
        responseObserver?.onCompleted()
    }
}
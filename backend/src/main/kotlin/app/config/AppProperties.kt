package app.config

import org.springframework.boot.context.properties.ConfigurationProperties

/**
 *
 * @author nsoushi
 */
@ConfigurationProperties("app")
class AppProperties {
    var grpc = Grpc()

    class Grpc {
        var server = Server()
        class Server {
            var port = 50052
            var host = "localhost"
        }
    }
}
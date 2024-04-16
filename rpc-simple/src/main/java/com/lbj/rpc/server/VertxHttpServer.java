package com.lbj.rpc.server;

import io.vertx.core.Vertx;

public class VertxHttpServer implements HttpServer{
    @Override
    public void doStart(int port) {
        // 创建Vert.x实例
        Vertx vertx = Vertx.vertx();

        // 创建http服务器
        io.vertx.core.http.HttpServer server = vertx.createHttpServer();

        // 监听端口并处理
        server.requestHandler(requst -> {
            // 处理http请求
            System.out.println("Received request" + requst.method() + " " + requst.uri() );

            // 发送http响应
            requst.response()
                    .putHeader("content-type", "text/plain")
                    .end("Hello from Vert.x HTTP server");
        });

        // 启动HTTP服务器并监听指定端口
        server.listen(port, result -> {
           if(result.succeeded()) {
               System.out.println("Server is now listening on port " + port);
           }
           else {
               System.err.println("Failed to start server: " + result.cause());
           }
        });
    }
}

package com.lbj.example.provider;

import com.lbj.rpc.server.HttpServer;
import com.lbj.rpc.server.VertxHttpServer;
/**
 * 简易服务提供者示例
 * */
public class EasyProviderExample {
    public static void main(String[] args) {
        // 启动web服务
        HttpServer httpServer = new VertxHttpServer();
        httpServer.doStart(8080);
    }
}

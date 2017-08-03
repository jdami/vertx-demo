package cn.java.vertx.test.lancher;

import io.netty.util.internal.logging.InternalLoggerFactory;
import io.netty.util.internal.logging.Log4J2LoggerFactory;

public class Launcher extends io.vertx.core.Launcher {
    public static void main(String[] args) {
        //使用log4j2 日志框架
        System.setProperty("vertx.logger-delegate-factory-class-name", "io.vertx.core.logging.Log4j2LogDelegateFactory");
        //设置netty使用log4j2
        InternalLoggerFactory.setDefaultFactory(Log4J2LoggerFactory.INSTANCE);
        new Launcher().dispatch(args);
    }
}

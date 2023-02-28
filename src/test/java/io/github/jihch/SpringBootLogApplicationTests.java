package io.github.jihch;

import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SpringBootLogApplicationTests {

    // 声明日志记录器对象
    public static final Logger LOGGER = LoggerFactory.getLogger(SpringBootLogApplicationTests.class);

    @Test
    public void contextLoads() {
        // 打印日志信息
        LOGGER.error("error");
        LOGGER.warn("warn");
        LOGGER.info("info"); // 默认日志级别
        LOGGER.debug("debug");
        LOGGER.trace("trace");

        // 使用 Log4j 2 进行日志记录也还是会通过桥接器切换为 SLF4J 日志门面和 Logback 日志实现
        org.apache.logging.log4j.Logger logger = LogManager.getLogger(SpringBootLogApplicationTests.class);
        logger.info("log4j 2 info");

    }

}

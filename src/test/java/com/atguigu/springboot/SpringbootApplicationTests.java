package com.atguigu.springboot;

import com.atguigu.springboot.bean.Person;
import com.fasterxml.jackson.core.io.IOContext;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Spring Boot单元测试
 *
 * 可以在测试期间很方便的类似编码一样的进行自动注入等容器功能
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {
    @Autowired
    Person person;
    @Autowired

    ApplicationContext ioc;
    @Test
    public void contextLoads() {
        System.out.println(person);
    }
    @Test
    public void testHelloService(){
        boolean b = ioc.containsBean("helloService");
        System.out.println(b);
    }

}

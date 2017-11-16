package com.qinghua.chapter3;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Chapter3ApplicationTests {

    @Autowired
    private BlogProperties blogProperties;

    @Test
    public void getHello() throws Exception {
        Assert.assertEquals(blogProperties.getName(), "qinghua");
        Assert.assertEquals(blogProperties.getTitle(), "Spring Boot Tutorials");
    }
}

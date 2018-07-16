package com.nowcoder;

import com.nowcoder.service.LikeService;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ToutiaoApplication.class)
public class LikeServiceTests {

    @Autowired
    LikeService likeService;


    @Test
    public void testLike(){
       likeService.like(123,1,1);
       Assert.assertEquals(1,likeService.getLikeStatus(123,1,1));
    }

    @Test
    public void testDislike(){
        likeService.disLike(123,1,1);
        Assert.assertEquals(-1,likeService.getLikeStatus(123,1,1));//验证
    }

    @Test(expected = IllegalArgumentException.class)   //异常测试
    public void testException(){
        throw new IllegalArgumentException("xxx");
    }

    @Before
    public void setUp(){   //初始数据
        System.out.println("setUp");
    }

    @After
    public void tearDown(){  //清洗数据
        System.out.println("tearDown");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("beforeClass");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("afterClass");
    }


}

package com.hjf.keyaoutofill;

import com.hjf.keyaoutofill.entity.User;
import com.hjf.keyaoutofill.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class KeyaoutofillApplicationTests {

    @Autowired
    UserMapper mapper;
    @Test
    void contextLoads() {
        List<User> users = mapper.selectList(null);
        System.out.println(users);
    }

    @Test
    public void testKeyAutoFill(){
        //如下：没有显式的设置主键值，mybatis_plus使用自带的雪花算法生成主键并添加,可以设置多种主键生成策略，详见 为知笔记
        User user=new User();
        user.setName("惠金峰");
        user.setAge(21);
        user.setEmail("hui_jinfeng@qq.com");
        mapper.insert(user);
    }


}

package com.bw.test;

import com.bw.bean.Meeting;
import com.bw.service.MeetingService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyTest {
    private MeetingService service;
    @Before
    public void test1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        service = context.getBean(MeetingService.class);
    }
    @Test
    public void test(){

        Map<String, Object> map = new HashMap<String, Object>();
        List<Meeting> list = service.select(map);
        for (Meeting m:list
             ) {
            System.out.println(m);
        }

    }
}

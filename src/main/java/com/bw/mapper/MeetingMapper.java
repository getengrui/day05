package com.bw.mapper;

import com.bw.bean.Meeting;
import com.bw.bean.Type;

import java.util.List;
import java.util.Map;

public interface MeetingMapper {
    //查询
    List<Meeting> select(Map<String, Object> map);
    //添加
    int insert(Meeting meeting);
    //
    List<Type> query();
    //删除
    int delete(int id);
    //修改
    int update(Meeting meeting);
    //回显
    Meeting find(int id);
}

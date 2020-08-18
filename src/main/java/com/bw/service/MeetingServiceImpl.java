package com.bw.service;

import com.bw.bean.Meeting;
import com.bw.bean.Type;
import com.bw.mapper.MeetingMapper;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@Service
public class MeetingServiceImpl implements MeetingService{
    @Resource
    private MeetingMapper meetingMapper;

    public List<Meeting> select(Map<String, Object> map) {
        return meetingMapper.select(map);
    }

    public int insert(Meeting meeting) {
        return meetingMapper.insert(meeting);
    }

    public List<Type> query() {
        return meetingMapper.query();
    }

    public int delete(int id) {
        return meetingMapper.delete(id);
    }

    public int update(Meeting meeting) {
        return meetingMapper.update(meeting);
    }

    public Meeting find(int id) {
        return meetingMapper.find(id);
    }
}

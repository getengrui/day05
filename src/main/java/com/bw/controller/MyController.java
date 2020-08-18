package com.bw.controller;

import com.bw.bean.Meeting;
import com.bw.bean.Type;
import com.bw.service.MeetingService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MyController {
    @Resource
    public MeetingService service;
    @RequestMapping("list")
    public String select(Model model,String name,
                         @RequestParam(defaultValue = "1") Integer pageNum){
        PageHelper.startPage(pageNum,2);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name",name);
        List<Meeting> list = service.select(map);
        PageInfo<Meeting> plist = new PageInfo<Meeting>(list);
        model.addAttribute("plist",plist);
        return "list";
    }
    @RequestMapping("query")
    @ResponseBody
    public List<Type> query(){
        List<Type> list = service.query();
        return list;
    }
    @RequestMapping("add")
    public String insert(Meeting meeting){
        int i = service.insert(meeting);
        if (i>0){
            return "redirect:list";
        }else{
            return "add";
        }
    }
    @RequestMapping("del")
    public String del(int id){
        service.delete(id);
        return "redirect:list";
    }
    @RequestMapping("find")
    @ResponseBody
    public Meeting find(int id){
        Meeting m = service.find(id);
        return m;
    }
    @RequestMapping("update")
    public String update(Meeting meeting){
        int i = service.update(meeting);
        if (i>0){
            return "redirect:list";
        }else{
            return "update";
        }
    }
}

package com.web.controller;

import com.web.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @RequestMapping("/user")
    public Object user (){
        User user = new User();
        user.setId("1");
        user.setName("lalal");
        user.setPassword("123");
        return user;
    }

    @RequestMapping("/map")
    public Object map (){
        Map<String,Object> map = new HashMap<String,Object>();
        Map<String,Object> map1 = new HashMap<String,Object>();
        Map<String,Object> map2 = new HashMap<String,Object>();
        Map<String,Object> map3 = new HashMap<String,Object>();
        List<Map<String,Object>> list  = new ArrayList<Map<String,Object>>();

       /* map1.put("dispatchArea","广东区-深圳市-宝安区");
        map1.put("list",list);*/
        map2.put("nearbyStore"," 广东省深圳市宝安区西乡街道宝田一路62号博智中心1");
        //list.add(map2);
        map3.put("nearbyStore"," 广东省深圳市宝安区西乡街道宝田一路62号博智中心2");

        /*map1.put("companyType","门店");*/



        map.put("订单号","...");
        map.put("收货地址","...");
        map.put("发货地址","...");
        map1.put("订单号","...");
        map1.put("收货地址","...");
        map1.put("发货地址","...");
        list.add(map1);
        map.put("childOrder",list);
        return map;
    }
}

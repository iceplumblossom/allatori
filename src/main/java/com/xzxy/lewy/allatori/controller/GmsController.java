package com.xzxy.lewy.allatori.controller;

import com.xzxy.lewy.allatori.common.MessageHeader;
import com.xzxy.lewy.allatori.common.MessageResult;
import com.xzxy.lewy.allatori.pojo.GmsReport;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * 2.7 过敏史
 */
@RestController
@RequestMapping("/medical")
public class GmsController {

    @GetMapping(value = "/gms")
    public MessageResult<Map<String, Object>> getGmsInfo(@RequestBody Map<String, Object> map,
                                                         HttpServletRequest request) {

        //测试代码，下面是入参
        /*
        {"Person":{"zjhm":"1","zjlx":"1","kh":"1","klx":"1","dregtyp":"1","range":"1"},
         "Event":{"sjid":"1","bgid":"1","beginDate":"1","endDate":"1","zdmc":"1"}}
         */
        MessageResult<Map<String, Object>> mapMessageResult = null;

        Map<String, Object> paramObj = (Map<String, Object>) map.get("Person");
        if ("1".equals(paramObj.get("zjlx"))) {
            Map<String,Object> map2 = new HashMap<>();
            map2.put("report", new GmsReport());
            mapMessageResult = new MessageResult<Map<String, Object>>(map2);
        } else {
            mapMessageResult = new MessageResult<>(new MessageHeader(0,"encounter error..."));
        }
        return mapMessageResult;
    }
}

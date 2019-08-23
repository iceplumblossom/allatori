package com.xzxy.lewy.allatori.controller;

import com.xzxy.lewy.allatori.common.MessageResult;
import com.xzxy.lewy.allatori.pojo.JzsReport;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 2.8 家族史
 */
@RestController
@RequestMapping("/medical")
public class JzsController {

    @GetMapping(value = "/jzs")
    public MessageResult<Map<String, Object>> getJzsInfo(@RequestBody Map<String, Object> map) {
        Map<String,Object> map2 = new HashMap<>();
        map2.put("report", new JzsReport());
        return new MessageResult<>(map2);
    }

}

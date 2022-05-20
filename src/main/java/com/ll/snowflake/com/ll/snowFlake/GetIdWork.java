package com.ll.snowflake.com.ll.snowFlake;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("/get")
@ResponseBody
public class GetIdWork {

    @Autowired
    private  SnowflakeManager snowflakeManager;

    @RequestMapping("/snowFlakeId")
    public Long getSnowFlakeId(){
        long value = 0;
        try {
            value = snowflakeManager.nextValue();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return value;
    }

}

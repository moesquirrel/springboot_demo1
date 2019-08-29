package cn.yaya.config;



import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice//全局数据处理组件  和下面的@ModelAttribute配合使用能够进行全局的数据配置
public class GlobalCongig {
    @ModelAttribute(value = "info")
    public Map<String,String> userInfo(){
        HashMap<String, String> map = new HashMap<>();
        map.put("username","牙牙");
        map.put("gender","男");
        return map;

    }
}


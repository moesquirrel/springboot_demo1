package cn.yaya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;
import java.util.Set;
@Controller
@RequestMapping("/tt")
public class TestGlobalCongigController {
    @RequestMapping("/gett")
    @ResponseBody
    public void test(Model model){
        Map<String, String> map = (Map<String, String>) model.asMap().get("info");
        Set<String> set = map.keySet();
        for (String s : set) {

            String value = map.get(s);
            System.out.println(s+":"+value);
        }
    }
}

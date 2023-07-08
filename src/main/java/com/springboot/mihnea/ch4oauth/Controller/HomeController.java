package com.springboot.mihnea.ch4oauth.Controller;

import com.springboot.mihnea.ch4oauth.Youtube.YouTube;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final YouTube youTube;

    public HomeController(YouTube youTube){
        this.youTube = youTube;
    }

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("channelVideos", youTube.channelVideo("UCjukbYOd6pjrMpNMFAOKYyw", 10, YouTube.Sort.VIEW_COUNT));

        return "index";
    }


}
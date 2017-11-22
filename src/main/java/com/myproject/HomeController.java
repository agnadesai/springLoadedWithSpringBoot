package com.myproject;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;

/**
 * @author Davor Sauer
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/", produces = { MediaType.APPLICATION_JSON_VALUE })
    @ResponseBody
    public String helloWorld() {
        return "Hello World!";
    }

    @RequestMapping(value = "/time", produces = { MediaType.APPLICATION_JSON_VALUE })
    @ResponseBody
    public LocalDateTime time() {
        return LocalDateTime.now();
    }

    @RequestMapping(value = "/name/{name}")
    @ResponseBody
    public String name(@PathVariable("name") String name) {
        return "Hi there: " + name;
    }

    /**
     * Add following method after classes -t task and after bootrun task to see if spring loaded shows the new endpoint
     * You should see error  org.springsource.loaded.ReloadableType   : Unable to find regeneration methods for cglib proxies - proxies will be out of date for this type
     */
//    @RequestMapping(value = "/afterBootRun", produces = { MediaType.APPLICATION_JSON_VALUE })
//    @ResponseBody
//    public String helloWorldAfterRunStarts() {
//        return "Hello World after BootRun with SpringLoaded!";
//    }

}

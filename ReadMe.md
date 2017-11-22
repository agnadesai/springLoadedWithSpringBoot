# This is an example project to show the cglib proxies error happens when using springboot with spring loaded #
1. Run gradle task classes -t
2. Run bootRun task

Uncomment following controller method after step 2.

//    @RequestMapping(value = "/afterBootRun", produces = { MediaType.APPLICATION_JSON_VALUE })
//    @ResponseBody
//    public String helloWorldAfterRunStarts() {
//        return "Hello World after BootRun with SpringLoaded!";
//    }


You should see following error 

org.springsource.loaded.ReloadableType   : Unable to find regeneration methods for cglib proxies - proxies will be out of date for this type
package web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    //http://localhost:8080/test1
    @RequestMapping("/test1")
    public Response test1() {
        return new Response("Test1 method: It works!: ");
    }

    //http://localhost:8080/test2
    @RequestMapping("/test2")
    public Response test2() {
        return new Response("Test2 method: It works!: ");
    }

    //http://localhost:8080/testParam?name=lukasz&surname=Wojech
    //http://localhost:8080/testParam?name=lukasz
    @RequestMapping("/testParam")

    public String testParam(
            @RequestParam(value = "name") String name,
            @RequestParam(value = "surname") String surname) {
        return String.format("Hello %s,%s", name, surname);
    }
}

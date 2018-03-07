package web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @RequestMapping("/test1")
    public Response test1() {
        return new Response("Test1 method: It works!: ");
    }

    @RequestMapping(value = "/testParam", method = RequestMethod.POST)
    public String testParam(@RequestBody Request request) {
        return String.format("Hello %s %s", request.getName(), request.getSurname());
    }



  /*  @RequestMapping("/testParam")
    //http://localhost:8080/testParam?name=lukasz&surname=wojech
    //http://localhost:8080/testParam?name=lukasz
    public String testParam(
            @RequestParam(value = "name") String name,
            @RequestParam(value = "surname") String surname) {
        return String.format("Hello %s,%s", name,surname);
    }*/
}

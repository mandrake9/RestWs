package com.soa.ws.RestWs;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHello {

    @RequestMapping("/hola")
    public String sayhello(@RequestParam(value="nombre",defaultValue="Mundo")  String nombre) {
        return("Hola "+nombre);
    }
}

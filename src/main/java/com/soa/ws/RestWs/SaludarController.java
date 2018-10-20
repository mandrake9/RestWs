package com.soa.ws.RestWs;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class SaludarController {

        private static final String template = "Hola, %s!";
        private final AtomicLong cant = new AtomicLong();

        @RequestMapping("/saludar")
        public Saludar saludar(@RequestParam(value="nombre",defaultValue="Mundo") String nombre) {
            Saludar saludo;
            saludo = new Saludar(cant.incrementAndGet(), String.format(template,nombre));
            return saludo;
        }


}


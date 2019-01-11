package com.soa.ws.RestWs;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class CalcularController {


    private final AtomicLong cant = new AtomicLong();

    @RequestMapping("/sumar")
    public Tupla sumar(@RequestParam(value = "numero1", defaultValue = "0") int numero1,
                       @RequestParam(value = "numero2", defaultValue = "0") int numero2) {
        Tupla suma;

        suma = new Tupla(cant.incrementAndGet(), numero1 + numero2);
        return suma;


    }

    @RequestMapping("/restar")
    public Tupla restar(@RequestParam(value = "numero1", defaultValue = "0") int numero1,
                        @RequestParam(value = "numero2", defaultValue = "0") int numero2) {
        Tupla restar;

        restar = new Tupla(cant.incrementAndGet(), numero1 - numero2);
        return restar;


    }
    @RequestMapping("/mult")
    public Tupla mult(@RequestParam(value = "numero1", defaultValue = "0") int numero1,
                      @RequestParam(value = "numero2", defaultValue = "0") int numero2) {
        Tupla mult;

        mult = new Tupla(cant.incrementAndGet(), numero1 * numero2);
        return mult;


    }
    @RequestMapping("/divide")
    public Tupla divide(@RequestParam(value = "numero1", defaultValue = "0") int numero1,
                        @RequestParam(value = "numero2", defaultValue = "0") int numero2) {
        Tupla divide;

        divide = new Tupla(cant.incrementAndGet(), numero1 / numero2);
        return divide;


    }
    @RequestMapping("/factorial")
    public Tupla factorial(@RequestParam(value = "numero1", defaultValue = "0") int numero1,
                           @RequestParam(value = "numero2", defaultValue = "0") int numero2) {
        for (int i=numero2;i>1;i--){
            numero1=numero1*numero1; }
        Tupla factorial;

        factorial = new Tupla(cant.incrementAndGet(), numero1*numero1 );
        return factorial;


    }
}
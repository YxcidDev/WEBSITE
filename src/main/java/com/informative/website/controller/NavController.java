package com.informative.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavController {

    @GetMapping("/nosotros")
    public String nosotros() {
        return "nosotros";
    }

    @GetMapping("/servicios")
    public String servicios() {
        return "servicio";
    }

    @GetMapping("/equipo")
    public String equipo() {
        return "equipo";
    }

    @GetMapping("/contacto")
    public String contacto() {
        return "contacto";
    }
}

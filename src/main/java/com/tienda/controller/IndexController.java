package com.tienda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "Inicio");
        // agrega más atributos si los necesitas, ej: model.addAttribute("mensaje", "Bienvenido");
        return "index"; // resources/templates/index.html
    }

    @GetMapping("/informacion")
    public String info(Model model) {
        model.addAttribute("title", "Información");
        return "info"; // resources/templates/info.html
    }
}

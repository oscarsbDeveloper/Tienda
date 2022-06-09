
package com.tienda2.controller;

import com.tienda2.entity.Persona;
import com.tienda2.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonaController {
    @Autowired
    private IPersonaService personaService;
    
    @GetMapping("/persona")
    public String index(Model model){
        List<Persona>listaPersona = personaService.getAllPersona();
        model.addAttribute("titulo","Tabla Personas");
        model.addAttribute("personas",listaPersona);
        return "personas";
    }
    
}

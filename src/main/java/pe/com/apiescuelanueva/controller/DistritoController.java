package pe.com.apiescuelanueva.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.apiescuelanueva.entity.DistritoEntity;
import pe.com.apiescuelanueva.service.DistritoService;

//@Controller --> indica que es un controlador de tipo Spring
//@ResponseBody --> cuando se agrega esta anotacion se vuelve un REST
//@RestController = @Controller + @ResponseBody
//@RestController aparece en la version 4 de Spring
//@RestController --> indica que es un controlador de tipo REST
@RestController
//@RequestMapping --> permite definir el nombre del ENDPOINT
@RequestMapping("/distrito")
public class DistritoController {
    @Autowired
    private DistritoService distritoservice;
    
    //@GetMapping sirve para obtener valores
    @GetMapping
    public List<DistritoEntity> findAll(){
        return distritoservice.findAll();
    }
    
}

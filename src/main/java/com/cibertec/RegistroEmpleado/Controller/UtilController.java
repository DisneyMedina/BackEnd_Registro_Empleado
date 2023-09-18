package com.cibertec.RegistroEmpleado.Controller;

import com.cibertec.RegistroEmpleado.Entity.Pais;
import com.cibertec.RegistroEmpleado.service.PaisService;
import com.cibertec.RegistroEmpleado.util.AppSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/url/util")
@CrossOrigin(origins = AppSettings.URL_CROSS_ORIGIN)
public class UtilController {

    @Autowired
    private PaisService paisService;

    @GetMapping("/pais")
    @ResponseBody
    public ResponseEntity<List<Pais>> listaPais(){
        List<Pais> lista = paisService.listaPais();
        return ResponseEntity.ok(lista);
    }

}

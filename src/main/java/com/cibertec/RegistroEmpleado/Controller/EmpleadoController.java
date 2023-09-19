package com.cibertec.RegistroEmpleado.Controller;


import com.cibertec.RegistroEmpleado.Entity.Empleado;
import com.cibertec.RegistroEmpleado.service.EmpleadoService;
import com.cibertec.RegistroEmpleado.util.AppSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;

@RestController
@RequestMapping("/url/empleado")
@CrossOrigin(origins = AppSettings.URL_CROSS_ORIGIN)
public class EmpleadoController {

    @Autowired
    EmpleadoService empleadoService;


    @GetMapping
    @ResponseBody
    public ResponseEntity<List<Empleado>> listaEmpleado(){
        List<Empleado> lista = empleadoService.listaEmpleado();
        return ResponseEntity.ok(lista);
    }

    @PostMapping
    @ResponseBody
    public ResponseEntity<?> insertaEmpleado(@RequestBody Empleado obj, Errors errors){
        Map<String, Object> salida = new HashMap<>();
        List<String> lstMensajes = new ArrayList<>();
        salida.put("errores", lstMensajes);
        obj.setEstado(1);
        Calendar calendar = Calendar.getInstance();
        Date fechaActual = calendar.getTime();
        obj.setFechaRegistro(fechaActual);
        Empleado empleado = empleadoService.insertaActualizaEmpleado(obj);
        if (empleado == null) {
            lstMensajes.add("Error en el registro");
        }else {
            lstMensajes.add("Se registró  Empleado de ID ==> " + empleado.getIdEmpleado());
        }
        return ResponseEntity.ok(salida);
    }
}

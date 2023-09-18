package com.cibertec.RegistroEmpleado.service;

import com.cibertec.RegistroEmpleado.Entity.Empleado;
import com.cibertec.RegistroEmpleado.Repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoServiceImpl  implements  EmpleadoService{

    @Autowired
    private EmpleadoRepository empleadoRepository;


    @Override
    public Empleado insertaActualizaEmpleado(Empleado obj) {
        return empleadoRepository.save(obj);
    }

    @Override
    public List<Empleado> listaEmpleado() {
        return empleadoRepository.findAll();
    }
}

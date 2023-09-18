package com.cibertec.RegistroEmpleado.service;

import com.cibertec.RegistroEmpleado.Entity.Empleado;

import java.util.List;

public interface EmpleadoService {
    public Empleado insertaActualizaEmpleado(Empleado obj);
    public List<Empleado> listaEmpleado();
}

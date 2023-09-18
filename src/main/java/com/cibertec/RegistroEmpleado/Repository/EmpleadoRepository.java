package com.cibertec.RegistroEmpleado.Repository;

import com.cibertec.RegistroEmpleado.Entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {

}

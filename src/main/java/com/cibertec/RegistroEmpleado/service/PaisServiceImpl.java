package com.cibertec.RegistroEmpleado.service;

import com.cibertec.RegistroEmpleado.Entity.Pais;
import com.cibertec.RegistroEmpleado.Repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaisServiceImpl implements PaisService {

    @Autowired
    private PaisRepository paisRepository;


    @Override
    public List<Pais> listaPais() {
        return paisRepository.findAll();
    }
}

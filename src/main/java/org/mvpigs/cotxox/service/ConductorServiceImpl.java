package org.mvpigs.cotxox.service;

import org.mvpigs.cotxox.domain.Conductor;
import org.mvpigs.cotxox.repo.ConductorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConductorServiceImpl implements ConductorService {

    private final ConductorRepo conductorRepo;
    private final Conductor conductor;

    @Autowired
    public ConductorServiceImpl(ConductorRepo conductorRepo, Conductor conductor) {
        this.conductorRepo = conductorRepo;
        this.conductor = conductor;
    }

    @Override
    public String getModelo(String modelo) {
        if(conductor.getModelo() != null){
            return conductor.getModelo();
        }
        return null;
    }

    @Override
    public String getMatricula(String matricula) {
        if(conductor.getMatricula() != null){
            return conductor.getMatricula();
        }
        return null;
    }

    @Override
    public Conductor getTarjeta(String tarjeta) {
        return this.getTarjeta(tarjeta);
    }

    @Override
    public Conductor recuperarConductor(String nombre) {
        Conductor result = new Conductor();
        result.getNombre();
        if(result != null) {
            return result;
        }
        return null;
    }

    @Override
    public Conductor recuperarConductorLibre() {
        if(conductor.isOcupado()){
            return null;
        } else {
            return conductor;
        }
    }
}

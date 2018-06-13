package org.mvpigs.cotxox.service;

import org.mvpigs.cotxox.domain.Conductor;

public interface ConductorService {
    String getModelo(String modelo);

    String getMatricula(String matricula);

    Conductor getTarjeta(String tarjeta);

    Conductor recuperarConductor(String nombre);

    Conductor recuperarConductorLibre();
}

package org.mvpigs.cotxox.service;

import org.mvpigs.cotxox.domain.Carrera;
import org.mvpigs.cotxox.domain.Conductor;

public interface CarreraService {
    Carrera getConductor(Conductor conductor);

    Carrera getTarjetaCredito();

    Carrera findOne(Long id);

    Long crearCarrera(String s, String parc_de_ses_estacions, String festival_park, int i, int i1);

    Carrera recuperaCarrera(Long idCarrera);

    Carrera updateCarrera(Carrera id);
}

package org.mvpigs.cotxox.service;

import org.mvpigs.cotxox.domain.Carrera;
import org.mvpigs.cotxox.domain.Conductor;
import org.mvpigs.cotxox.repo.CarreraRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CarreraServiceImpl implements CarreraService {

    private final CarreraRepo carreraRepo;
    private final Carrera carrera;

    @Autowired
    public CarreraServiceImpl(CarreraRepo carreraRepo, Carrera carrera) {
        this.carreraRepo = carreraRepo;
        this.carrera = carrera;
    }

    @Override
    public Carrera getConductor(Conductor conductor) {
        if (carrera.getConductor() != null) {
            return getConductor(conductor);
        }
        return null;
    }

    @Override
    public Carrera getTarjetaCredito() {
        if (carrera.getTarjetaCredito() != null) {
            return getTarjetaCredito();
        }
        return null;
    }

    @Override
    public Carrera findOne(Long id) {
        Carrera carrera = carreraRepo.findOne(id);
        if (carrera != null) {
            return carrera;
        } else {
            return null;
        }
    }

    @Override
    public Long crearCarrera(String tarjetaCredito, String origen, String destino, int tiempoEsperado, int tiempoCarrera) {
        Carrera result = new Carrera();
        result.getOrigen();
        result.getDestino();
        result.getTarjetaCredito();
        result.getTiempoEsperado();
        result.getTiempoCarrera();
        result.getId();
        result.getDistancia();
        result.getCosteTotal();

        return Long.valueOf(String.valueOf(result));
    }

    @Override
    public Carrera recuperaCarrera(Long id) {
        Carrera carrera = carreraRepo.findOne(id);
        String result = carrera.getConductor().getNombre();
        if (carrera != null) {
            return carrera;
        }
        return null;
    }

    @Override
    public Carrera updateCarrera(Carrera id) {
        Carrera carrera = carreraRepo.findOne(id);
        if (carrera != null) {
            return carreraRepo.save(carrera);
        }
        return null;
    }
}

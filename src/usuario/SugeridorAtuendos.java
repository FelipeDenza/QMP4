package modelo;

import clima.ServicioMeteorologico;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class SugeridorAtuendos {
  private final ServicioMeteorologico servicioClima;

  public SugeridorAtuendos(ServicioMeteorologico servicioClima) {
    this.servicioClima = servicioClima;
  }

  public List<Prenda> sugerir(String ciudad, List<Prenda> prendasDisponibles) {
    double temperatura = servicioClima.obtenerTemperatura(ciudad);
    return prendasDisponibles.stream()
        .filter(p -> p.esAptaPara(temperatura))
        .collect(Collectors.toList());
  }
}
package modelo;

import clima.ServicioMeteorologico;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class SugeridorPrendas {
  private final ServicioMeteorologico servicioClima;

  public SugeridorPrendas(ServicioMeteorologico servicioClima) {
    this.servicioClima = servicioClima;
  }

  public List<Prenda> sugerir(List<Prenda> prendasDisponibles) {
    double temperatura = servicioClima.obtenerTemperaturaBuenosAires();
    return prendasDisponibles.stream()
        .filter(p -> p.esAptaPara(temperatura))
        .collect(Collectors.toList());
  }
}
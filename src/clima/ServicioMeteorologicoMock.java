package clima;

public class ServicioMeteorologicoMock implements ServicioMeteorologico {
  private final double temperatura;

  public ServicioMeteorologicoMock(double temperatura) {
    this.temperatura = temperatura;
  }

  @Override
  public double obtenerTemperaturaBuenosAires() {
    return temperatura;
  }
}

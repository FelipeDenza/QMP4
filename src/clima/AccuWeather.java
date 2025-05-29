package clima;

import java.util.List;
import java.util.Map;
import AccuWeatherAPI.AccuWeatherAPI;

public class AccuWeather implements ServicioMeteorologico {
  private final AccuWeatherAPI api = new AccuWeatherAPI();

  @Override
  public double obtenerTemperaturaBuenosAires() {
    List<Map<String, Object>> condiciones = api.getWeather("Buenos Aires, Argentina");
    return (double) condiciones.get(0).get("Temperature");
  }
}
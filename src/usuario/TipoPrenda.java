package modelo;

public enum TipoPrenda {
  REMERA(25),
  BUZO(18),
  CAMPERA(10),
  SHORT(30);

  private final double temperaturaMaxima;

  TipoPrenda(double temperaturaMaxima) {
    this.temperaturaMaxima = temperaturaMaxima;
  }

  public boolean esAptaPara(double temperatura) {
    return temperatura <= temperaturaMaxima;
  }
}
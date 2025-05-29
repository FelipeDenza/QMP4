package modelo;

public class Prenda {
  private final String descripcion;
  private final TipoPrenda tipo;

  public Prenda(String descripcion, TipoPrenda tipo) {
    this.descripcion = descripcion;
    this.tipo = tipo;
  }

  public boolean esAptaPara(double temperatura) {
    return tipo.esAptaPara(temperatura);
  }

  @Override
  public String toString() {
    return descripcion + " (" + tipo + ")";
  }
}

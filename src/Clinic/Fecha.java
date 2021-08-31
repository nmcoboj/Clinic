
package examenparciall2;


public class Fecha {
    private int anio;
    private int mes;
    private int dia;

    public Fecha(int anio, int mes, int dia) {
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
    }
    public int getAnio() {
        return anio;
    }
    public int getMes() {
        return mes;
    }
    public int getDia() {
        return dia;
    }
    @Override
    public String toString(){
        return this.anio+" "+this.mes+" "+this.dia;
    }
}

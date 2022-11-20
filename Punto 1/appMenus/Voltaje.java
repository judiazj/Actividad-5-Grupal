package appMenus;

public class Voltaje {
    public static double calcularVoltaje(double corriente, double resistencia){
        double voltaje;
        voltaje = corriente * resistencia;
        return voltaje;
    }
}

package ExemploDependencia;

public class Turbina {
    private String marca;
    private int potencia;
    
    public Turbina(String marca) {
        this.marca = marca;
        potencia = 10;
    }

    public void imprime() {
        System.out.println("Turbina marca: "+marca);
    }
}

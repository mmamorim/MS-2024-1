package ExemploDependencia;

public class Prog {
    public static void main(String[] args) {
        
        Piloto p1 = new Piloto("Ana",35);
        Piloto p2 = new Piloto("Bia",30);
        Aviao a1 = new Aviao("Gol");
        Aviao a2 = new Aviao("Latam");

        a1.fazVoo(10, p1);
        a1.abastece();
        a1.fazVoo(30, p2);
        a2.fazVoo(8, p1);
        a2.fazVoo(15, p2);

        p1.imprime();
        p2.imprime();
        a1.imprime();
        a2.imprime();

    }
}

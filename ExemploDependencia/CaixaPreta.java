package ExemploDependencia;

public class CaixaPreta {
    private int qtdeVoos;

    public CaixaPreta() {
        qtdeVoos = 0;
    }

    public void registraVoo() {
        qtdeVoos++;
    }

    public void imprime() {
        System.out.println("Caixa preta: "+qtdeVoos);
    }
}

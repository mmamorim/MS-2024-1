package ExemploDependencia;

public class Aviao {
    private String nomeEmpresaAviacao;
    private int qtdeHorasVoo;
    private boolean temGasolina;
    private Turbina turbina1;
    private CaixaPreta cxapreta;

    public Aviao(String nomeEmpresaAviacao) {
        this.nomeEmpresaAviacao = nomeEmpresaAviacao;
        qtdeHorasVoo = 0;
        temGasolina = false;
        turbina1 = new Turbina("RollsRoyce");
        cxapreta = new CaixaPreta();
    }

    public void abastece() {
        temGasolina = true;
    }

    public void trocaTurbina(Turbina t) {
        turbina1 = t;
    }

    public void fazVoo(int qtdeHoras, Piloto p) {
        if(temGasolina) {
            qtdeHorasVoo = qtdeHorasVoo + qtdeHoras;
            p.fazVoo(qtdeHoras);   
            cxapreta.registraVoo(); 
        }
    }

    public void imprime() {
        System.out.println("Avião empresa: "+nomeEmpresaAviacao+" qtde horas voo: "+qtdeHorasVoo);
        turbina1.imprime();
    }
}

package ExemploDependencia;

public class Aviao {
    private String nomeEmpresaAviacao;
    private int qtdeHorasVoo;
    private boolean temGasolina;

    public Aviao(String nomeEmpresaAviacao) {
        this.nomeEmpresaAviacao = nomeEmpresaAviacao;
        qtdeHorasVoo = 0;
        temGasolina = false;
    }

    public void abastece() {
        temGasolina = true;
    }

    public void fazVoo(int qtdeHoras, Piloto p) {
        if(temGasolina) {
            qtdeHorasVoo = qtdeHorasVoo + qtdeHoras;
            p.fazVoo(qtdeHoras);    
        }
    }

    public void imprime() {
        System.out.println("Avião empresa: "+nomeEmpresaAviacao+" qtde horas voo: "+qtdeHorasVoo);
    }
}

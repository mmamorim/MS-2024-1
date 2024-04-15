package ExemploDependencia;

public class Piloto {
    private String nome;
    private int qtdeHorasVoo;
    private int idade;

    public Piloto(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        qtdeHorasVoo = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getQtdeHorasVoo() {
        return qtdeHorasVoo;
    }

    public void fazVoo(int qtdeHoras) {
        qtdeHorasVoo = qtdeHorasVoo + qtdeHoras;
    }

    public void imprime() {
        System.out.println("Piloto: "+nome+" / Horas de vôo: "+qtdeHorasVoo+" / Idade: "+idade);
    }
} 
package map.Ordenacao;

public class Evento {
    private String nome;
    private String atracao;

    public Evento(String nome, String atarcao) {
        this.nome = nome;
        this.atracao = atarcao;
    }

    public String getNome() {
        return nome;
    }

    public String getAtarcao() {
        return atracao;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "nome='" + nome + '\'' +
                ", atarcao='" + atracao + '\'' +
                '}';
    }
}

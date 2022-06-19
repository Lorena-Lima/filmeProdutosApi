package questaoDois.Entidade;

public class Filme {
    Integer id;
    String nome;
    String descricao;
    String ano;


    public Filme(String nome, String descricao, String ano){
        super();
        this.nome = nome;
        this.descricao = descricao;
        this.ano = ano;

    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getAno() {
        return ano;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String ToString(){
    return String.format("produto criado: %d, %s, %s, %s", this.id, this.nome, this.descricao, this.ano);
    }
}

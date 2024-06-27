import java.util.HashSet;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private Set<Conteudo> conteudos;
    private Set<Dev> devsInscritos;

    public Bootcamp(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.conteudos = new HashSet<>();
        this.devsInscritos = new HashSet<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void adicionarConteudo(Conteudo conteudo) {
        this.conteudos.add(conteudo);
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void inscreverDev(Dev dev) {
        this.devsInscritos.add(dev);
        dev.inscreverBootcamp(this);
    }
}
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Bootcamp> bootcampsInscritos;
    private Set<Conteudo> conteudosConcluidos;
    private Set<Conteudo> conteudosInscritos;

    public Dev(String nome) {
        this.nome = nome;
        this.bootcampsInscritos = new HashSet<>();
        this.conteudosConcluidos = new LinkedHashSet<>();
        this.conteudosInscritos = new LinkedHashSet<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Bootcamp> getBootcampsInscritos() {
        return bootcampsInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.bootcampsInscritos.add(bootcamp);
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        }
    }

    public double calcularTotalXp() {
        return this.conteudosConcluidos.stream().mapToDouble(Conteudo::calcularXp).sum();
    }
}
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Curso Java", "Descrição curso Java", 8);
        Curso curso2 = new Curso("Curso Python", "Descrição curso Python", 10);

        Mentoria mentoria1 = new Mentoria("Mentoria Java", "Descrição mentoria Java", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição Bootcamp Java Developer");
        bootcamp.adicionarConteudo(curso1);
        bootcamp.adicionarConteudo(curso2);
        bootcamp.adicionarConteudo(mentoria1);

        Dev dev1 = new Dev("Alice");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Alice: " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Alice: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Alice: " + dev1.getConteudosConcluidos());
        System.out.println("XP Alice: " + dev1.calcularTotalXp());

        Dev dev2 = new Dev("Bob");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Bob: " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Bob: " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Bob: " + dev2.getConteudosConcluidos());
        System.out.println("XP Bob: " + dev2.calcularTotalXp());
    }
}
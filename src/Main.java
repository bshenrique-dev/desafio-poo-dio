import me.dio.bootcamp.Bootcamp;
import me.dio.conteudos.Curso;
import me.dio.conteudos.Mentoria;
import me.dio.devs.Dev;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java Básico");
        curso1.setDescricao("Aprenda os principais aspectos da sintaxe da linguagem Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso("JavaScript Básico",
                "Aprenda os principais aspectos da sintaxe da linguagem JavaScript",
                4);

        Mentoria mentoriaJava = new Mentoria("Mentoria para Java"
                ,"Um suporte aproximado para alavancar seus estudos na linguagem"
                , LocalDate.now());

        Bootcamp bootcampJava = new Bootcamp("Bootcamp Java Developer","Inicie seus estudos em Java e obtenha conhecimentos" +
                "necessários para se tornar um programador Java completo");
        bootcampJava.getConteudos().add(curso1);
        bootcampJava.getConteudos().add(curso2);
        bootcampJava.getConteudos().add(mentoriaJava);

        Dev devHenrique = new Dev("Henrique");
        devHenrique.inscreverBootcamp(bootcampJava);
        System.out.println("Conteúdos inscritos: " + devHenrique.getConteudosInscritos());
        devHenrique.progredir();
        devHenrique.progredir();
        devHenrique.progredir();
        System.out.println("Conteúdos concluídos: " + devHenrique.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos: " + devHenrique.getConteudosInscritos());

        System.out.println("*************************************************************");

        Dev devAnthony = new Dev("Anthony");
        devAnthony.inscreverBootcamp(bootcampJava);
        System.out.println("Conteúdos inscritos: " + devAnthony.getConteudosInscritos());
        devAnthony.progredir();
        devAnthony.progredir();
        System.out.println("Conteúdos concluídos: " + devAnthony.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos: " + devAnthony.getConteudosInscritos());

        System.out.println("*************************************************************");

        System.out.println("O total de pontos do Henrique é: " + devHenrique.calcularTotalXp());
        System.out.println("O total de pontos do Anthony é: " + devAnthony.calcularTotalXp());

    }
}

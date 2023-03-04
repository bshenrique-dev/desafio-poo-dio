import me.dio.conteudos.Curso;
import me.dio.conteudos.Mentoria;

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

        System.out.println(curso1);
        System.out.println(curso2);

        Mentoria mentoriaJava = new Mentoria("Mentoria para Java"
                ,"Um suporte aproximado para alavancar seus estudos na linguagem"
                , LocalDate.now());

        System.out.println(mentoriaJava);

    }
}

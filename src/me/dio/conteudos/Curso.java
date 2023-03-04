package me.dio.conteudos;

import java.time.LocalDate;

public class Curso extends Conteudo {
    private int cargaHoraria;

    public Curso() {
    }

    public Curso(String titulo, String descricao, int cargaHoraria) {
        super.setTitulo(titulo);
        super.setDescricao(descricao);
        this.cargaHoraria = cargaHoraria;
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso: " + getTitulo()
                + "\nDescrição: " + getDescricao()
                + "\nCarga horária: " + this.cargaHoraria + " horas";
    }

    public int calcularXp(){
        return XP_PADRAO * getCargaHoraria();
    }
}

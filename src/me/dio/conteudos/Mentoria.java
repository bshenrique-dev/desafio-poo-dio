package me.dio.conteudos;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate dataMentoria;

    public Mentoria() {
    }

    public Mentoria(String titulo, String descricao, LocalDate dataMentoria) {
        super.setTitulo(titulo);
        super.setDescricao(descricao);
        this.dataMentoria = dataMentoria;
    }

    public int calcularXp(){
        return XP_PADRAO + 20;
    }

    @Override
    public String toString() {
        return getTitulo() + " | "  + getDescricao()
                + "\nData: " + dataMentoria;
    }
}
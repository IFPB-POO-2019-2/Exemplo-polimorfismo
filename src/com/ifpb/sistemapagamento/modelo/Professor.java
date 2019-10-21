package com.ifpb.sistemapagamento.modelo;

import java.time.LocalDate;

public class Professor extends Funcionario {

    private String titulacao;
    private int cargaHoraria;

    public Professor(String cpf, String nome, LocalDate nascimento, float salario,
                     String titulacao, int cargaHoraria){
        super(cpf, nome, nascimento, salario);
        this.titulacao = titulacao;
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public float calcularPagamento(){
        return getSalario() + 10 * cargaHoraria;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}

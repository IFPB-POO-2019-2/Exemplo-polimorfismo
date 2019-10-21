package com.ifpb.sistemapagamento.modelo;

import java.time.LocalDate;

public class TecnicoAdministrativo extends Funcionario{

    private String setor;
    private int horasExtras;

    public TecnicoAdministrativo(String cpf, String nome, LocalDate nascimento,
            float salario, String setor, int horasExtras){
        super(cpf,nome,nascimento,salario);
        this.setor = setor;
        this.horasExtras = horasExtras;
    }

    @Override
    public float calcularPagamento(){
        return getSalario() + 20*horasExtras;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }
}

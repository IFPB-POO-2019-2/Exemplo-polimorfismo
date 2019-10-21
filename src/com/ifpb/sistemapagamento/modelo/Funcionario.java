package com.ifpb.sistemapagamento.modelo;

import java.time.LocalDate;

public abstract class Funcionario {

    private String cpf;
    private String nome;
    private LocalDate nascimento;
    private float salario;

    public Funcionario(String cpf, String nome, LocalDate nascimento, float salario){
        this.cpf = cpf;
        this.nome = nome;
        this.nascimento = nascimento;
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public abstract float calcularPagamento();

}

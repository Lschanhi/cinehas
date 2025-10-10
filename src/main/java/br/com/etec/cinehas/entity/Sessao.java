package br.com.etec.cinehas.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

public class Sessao
{
    @Id//Este campo é a chave primaria na tabela
    @Column(name = "ID_SESSAO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "DT_DATA")
    private LocalDate data;
    @Column(name = "HR_HORARIO")
    private LocalTime hora;
    @Column(name = "NR_PRECO")
    private double preco;
    @OneToOne
    @JoinColumn(name = "ID_SALA")
    private Sala sala;
    @OneToMany
    @JoinColumn(name = "ID_FILME")
    private Filme filme;
}

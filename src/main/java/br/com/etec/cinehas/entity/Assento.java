package br.com.etec.cinehas.entity;

import jakarta.persistence.*;
@Entity
@Table(name = "TBL_ASSENTO")
public class Assento
{
    @Id//Este campo é a chave primaria na tabela
    @Column(name = "ID_ASSENTO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = " TX_FILEIRA")
    private String fileira;
    @Column(name = "NR_POSICAO")
    private Integer posicao;
    @OneToOne
    @JoinColumn(name = "ID_SALA")
    private Sala sala;
}

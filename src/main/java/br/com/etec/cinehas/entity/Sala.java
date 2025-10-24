package br.com.etec.cinehas.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_SALA")// será preciso colocar o @table caso o nome da classe seja defirente da Tabela no Banco de Dados
public class Sala
{
    @Id//Este campo é a chave primaria na tabela
    @Column(name = "ID_SALA")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "TX_NOME")
    private String nome;
    @Column(name = "NR_PRECO")
    private double preco;
}

package br.com.etec.cinehas.entity;

import br.com.etec.cinehas.enuns.TipoIngressoEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_INGRESSO")
public class Ingresso
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_INGRESSO")
    private Integer id;
    @Column(name = "NR_PRECO")
    private double preco;
    @Column(name = "TP_INGRESSO")
    @Enumerated(EnumType.STRING)
    private TipoIngressoEnum tipoIngresso;
    @OneToOne
    @JoinColumn(name = "ID_SESSAO")
    private Sessao sessao;
    @OneToOne
    @JoinColumn(name = "ID_ASSENTO")
    private Assento assento;
}

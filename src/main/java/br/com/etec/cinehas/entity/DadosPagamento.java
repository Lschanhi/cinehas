package br.com.etec.cinehas.entity;

import jakarta.persistence.*;

@Entity
@Table(name= "TBL_DADOS_PAGAMENTO")
public class DadosPagamento
{
    @Id//Este campo é a chave primaria na tabela
    @Column(name = "ID_DADOS_PAGAMENTO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="")
    private String nome;
    @Column(name="")
    private String numero;
    @Column(name="")
    private String expiracao;
    @Column(name="")
    private String codigo;
    @OneToOne
    @JoinColumn(name = "ID_PAGAMENTO")
    private Pagamento pagamento;
}

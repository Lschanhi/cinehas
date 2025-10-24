package br.com.etec.cinehas.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name= "TBL_DADOS_PAGAMENTO")
public class DadosPagamento
{
    @Id//Este campo é a chave primaria na tabela
    @Column(name = "ID_DADOS_PAGAMENTO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="TX_NOME")
    private String nome;
    @Column(name="TX_NUMERO")
    private String numero;
    @Column(name="TX_EXPIRACAO")
    private String expiracao;
    @Column(name="TX_CODIGO")
    private String codigo;
    @OneToOne
    @JoinColumn(name = "ID_PAGAMENTO")
    private Pagamento pagamento;
}

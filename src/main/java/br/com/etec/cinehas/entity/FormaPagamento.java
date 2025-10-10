package br.com.etec.cinehas.entity;


import br.com.etec.cinehas.enuns.TipoFormaPagamentoEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "TBL_FORMA_PAGAMENTO")
public class FormaPagamento
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_FORMA_PAGAMENTO")
    private long id;
    @Column(name = "TX_NOME")
    private String nome;
    @Column(name= "TP_TIPO")
    @Enumerated(EnumType.STRING)
    private TipoFormaPagamentoEnum tipoFormaPagamento;
}

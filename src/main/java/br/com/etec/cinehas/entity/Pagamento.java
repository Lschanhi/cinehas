package br.com.etec.cinehas.entity;

import br.com.etec.cinehas.enuns.StatusPagamentoenum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name= "TBL_PAGAMENTO")
public class Pagamento
{
    @Id
    @Column(name = "ID_PAGAMENTO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "NR_VALOR")
    private double valor;
    @Column (name = "TP_STATUS")
    @Enumerated(EnumType.STRING)
    private StatusPagamentoenum statusPagamento;
    @OneToOne
    @JoinColumn(name = "ID_PEDIDO")
    private Pedido idPedido;
    @OneToOne
    @JoinColumn(name = "ID_FORMA_PAGAMENTO")
    private FormaPagamento idTipoPagamento;
}

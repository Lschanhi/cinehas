package br.com.etec.cinehas.entity;

import br.com.etec.cinehas.enuns.StatusPedidoEnum;
import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity
@Table(name = "TBL_PEDIDO")
public class Pedido
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PEDIDO")
    private Integer id;
    @Column(name = "DT_CRIACAO")
    private LocalDateTime dataCriacao;
    @Enumerated(EnumType.STRING)
    @Column(name = "TP_STATUS")
    private StatusPedidoEnum statusPedido;
    @ManyToMany
    @JoinTable(name = "TBL_REL_PEDIDO_INGRESSO",
            joinColumns = @JoinColumn(name = "ID_INGRESSO"),
            inverseJoinColumns = @JoinColumn(name = "ID_PEDIDO"))
    private Ingresso ingresso;

}

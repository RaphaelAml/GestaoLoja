package dominio;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Venda {

    private int id;
    private Cliente cliente;
    private Usuario usuario;
    private BigDecimal totalDaVenda;
    private BigDecimal valorPago;
    private BigDecimal desconto;
    private BigDecimal troco;
    private LocalDateTime dataHoraCriada;
    private LocalDateTime ultimaAtualizacao;

    public Venda() {
    }

    public Venda(int id, Cliente cliente, Usuario usuario, BigDecimal totalDaVenda, BigDecimal valorPago, BigDecimal desconto,
                 BigDecimal troco, LocalDateTime dataHoraCriada, LocalDateTime ultimaAtualizacao) {
        this.id = id;
        this.cliente = cliente;
        this.usuario = usuario;
        this.totalDaVenda = totalDaVenda;
        this.valorPago = valorPago;
        this.desconto = desconto;
        this.troco = troco;
        this.dataHoraCriada = dataHoraCriada;
        this.ultimaAtualizacao = ultimaAtualizacao;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public BigDecimal getTotalDaVenda() {
        return totalDaVenda;
    }

    public void setTotalDaVenda(BigDecimal totalDaVenda) {
        this.totalDaVenda = totalDaVenda;
    }

    public BigDecimal getValorPago() {
        return valorPago;
    }

    public void setValorPago(BigDecimal valorPago) {
        this.valorPago = valorPago;
    }

    public BigDecimal getDesconto() {
        return desconto;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }

    public BigDecimal getTroco() {
        return troco;
    }

    public void setTroco(BigDecimal troco) {
        this.troco = troco;
    }

    public LocalDateTime getDataHoraCriada() {
        return dataHoraCriada;
    }

    public void setDataHoraCriada(LocalDateTime dataHoraCriada) {
        this.dataHoraCriada = dataHoraCriada;
    }

    public LocalDateTime getUltimaAtualizacao() {
        return ultimaAtualizacao;
    }

    public void setUltimaAtualizacao(LocalDateTime ultimaAtualizacao) {
        this.ultimaAtualizacao = ultimaAtualizacao;
    }
}

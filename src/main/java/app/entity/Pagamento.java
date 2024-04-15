package app.entity;

import java.time.LocalDateTime;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Pagamento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPagamento;

    @NotBlank(message = "Digite um valor válido.")
    private String valorPagamento;

    @NotBlank(message = "Digite a data de pagamento.")
    private LocalDateTime dataPagamento;

    @NotBlank(message = "Digite o nome do cliente.")
    private String nomePagamento;

	@ManyToMany(mappedBy = "pagamentos", cascade = CascadeType.ALL)
    @JsonBackReference
    
    // Getters e setters
    public Long getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(Long idPagamento) {
        this.idPagamento = idPagamento;
    }

    public String getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(String valorPagamento) {
        this.valorPagamento = valorPagamento;
    }

    public LocalDateTime getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDateTime dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public String getNomePagamento() {
        return nomePagamento;
    }

    public void setNomePagamento(String nomePagamento) {
        this.nomePagamento = nomePagamento;
    }

    public Set<Cliente> getClientes() {
        return getClientes();
    }

    public void setClientes(Set<Cliente> clientes) {
    }
}

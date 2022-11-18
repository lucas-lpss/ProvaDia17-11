package Wayne.Industries.ClienteAPI;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nomeCompleto;
    private String profissao;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Endereco> enderecos;

    public Cliente() {
    }

    public Cliente(Long id, String nomeCompleto, String profissao, List<Endereco> enderecos) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.profissao = profissao;
        this.enderecos = enderecos;
    }

    public Long getId() {
        return id;
    }



    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }
}







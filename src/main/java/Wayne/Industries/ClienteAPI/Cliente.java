package Wayne.Industries.ClienteAPI;

import org.hibernate.engine.internal.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String nome ;
    private String endereçoCliente ;
    private String profissaoCliente ;
    @OneToMany (cascade = CascadeType.ALL)
    private List<Andress> endereço ;

    public Cliente(String nome, String endereçoCliente, String profissaoCliente, List<Andress> endereço) {
        this.nome = nome;
        this.endereçoCliente = endereçoCliente;
        this.profissaoCliente = profissaoCliente;

        this.endereço = endereço;
    }

    public Cliente() {
    }


    public List<Andress> getEndereço() {
        return endereço;
    }

    public void setEndereço(List<Andress> endereço) {
        this.endereço = endereço;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereçoCliente() {
        return endereçoCliente;
    }

    public void setEndereçoCliente(String endereçoCliente) {
        this.endereçoCliente = endereçoCliente;
    }

    public String getProfissaoCliente() {
        return profissaoCliente;
    }

    public void setProfissaoCliente(String profissaoCliente) {
        this.profissaoCliente = profissaoCliente;
    }
}


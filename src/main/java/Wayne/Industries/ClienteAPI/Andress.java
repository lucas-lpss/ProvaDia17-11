package Wayne.Industries.ClienteAPI;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Andress {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id ;
    private String ruaC ;
    private String cepC;
    private  String numero;

    public Andress() {
    }

    public String getRuaC() {
        return ruaC;
    }

    public void setRuaC(String ruaC) {
        this.ruaC = ruaC;
    }

    public String getCepC() {
        return cepC;
    }

    public void setCepC(String cepC) {
        this.cepC = cepC;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}


package br.edu.infnet.Fornecedores;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table (name = "fornecedores")
public class Fornecedor {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idFornecedor;

    @NotEmpty(message = "O campo Nome Fantasia é obrigatório")
    @Size(min = 5, max = 20, message = "O Nome Fantasia deve ter entre 5 e 20 caracteres")
    String nomeFantasia;
    @NotEmpty(message = "O campo Razão Social é obrigatório")
    @Size(min = 5, max = 150, message = "A Razão Social deve ter entre 5 e 150 caracteres")
    String razaoSocial;

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

}

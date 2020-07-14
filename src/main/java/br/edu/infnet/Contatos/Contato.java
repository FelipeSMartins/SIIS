package br.edu.infnet.Contatos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "contatos")
public class Contato {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idContato;
    
    @NotEmpty(message = "O campo Nome é obrigatório")
    @Size(min = 5, max = 30, message = "O Nome deve ter entre 5 e 30 caracteres")
    private String nomeContato;
    @NotEmpty(message = "O campo Email é obrigatório")
    private String emailContato;
    @NotEmpty(message = "O campo Telefone é obrigatório")
    @Size(min = 10, max = 11, message = "O Telefone deve ter entre 10 e 11 caracteres")
    private String telefoneContato;

    public String getNomeContato() {
        return nomeContato;
    }

    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    public String getEmailContato() {
        return emailContato;
    }

    public void setEmailContato(String emailContato) {
        this.emailContato = emailContato;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    //    public boolean isTelefone(String numeroTelefone) {
    //    return numeroTelefone.matches("\\((10)|([1-9][1-9])\\)\\s9?[6-9][0-9]{3}-[0-9]{4}");
    //}
    public int getIdContato() {
        return idContato;
    }

    public void setIdContato(int idContato) {
        this.idContato = idContato;
    }
}

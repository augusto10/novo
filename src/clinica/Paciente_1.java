/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Iasmin
 */
@Entity
@Table(name = "PACIENTE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Paciente_1.findAll", query = "SELECT p FROM Paciente_1 p")
    , @NamedQuery(name = "Paciente_1.findByCodigo", query = "SELECT p FROM Paciente_1 p WHERE p.codigo = :codigo")
    , @NamedQuery(name = "Paciente_1.findByNome", query = "SELECT p FROM Paciente_1 p WHERE p.nome = :nome")
    , @NamedQuery(name = "Paciente_1.findByCpf", query = "SELECT p FROM Paciente_1 p WHERE p.cpf = :cpf")
    , @NamedQuery(name = "Paciente_1.findByEndereco", query = "SELECT p FROM Paciente_1 p WHERE p.endereco = :endereco")
    , @NamedQuery(name = "Paciente_1.findByTelefone", query = "SELECT p FROM Paciente_1 p WHERE p.telefone = :telefone")
    , @NamedQuery(name = "Paciente_1.findByDtNascimento", query = "SELECT p FROM Paciente_1 p WHERE p.dtNascimento = :dtNascimento")})
public class Paciente_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private BigDecimal codigo;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "CPF")
    private String cpf;
    @Column(name = "ENDERECO")
    private String endereco;
    @Column(name = "TELEFONE")
    private Integer telefone;
    @Column(name = "DT_NASCIMENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtNascimento;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "paciente")
    private Collection<Internacao_1> internacaoCollection;

    public Paciente_1() {
    }

    public Paciente_1(BigDecimal codigo) {
        this.codigo = codigo;
    }

    public BigDecimal getCodigo() {
        return codigo;
    }

    public void setCodigo(BigDecimal codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    @XmlTransient
    public Collection<Internacao_1> getInternacaoCollection() {
        return internacaoCollection;
    }

    public void setInternacaoCollection(Collection<Internacao_1> internacaoCollection) {
        this.internacaoCollection = internacaoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paciente_1)) {
            return false;
        }
        Paciente_1 other = (Paciente_1) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "clinica.Paciente_1[ codigo=" + codigo + " ]";
    }
    
}

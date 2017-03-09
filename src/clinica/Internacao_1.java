/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Iasmin
 */
@Entity
@Table(name = "INTERNACAO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Internacao_1.findAll", query = "SELECT i FROM Internacao_1 i")
    , @NamedQuery(name = "Internacao_1.findByCrm", query = "SELECT i FROM Internacao_1 i WHERE i.internacaoPK.crm = :crm")
    , @NamedQuery(name = "Internacao_1.findByCodigo", query = "SELECT i FROM Internacao_1 i WHERE i.internacaoPK.codigo = :codigo")
    , @NamedQuery(name = "Internacao_1.findByMedicoResponsavel", query = "SELECT i FROM Internacao_1 i WHERE i.medicoResponsavel = :medicoResponsavel")
    , @NamedQuery(name = "Internacao_1.findByHorarioVisita", query = "SELECT i FROM Internacao_1 i WHERE i.horarioVisita = :horarioVisita")})
public class Internacao_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InternacaoPK internacaoPK;
    @Column(name = "MEDICO_RESPONSAVEL")
    private String medicoResponsavel;
    @Column(name = "HORARIO_VISITA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horarioVisita;
    @JoinColumn(name = "CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Paciente_1 paciente;

    public Internacao_1() {
    }

    public Internacao_1(InternacaoPK internacaoPK) {
        this.internacaoPK = internacaoPK;
    }

    public Internacao_1(BigInteger crm, BigInteger codigo) {
        this.internacaoPK = new InternacaoPK(crm, codigo);
    }

    public InternacaoPK getInternacaoPK() {
        return internacaoPK;
    }

    public void setInternacaoPK(InternacaoPK internacaoPK) {
        this.internacaoPK = internacaoPK;
    }

    public String getMedicoResponsavel() {
        return medicoResponsavel;
    }

    public void setMedicoResponsavel(String medicoResponsavel) {
        this.medicoResponsavel = medicoResponsavel;
    }

    public Date getHorarioVisita() {
        return horarioVisita;
    }

    public void setHorarioVisita(Date horarioVisita) {
        this.horarioVisita = horarioVisita;
    }

    public Paciente_1 getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente_1 paciente) {
        this.paciente = paciente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (internacaoPK != null ? internacaoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Internacao_1)) {
            return false;
        }
        Internacao_1 other = (Internacao_1) object;
        if ((this.internacaoPK == null && other.internacaoPK != null) || (this.internacaoPK != null && !this.internacaoPK.equals(other.internacaoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "clinica.Internacao_1[ internacaoPK=" + internacaoPK + " ]";
    }
    
}

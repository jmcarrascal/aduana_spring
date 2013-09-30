package ar.gob.gba.sg.dpsit.sueldos.model;

// Generated 15/07/2013 12:44:21 by Hibernate Tools 3.2.0.b9

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnore;

/**
 * SueConceptoModalidad generated by hbm2java
 */
@Entity
@Table(name = "sue_concepto_modalidad")
public class SueConceptoModalidad implements java.io.Serializable {

	private String modalidadId;
	private String descrip;
	private Set<SueConcepto> sueConceptos = new HashSet<SueConcepto>(0);

	public SueConceptoModalidad() {
	}

	public SueConceptoModalidad(String modalidadId, String descrip) {
		this.modalidadId = modalidadId;
		this.descrip = descrip;
	}

	public SueConceptoModalidad(String modalidadId, String descrip,
			Set<SueConcepto> sueConceptos) {
		this.modalidadId = modalidadId;
		this.descrip = descrip;
		this.sueConceptos = sueConceptos;
	}

	@Id
	@Column(name = "modalidad_id", unique = true, nullable = false, length = 15)
	public String getModalidadId() {
		return this.modalidadId;
	}

	public void setModalidadId(String modalidadId) {
		this.modalidadId = modalidadId;
	}

	@Column(name = "descrip", nullable = false, length = 50)
	public String getDescrip() {
		return this.descrip;
	}

	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}
	
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "sueConceptoModalidad")
	public Set<SueConcepto> getSueConceptos() {
		return this.sueConceptos;
	}

	public void setSueConceptos(Set<SueConcepto> sueConceptos) {
		this.sueConceptos = sueConceptos;
	}

}
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

/**
 * SueRegimenLaboral generated by hbm2java
 */
@Entity
@Table(name = "sue_regimen_laboral")
public class SueRegimenLaboral implements java.io.Serializable {

	private long regLaboralId;
	private String leyId;
	private String descrip;
	private String valor;
	private Set<SueValorBaseDetalle> sueValorBaseDetalles = new HashSet<SueValorBaseDetalle>(
			0);

	public SueRegimenLaboral() {
	}

	public SueRegimenLaboral(long regLaboralId, String leyId, String descrip,
			String valor) {
		this.regLaboralId = regLaboralId;
		this.leyId = leyId;
		this.descrip = descrip;
		this.valor = valor;
	}

	public SueRegimenLaboral(long regLaboralId, String leyId, String descrip,
			String valor, Set<SueValorBaseDetalle> sueValorBaseDetalles) {
		this.regLaboralId = regLaboralId;
		this.leyId = leyId;
		this.descrip = descrip;
		this.valor = valor;
		this.sueValorBaseDetalles = sueValorBaseDetalles;
	}

	@Id
	@Column(name = "reg_laboral_id", unique = true, nullable = false)
	public long getRegLaboralId() {
		return this.regLaboralId;
	}

	public void setRegLaboralId(long regLaboralId) {
		this.regLaboralId = regLaboralId;
	}

	@Column(name = "ley_id", nullable = false, length = 4)
	public String getLeyId() {
		return this.leyId;
	}

	public void setLeyId(String leyId) {
		this.leyId = leyId;
	}

	@Column(name = "descrip", nullable = false, length = 50)
	public String getDescrip() {
		return this.descrip;
	}

	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}

	@Column(name = "valor", nullable = false, length = 15)
	public String getValor() {
		return this.valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "sueRegimenLaboral")
	public Set<SueValorBaseDetalle> getSueValorBaseDetalles() {
		return this.sueValorBaseDetalles;
	}

	public void setSueValorBaseDetalles(
			Set<SueValorBaseDetalle> sueValorBaseDetalles) {
		this.sueValorBaseDetalles = sueValorBaseDetalles;
	}

}

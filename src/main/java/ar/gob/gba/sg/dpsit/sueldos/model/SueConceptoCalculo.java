package ar.gob.gba.sg.dpsit.sueldos.model;

// Generated 15/07/2013 12:44:21 by Hibernate Tools 3.2.0.b9

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * SueConceptoCalculo generated by hbm2java
 */
@Entity
@Table(name = "sue_concepto_calculo")
public class SueConceptoCalculo implements java.io.Serializable {

	private long conceptoCalculoId;
	private SueConceptoLey sueConceptoLey;
	private SueConceptoCalcExp sueConceptoCalcExp;
	private SueConceptoCalculoTipo sueConceptoCalculoTipo;
	private long depId;
	private Date FDesde;
	private Date FHasta;
	private char vigente;
	private String observa;
	private Date FCarga;
	private long usrCarga;
	private Date FModif;
	private Long usrModif;
	private Integer ordenCalculo;

	public SueConceptoCalculo() {
	}

	public SueConceptoCalculo(long conceptoCalculoId,
			SueConceptoLey sueConceptoLey,
			SueConceptoCalcExp sueConceptoCalcExp,
			SueConceptoCalculoTipo sueConceptoCalculoTipo, long depId,
			Date FDesde, char vigente, Date FCarga, long usrCarga) {
		this.conceptoCalculoId = conceptoCalculoId;
		this.sueConceptoLey = sueConceptoLey;
		this.sueConceptoCalcExp = sueConceptoCalcExp;
		this.sueConceptoCalculoTipo = sueConceptoCalculoTipo;
		this.depId = depId;
		this.FDesde = FDesde;
		this.vigente = vigente;
		this.FCarga = FCarga;
		this.usrCarga = usrCarga;
	}

	public SueConceptoCalculo(long conceptoCalculoId,
			SueConceptoLey sueConceptoLey,
			SueConceptoCalcExp sueConceptoCalcExp,
			SueConceptoCalculoTipo sueConceptoCalculoTipo, long depId,
			Date FDesde, Date FHasta, char vigente, String observa,
			Date FCarga, long usrCarga, Date FModif, Long usrModif,
			Integer ordenCalculo) {
		this.conceptoCalculoId = conceptoCalculoId;
		this.sueConceptoLey = sueConceptoLey;
		this.sueConceptoCalcExp = sueConceptoCalcExp;
		this.sueConceptoCalculoTipo = sueConceptoCalculoTipo;
		this.depId = depId;
		this.FDesde = FDesde;
		this.FHasta = FHasta;
		this.vigente = vigente;
		this.observa = observa;
		this.FCarga = FCarga;
		this.usrCarga = usrCarga;
		this.FModif = FModif;
		this.usrModif = usrModif;
		this.ordenCalculo = ordenCalculo;
	}

	@Id
	@Column(name = "concepto_calculo_id", unique = true, nullable = false)
	public long getConceptoCalculoId() {
		return this.conceptoCalculoId;
	}

	public void setConceptoCalculoId(long conceptoCalculoId) {
		this.conceptoCalculoId = conceptoCalculoId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "concepto_ley_id", nullable = false)
	public SueConceptoLey getSueConceptoLey() {
		return this.sueConceptoLey;
	}

	public void setSueConceptoLey(SueConceptoLey sueConceptoLey) {
		this.sueConceptoLey = sueConceptoLey;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "concepto_calc_exp_id", nullable = false)
	public SueConceptoCalcExp getSueConceptoCalcExp() {
		return this.sueConceptoCalcExp;
	}

	public void setSueConceptoCalcExp(SueConceptoCalcExp sueConceptoCalcExp) {
		this.sueConceptoCalcExp = sueConceptoCalcExp;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tipo_calculo_id", nullable = false)
	public SueConceptoCalculoTipo getSueConceptoCalculoTipo() {
		return this.sueConceptoCalculoTipo;
	}

	public void setSueConceptoCalculoTipo(
			SueConceptoCalculoTipo sueConceptoCalculoTipo) {
		this.sueConceptoCalculoTipo = sueConceptoCalculoTipo;
	}

	@Column(name = "dep_id", nullable = false)
	public long getDepId() {
		return this.depId;
	}

	public void setDepId(long depId) {
		this.depId = depId;
	}

	@Column(name = "f_desde", nullable = false, length = 35)
	public Date getFDesde() {
		return this.FDesde;
	}

	public void setFDesde(Date FDesde) {
		this.FDesde = FDesde;
	}

	@Column(name = "f_hasta", length = 35)
	public Date getFHasta() {
		return this.FHasta;
	}

	public void setFHasta(Date FHasta) {
		this.FHasta = FHasta;
	}

	@Column(name = "vigente", nullable = false, length = 1)
	public char getVigente() {
		return this.vigente;
	}

	public void setVigente(char vigente) {
		this.vigente = vigente;
	}

	@Column(name = "observa")
	public String getObserva() {
		return this.observa;
	}

	public void setObserva(String observa) {
		this.observa = observa;
	}

	@Column(name = "f_carga", nullable = false, length = 35)
	public Date getFCarga() {
		return this.FCarga;
	}

	public void setFCarga(Date FCarga) {
		this.FCarga = FCarga;
	}

	@Column(name = "usr_carga", nullable = false)
	public long getUsrCarga() {
		return this.usrCarga;
	}

	public void setUsrCarga(long usrCarga) {
		this.usrCarga = usrCarga;
	}

	@Column(name = "f_modif", length = 35)
	public Date getFModif() {
		return this.FModif;
	}

	public void setFModif(Date FModif) {
		this.FModif = FModif;
	}

	@Column(name = "usr_modif")
	public Long getUsrModif() {
		return this.usrModif;
	}

	public void setUsrModif(Long usrModif) {
		this.usrModif = usrModif;
	}

	@Column(name = "orden_calculo")
	public Integer getOrdenCalculo() {
		return this.ordenCalculo;
	}

	public void setOrdenCalculo(Integer ordenCalculo) {
		this.ordenCalculo = ordenCalculo;
	}

}
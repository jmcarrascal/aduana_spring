package ar.gob.gba.sg.dpsit.sueldos.model;

// Generated 15/07/2013 12:44:21 by Hibernate Tools 3.2.0.b9

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * SueValorBase generated by hbm2java
 */
@Entity
@Table(name = "sue_valor_base")
public class SueValorBase implements java.io.Serializable {

	private long valorBaseId;
	private String leyId;
	private BigDecimal valor;
	private Date FDesde;
	private Date FHasta;

	public SueValorBase() {
	}

	public SueValorBase(long valorBaseId, String leyId, BigDecimal valor,
			Date FDesde) {
		this.valorBaseId = valorBaseId;
		this.leyId = leyId;
		this.valor = valor;
		this.FDesde = FDesde;
	}

	public SueValorBase(long valorBaseId, String leyId, BigDecimal valor,
			Date FDesde, Date FHasta) {
		this.valorBaseId = valorBaseId;
		this.leyId = leyId;
		this.valor = valor;
		this.FDesde = FDesde;
		this.FHasta = FHasta;
	}

	@Id
	@Column(name = "valor_base_id", unique = true, nullable = false)
	public long getValorBaseId() {
		return this.valorBaseId;
	}

	public void setValorBaseId(long valorBaseId) {
		this.valorBaseId = valorBaseId;
	}

	@Column(name = "ley_id", nullable = false, length = 4)
	public String getLeyId() {
		return this.leyId;
	}

	public void setLeyId(String leyId) {
		this.leyId = leyId;
	}

	@Column(name = "valor", nullable = false, precision = 15, scale = 5)
	public BigDecimal getValor() {
		return this.valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
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

}
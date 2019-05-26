package com.xsis.batch197.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "fakultas")
public class FakultasModel {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "fakultas_seq")
	@TableGenerator(name = "fakultas_seq", table = "tbl_sequences", pkColumnName = "seq_id", valueColumnName = "seq_value", initialValue = 0, allocationSize = 1)
	@Column(name = "id")
	private int id;

	@Column(name = "kd_fakultas", length = 10, nullable = false)
	private String kodeFakultas;

	@Column(name = "nm_fakultas", length = 100, nullable = false)
	private String namaFakultas;

	// jika ada relasi OTM maka harus ada MTO di file sebelah
	@OneToMany(mappedBy = "fakultas")
	private List<JurusanModel> listJurusan = new ArrayList<JurusanModel>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKodeFakultas() {
		return kodeFakultas;
	}

	public void setKodeFakultas(String kodeFakultas) {
		this.kodeFakultas = kodeFakultas;
	}

	public String getNamaFakultas() {
		return namaFakultas;
	}

	public void setNamaFakultas(String namaFakultas) {
		this.namaFakultas = namaFakultas;
	}

	public List<JurusanModel> getListJurusan() {
		return listJurusan;
	}

	public void setListJurusan(List<JurusanModel> listJurusan) {
		this.listJurusan = listJurusan;
	}

}

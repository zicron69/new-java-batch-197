package com.xsis.batch197.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = " jurusan")
public class JurusanModel {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "jurusan_seq")
	@TableGenerator(name = "jurusan_seq", table = "tbl_sequences", pkColumnName = "seq_id", valueColumnName = "seq_value", initialValue = 0, allocationSize = 1)

	@Column(name = " id")
	private int id;

	@Column(name = "kd_jurusan", length = 10, nullable = false)
	private String kodeJurusan;

	@Column(name = "nm_jurusan", length = 100, nullable = false)
	private String namaJurusan;

	@Column(name = "fakultas_id", nullable = false)
	private int fakultasId;

	// berlelasi dengan mahasiswa
	@OneToMany(mappedBy = "jurusan")
	private List<MahasiswaModel> mhsList = new ArrayList<MahasiswaModel>();

	// relasi MTO karena di fakultas relasi OTM ke Jurusan
	@ManyToOne
	@JoinColumn(name = "fakultas_id", foreignKey = @ForeignKey(name = "fk_jurusan_fakultas"), updatable = false, insertable = false)

	private FakultasModel fakultas;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKodeJurusan() {
		return kodeJurusan;
	}

	public void setKodeJurusan(String kodeJurusan) {
		this.kodeJurusan = kodeJurusan;
	}

	public String getNamaJurusan() {
		return namaJurusan;
	}

	public void setNamaJurusan(String namaJurusan) {
		this.namaJurusan = namaJurusan;
	}

	public int getFakultasId() {
		return fakultasId;
	}

	public void setFakultasId(int fakultasId) {
		this.fakultasId = fakultasId;
	}

	public FakultasModel getFakultas() {
		return fakultas;
	}

	public void setFakultas(FakultasModel fakultas) {
		this.fakultas = fakultas;
	}

}

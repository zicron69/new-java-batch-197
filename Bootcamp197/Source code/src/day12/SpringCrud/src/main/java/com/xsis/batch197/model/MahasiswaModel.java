package com.xsis.batch197.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import com.fasterxml.jackson.core.sym.Name;

@Entity
@Table(name = "mahasiswa") // nama table dalam database
public class MahasiswaModel {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "mahasiswa_seq")
	@TableGenerator(name = "mahasiswa_seq", table = "tbl_sequences", pkColumnName = "seq_id", valueColumnName = "seq_value", initialValue = 0, allocationSize = 1)

	@Column(name = "id")
	private int id;

	@Column(name = "nim", length = 10, nullable = false)
	private String nim;

	@Column(name = "nm_mahasiswa", length = 100, nullable = false)
	private String namaMahasiswa;

	@Column(name = "jk", length = 15, nullable = false)
	private String jenisKelamin;

	@Column(name = "alamat", length = 50, nullable = false)
	private String alamat;

	@Column(name = "jurusan_id", nullable = false)
	private int jurusanId;

	@Column(name = "status", length = 15, nullable = false)
	private String status;
	// relasi dengan jurusan
	@ManyToOne
	@JoinColumn(name = "jurusan_id", foreignKey = @ForeignKey(name = "fk_mahasiswa_jurusan"), updatable = false, insertable = false)

	private JurusanModel jurusan;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}

	public String getNamaMahasiswa() {
		return namaMahasiswa;
	}

	public void setNamaMahasiswa(String namaMahasiswa) {
		this.namaMahasiswa = namaMahasiswa;
	}

	public String getJenisKelamin() {
		return jenisKelamin;
	}

	public void setJenisKelamin(String jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public int getJurusanId() {
		return jurusanId;
	}

	public void setJurusanId(int jurusanId) {
		this.jurusanId = jurusanId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public JurusanModel getJurusan() {
		return jurusan;
	}

	public void setJurusan(JurusanModel jurusan) {
		this.jurusan = jurusan;
	}

}

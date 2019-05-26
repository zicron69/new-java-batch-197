package com.xsis.batch197.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xsis.batch197.model.MahasiswaModel;

@Repository
public interface MahasiswaRepo extends JpaRepository<MahasiswaModel, Integer>{

}

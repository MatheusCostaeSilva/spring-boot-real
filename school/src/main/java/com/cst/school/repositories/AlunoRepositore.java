package com.cst.school.repositories;

import com.cst.school.models.AlunoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepositore extends JpaRepository<AlunoModel, Long> {
}

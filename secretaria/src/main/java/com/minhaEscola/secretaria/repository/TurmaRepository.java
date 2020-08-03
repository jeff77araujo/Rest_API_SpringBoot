package com.minhaEscola.secretaria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.minhaEscola.secretaria.model.Turma;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Long> {
	public List<Turma> findAllByTurmaNomeContainingIgnoreCase(String turma);


}

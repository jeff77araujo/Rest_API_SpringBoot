package com.minhaEscola.secretaria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minhaEscola.secretaria.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
	public List<Aluno> findAllByNomeContainingIgnoreCase(String nome);


}

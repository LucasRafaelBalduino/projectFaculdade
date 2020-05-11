package com.example.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cursomc.domain.EmpresaTerceirizada;

@Repository
public interface EmpresaTerceirizadaRepository extends JpaRepository<EmpresaTerceirizada, Integer> {

}

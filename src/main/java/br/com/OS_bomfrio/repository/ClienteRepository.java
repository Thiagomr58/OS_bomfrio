package br.com.OS_bomfrio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.OS_bomfrio.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Long>{

}

package io.github.washingtondcs.domain.repository;

import io.github.washingtondcs.domain.entity.Cliente;
import io.github.washingtondcs.domain.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Peditos extends JpaRepository<Pedido, Integer> {

    List<Pedido> findByCliente(Cliente cliente);
}

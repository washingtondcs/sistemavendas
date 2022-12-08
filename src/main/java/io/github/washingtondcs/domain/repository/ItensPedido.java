package io.github.washingtondcs.domain.repository;

import io.github.washingtondcs.domain.entity.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItensPedido extends JpaRepository<ItemPedido, Integer> {
}

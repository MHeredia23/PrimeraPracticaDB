package com.mercadolibre.spoiledtomatoesapi.repositories;

import com.mercadolibre.spoiledtomatoesapi.models.MiniSerie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MiniSerieRepository extends JpaRepository<MiniSerie, Long> {

}

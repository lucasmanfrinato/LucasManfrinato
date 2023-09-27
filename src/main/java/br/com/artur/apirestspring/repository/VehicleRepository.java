package br.com.artur.apirestspring.repository;

import br.com.artur.apirestspring.model.VehicleModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<VehicleModel, Integer> {
}

package br.com.artur.apirestspring.repository;

import br.com.artur.apirestspring.model.CustomerModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerModel, Integer> {


}

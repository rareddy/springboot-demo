package io.swagger.api;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import io.swagger.model.Pet;
import io.swagger.model.Pet.StatusEnum;

@Repository
public interface PetRepository extends CrudRepository<Pet, Long>{

    @Query("select p from Pet p where p.status = :status")
    List<Pet> findByStatus(@Param("status") StatusEnum status);

}

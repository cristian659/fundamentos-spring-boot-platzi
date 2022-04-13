package com.fundamentosplatzi.springboot.fundamentos.repository;

import com.fundamentosplatzi.springboot.fundamentos.entity.User;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository//nos permite poder inyectar esta interfaz como dependencia
public interface UserRepository extends JpaRepository<User, Long> {//lo que quiero mapear, y luego el tipo de dato del id

  @Query("Select u from User u WHERE u.email=?1")//trabajando atrabes de objetos y no tablas
    Optional<User> findByUserEmail(String email);
  @Query("SELECT u from User u where u.name like ?1%")//like es buscar apartir de un nombre
  List<User> findAndSort(String name, Sort sort);
}

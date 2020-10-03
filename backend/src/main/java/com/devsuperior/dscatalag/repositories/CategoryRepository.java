package com.devsuperior.dscatalag.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dscatalag.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}

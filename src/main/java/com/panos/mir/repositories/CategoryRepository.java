package com.panos.mir.repositories;

import com.panos.mir.model.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Panos on 18-May-17.
 */
public interface CategoryRepository extends JpaRepository<Categories, Integer> {
}

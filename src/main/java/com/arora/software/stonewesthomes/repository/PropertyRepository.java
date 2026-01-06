package com.arora.software.stonewesthomes.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arora.software.stonewesthomes.model.Property;
import com.arora.software.stonewesthomes.model.PropertyType;

@Repository
public interface PropertyRepository extends JpaRepository<Property, Long>{

    List<Property> findByType(PropertyType type);
    List<Property> findByTypeAndCity(PropertyType type, String city);
    List<Property> findByPriceBewtween(BigDecimal minPrice, BigDecimal maxPrice);
    
}

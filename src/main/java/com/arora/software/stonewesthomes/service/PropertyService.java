package com.arora.software.stonewesthomes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.arora.software.stonewesthomes.model.Property;
import com.arora.software.stonewesthomes.model.PropertyType;
import com.arora.software.stonewesthomes.repository.PropertyRepository;

@Service
public class PropertyService {
    

    private final PropertyRepository propertyRepository;

    public PropertyService(PropertyRepository propertyRepository){
        this.propertyRepository = propertyRepository;
    }

    @Transactional
    public Property saveProperty(Property property){

        return propertyRepository.save(property);
    }

    public List<Property> getAllProperties(){
        return propertyRepository.findAll();
    }
    public Optional<Property> getPropertyById(Long id){
        return propertyRepository.findById(id);
    }

    @Transactional
    public void deleteProperty(Long id){
        propertyRepository.deleteById(id);
    }


    public List<Property> searchProperties(String city, PropertyType type) {
        if (city != null && type != null) {
            return propertyRepository.findByTypeAndCity(type, city);
        } else if (type != null) {
            return propertyRepository.findByType(type);
        } else {
            return propertyRepository.findAll();
        }
    }


}

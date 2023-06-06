package com.example.demo.mapping;

import com.example.demo.dto.ProductDTO;
import com.example.demo.persistence.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);
    ProductDTO toDTO(Product entity);
    Product toEntity(ProductDTO dto);
}

package com.example.demo.mapping;

import com.example.demo.dto.CategoryDTO;
import com.example.demo.persistence.entity.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    CategoryDTO toDTO(Category entity);

    Category toEntity(CategoryDTO dto);

}

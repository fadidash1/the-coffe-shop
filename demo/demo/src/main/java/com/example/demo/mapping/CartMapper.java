package com.example.demo.mapping;

import com.example.demo.dto.CartDTO;
import com.example.demo.persistence.entity.Cart;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CartMapper {
    CartMapper INSTANCE = Mappers.getMapper(CartMapper.class);

    CartDTO toDTO(Cart entity);
    Cart toEntity(CartDTO dto);
}

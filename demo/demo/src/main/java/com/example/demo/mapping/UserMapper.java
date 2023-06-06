package com.example.demo.mapping;

import com.example.demo.dto.UserDTO;
import com.example.demo.persistence.entity.User;
import org.mapstruct.Mapper;
        import org.mapstruct.Mapping;
        import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "firstName", target = "fname")
    @Mapping(source = "lastName", target = "lname")
    @Mapping(source = "email", target = "email")
    UserDTO toDto(User entity);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "fname", target = "firstName")
    @Mapping(source = "lname", target = "lastName")
    @Mapping(source = "email", target = "email")
    User toEntity(UserDTO dto);
}

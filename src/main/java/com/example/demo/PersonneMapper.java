package com.example.demo;

public class PersonneMapper {

    public static PersonneDTO convertToDTO(Personne entity){

        PersonneDTO dto = new PersonneDTO();
        dto.setFirstName(entity.getPrenom());
        dto.setLastName(entity.getNom());

        return dto;
    }

}

package com.lib_for_mentor.lib_for_mentor.model.response;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
@Builder
public class AuthorResponseDTO {
    private Integer id;
    private String firstName;
    private String lastName;
    private List<BookResponseDTO> books;
}

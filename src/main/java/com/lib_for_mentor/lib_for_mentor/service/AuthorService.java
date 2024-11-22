package com.lib_for_mentor.lib_for_mentor.service;

import com.lib_for_mentor.lib_for_mentor.model.AuthorRequest;
import com.lib_for_mentor.lib_for_mentor.model.AuthorResponse;
import com.lib_for_mentor.lib_for_mentor.model.CreateAuthorRequest;
import com.lib_for_mentor.lib_for_mentor.model.dto.AuthorParamsDTO;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.domain.Page;

public interface AuthorService {
    @NotNull
    AuthorResponse create(@NotNull CreateAuthorRequest request);

    @NotNull
    AuthorResponse updateAuthorInfo(@NotNull Integer id, @NotNull AuthorRequest request);

    @NotNull
    void deleteById(@NotNull Integer id);

    @NotNull
    Page<AuthorResponse> getAuthors(AuthorParamsDTO params, Integer offset, Integer limit);

    @NotNull
    AuthorResponse findById(@NotNull Integer id);

    @NotNull
    AuthorResponse assignBook (@NotNull Integer authorId, @NotNull Integer bookId); //---Остановка тут
}

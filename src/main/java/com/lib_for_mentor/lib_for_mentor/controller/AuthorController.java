package com.lib_for_mentor.lib_for_mentor.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/library/book")
@RequiredArgsConstructor //Автоматом конструктор создает DI
public class AuthorController {
}

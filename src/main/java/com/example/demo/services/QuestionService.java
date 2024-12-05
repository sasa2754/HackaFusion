package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.QuestionDto;
import com.example.demo.dto.ResponseDto;

public interface QuestionService {
    public QuestionDto create(Long idUser, Long idForum, String title, String description);
    public List<QuestionDto> getAll(Long idUser, Long idForum, Integer page, Integer size);
    public QuestionDto getById(Long idQuestion, Integer answerPage, Integer answerSize);
    public ResponseDto delete(Long idQuestion);
}

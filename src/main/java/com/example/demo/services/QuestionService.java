package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.ResponseDto;
import com.example.demo.model.Question;

public interface QuestionService {
    public Question post(Long idUser, Long idForum, String title, String description);
    public List<Question> getAll(Integer page, Integer size);
    public Question getById(Long idQuestion, Integer answerPage, Integer answerSize);
    public ResponseDto delete(Long idQuestion);
}

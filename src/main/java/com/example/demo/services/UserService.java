package com.example.demo.services;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.example.demo.dto.ResponseDto;
import com.example.demo.model.User;

public interface UserService {
    public User create(String nome, String edv, String email, String password, String numero, MultipartFile image, String description);
    public List<User> getAll(Integer page, Integer size);
    public User getById(Long idUser);
    public ResponseDto delete(Long idUser);
    public ResponseDto update(Long idUser,String nome, String edv, String email, String password, String numero, Boolean admin, Boolean ets, String image, String description);
}
package com.example.practiceproject.service;

import com.example.practiceproject.model.Weapon;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;

public interface IService {
    void create(Weapon weapon);
    Weapon read(Integer serial_number);
    List<Weapon> readAll();
    boolean update(Weapon weapon, Integer serial_number);
    boolean delete(Integer serial_number);

    File getData();

    boolean setData(MultipartFile file);
}

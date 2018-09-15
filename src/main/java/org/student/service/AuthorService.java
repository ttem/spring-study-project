package org.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.student.domain.Author;
import org.student.mapper.AuthorMapper;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorMapper authorMapper;

    public List<Author> getAllAuthors() {
        return authorMapper.getAllAuthors();
    }
}

package com.flearn.server.models.authors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> getAllAuthors() {
        List<Author> authors = new ArrayList<>();
        authorRepository.findAll()
                .forEach(authors::add);
        return authors;
    }

    public Optional<Author> getAuthor(String id){
       return authorRepository.findById(id);
    }

    public void addAuthor(Author author){
        authorRepository.save(author);
    }

    public void updateAuthor(String id, Author author){
        authorRepository.save(author);
    }

    public void deleteAuthor(String id){
        authorRepository.deleteById(id);
    }
}

package com.jex.demo.repository;

import com.jex.demo.node.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie, Long> {

    Movie findByTitle(String title);
}
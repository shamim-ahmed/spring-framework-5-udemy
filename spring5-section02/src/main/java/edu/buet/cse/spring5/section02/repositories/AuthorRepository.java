package edu.buet.cse.spring5.section02.repositories;

import org.springframework.data.repository.CrudRepository;

import edu.buet.cse.spring5.section02.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}

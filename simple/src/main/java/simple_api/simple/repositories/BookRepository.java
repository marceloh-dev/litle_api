package simple_api.simple.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import simple_api.simple.models.BookModel;

public interface BookRepository extends JpaRepository<BookModel, Long> {

}
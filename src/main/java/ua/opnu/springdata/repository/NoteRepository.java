package ua.opnu.springdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.opnu.springdata.entity.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
}
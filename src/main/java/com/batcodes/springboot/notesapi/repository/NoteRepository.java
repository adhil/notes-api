package com.batcodes.springboot.notesapi.repository;

import com.batcodes.springboot.notesapi.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
}



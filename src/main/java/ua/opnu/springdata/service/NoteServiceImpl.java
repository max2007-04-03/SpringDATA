package ua.opnu.springdata.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ua.opnu.springdata.entity.Note;
import ua.opnu.springdata.exception.NoteNotFoundException;
import ua.opnu.springdata.repository.NoteRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NoteServiceImpl implements NoteService {
    private final NoteRepository noteRepository;

    @Override
    public List<Note> listAll() {
        return noteRepository.findAll();
    }

    @Override
    public Note add(Note note) {
        return noteRepository.save(note);
    }

    @Override
    public void deleteById(long id) {
        noteRepository.deleteById(id);
    }

    @Override
    public void update(Note note) {
        if (!noteRepository.existsById(note.getId())) {
            throw new NoteNotFoundException("Note not found");
        }
        noteRepository.save(note);
    }

    @Override
    public Note getById(long id) {
        return noteRepository.findById(id)
                .orElseThrow(() -> new NoteNotFoundException("Note not found"));
    }
}
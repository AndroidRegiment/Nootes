package com.androidregiment.nootes.screen.notes.addNote.data

import com.androidregiment.nootes.data.dao.note.NoteDao
import com.androidregiment.nootes.data.entity.Note
import com.androidregiment.nootes.data.repo.note.AddNoteRepo

class AddNoteRepoImpl(private val noteDao: NoteDao) : AddNoteRepo {
    override suspend fun addNote(note: Note) = noteDao.addNote(note)

}
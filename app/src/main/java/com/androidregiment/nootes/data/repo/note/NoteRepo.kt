package com.androidregiment.nootes.data.repo.note

import com.androidregiment.nootes.data.entity.Note
import kotlinx.coroutines.flow.Flow

interface NoteRepo {

    fun getAllNotes(): Flow<List<Note>>

    suspend fun addNote(note: Note)

    suspend fun updateNote(note: Note)

    suspend fun deleteNote(note: Note)

    fun getNoteById(id : Int) : Flow<Note?>
}
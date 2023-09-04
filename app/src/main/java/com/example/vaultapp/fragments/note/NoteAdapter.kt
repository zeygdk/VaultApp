package com.example.vaultapp.fragments.note

import com.example.vaultapp.databinding.NoteItemBinding
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.vaultapp.data.Note



class NoteAdapter : ListAdapter<Note, NoteAdapter.NoteViewHolder>(NoteDiffCallback()) {
    private lateinit var binding:NoteItemBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
         binding = NoteItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return NoteViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        val currentNote = getItem(position)
        holder.bind(currentNote)
    }

    inner class NoteViewHolder(private val binding: NoteItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(note: Note) {
            binding.textViewTitle.text = note.title
            binding.textViewContent.text = note.content
        }
    }

    private class NoteDiffCallback : DiffUtil.ItemCallback<Note>() {
        override fun areItemsTheSame(oldItem: Note, newItem: Note): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Note, newItem: Note): Boolean {
            return oldItem == newItem
        }
    }
}

package com.example.musictheory.trainingtest.presentation.ui.list.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.example.musictheory.databinding.ItemTrainingTestBodyBinding

/**
 * @author Владислав Хвесюк 31.10.2021
 */

class ViewHolderTrainingTestBody(
    private val binding: ItemTrainingTestBodyBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(string: String) {
        binding.buttonItemTrainingTestBody.text = string
    }
}

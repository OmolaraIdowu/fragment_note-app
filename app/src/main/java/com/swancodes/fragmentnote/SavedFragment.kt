package com.swancodes.fragmentnote

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.swancodes.fragmentnote.databinding.FragmentSavedBinding

class SavedFragment : Fragment() {

        private var _binding: FragmentSavedBinding? = null
        private val binding get() = _binding!!
        private lateinit var outcome: String

        companion object {
            const val Outcome = "outcome"
        }

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            arguments?.let {

                outcome = it.getString(Outcome).toString()
            }
        }
        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View {

            _binding = FragmentSavedBinding.inflate(inflater, container, false)
            return binding.root
        }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
            binding.savedText.text = outcome
        }

}
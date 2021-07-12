package com.favwest.preschoolerscheduler

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class StartFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_start, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.new_schedule_button).setOnClickListener {
            this.findNavController().navigate(R.id.action_startFragment_to_newScheduleFragment)
        }
        view.findViewById<Button>(R.id.edit_student_info_button).setOnClickListener {
            this.findNavController().navigate(R.id.action_startFragment_to_editStudentInfoFragment)
        }

    }
}
package com.favwest.preschoolerscheduler

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class EditStudentInfoFragment : Fragment() {

    companion object {
        fun newInstance() = EditStudentInfoFragment()
    }

    private lateinit var viewModel: EditStudentInfoViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.edit_student_info_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(EditStudentInfoViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
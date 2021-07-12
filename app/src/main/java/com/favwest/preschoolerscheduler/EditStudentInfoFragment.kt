package com.favwest.preschoolerscheduler

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class EditStudentInfoFragment : Fragment() {

    private lateinit var viewModel: EditStudentInfoViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.edit_student_info_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val studentInfoRecyclerView = view.findViewById<RecyclerView>(R.id.student_info_recycler_view)
        studentInfoRecyclerView.layoutManager = LinearLayoutManager(context)
        val tempList = arrayOf("Sam", "Jack", "Lisa")
        val adapter = EditStudentRecyclerViewAdapter(tempList)
        studentInfoRecyclerView.adapter = adapter

        viewModel = ViewModelProvider(this).get(EditStudentInfoViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
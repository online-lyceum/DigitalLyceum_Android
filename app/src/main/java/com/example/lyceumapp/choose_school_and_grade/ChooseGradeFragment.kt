package com.example.lyceumapp.choose_school_and_grade

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CompoundButton
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lyceumapp.Const
import com.example.lyceumapp.R
import com.example.lyceumapp.databinding.FragmentChooseGradeBinding
import com.example.lyceumapp.databinding.RecyclerElementGradesBinding
import com.example.lyceumapp.json.grades.GradeJson
import com.example.lyceumapp.viewmodel.ChooseGradeViewModel

class ChooseGradeFragment() : Fragment() {
    lateinit var adapter: ChooseGradeAdapter

    private lateinit var viewModel: ChooseGradeViewModel

    constructor(viewModel: ChooseGradeViewModel): this() {
        this.viewModel = viewModel
    }

   override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_choose_grade, container, false)
        val binding = FragmentChooseGradeBinding.bind(view)

        adapter = ChooseGradeAdapter(requireArguments().getParcelableArrayList(Const.BUNDLE_KEY_GRADES_LIST)!!, layoutInflater, viewModel) //we mustn't let the situation to throw NullPointer here.
        binding.recyclerChooseGrade.adapter = adapter
        binding.recyclerChooseGrade.layoutManager = LinearLayoutManager(context)
        binding.recyclerChooseGrade.addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
        return view
    }

    class ChooseGradeAdapter(private val grades: ArrayList<GradeJson>, private val inflater: LayoutInflater, private val viewModel: ChooseGradeViewModel): RecyclerView.Adapter<ChooseGradeAdapter.GradeJsonHolder>() {
        var gradeId = viewModel.chosenGradeId

        private var checkedRadioButton: CompoundButton? = null

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            GradeJsonHolder(RecyclerElementGradesBinding.inflate(inflater))


        override fun onBindViewHolder(holder: GradeJsonHolder, position: Int) {
            holder.bindingGradeElement.textRecyclerElementGradesName.text = grades[position].toString()
            holder.bindingGradeElement.radioButtonRecyclerElementGrade.isChecked = grades[position].id == gradeId
            if (holder.bindingGradeElement.radioButtonRecyclerElementGrade.isChecked) {
                checkedRadioButton = holder.bindingGradeElement.radioButtonRecyclerElementGrade
                gradeId = grades[position].id
                viewModel.chosenGradeId = gradeId
            }
            holder.bindingGradeElement.radioButtonRecyclerElementGrade.setOnCheckedChangeListener { compoundButton, b ->
                checkedRadioButton?.isChecked = false
                checkedRadioButton = compoundButton
                gradeId = grades[position].id
                viewModel.chosenGradeId = gradeId
            }
        }

        override fun getItemCount() = grades.size

        class GradeJsonHolder(val bindingGradeElement: RecyclerElementGradesBinding) :
            RecyclerView.ViewHolder(bindingGradeElement.root)
    }
}
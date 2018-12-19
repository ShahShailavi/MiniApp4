package edu.fullerton.shailavishah.miniapp4

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import edu.fullerton.shailavishah.miniapp4.databinding.FragmentBinding
import kotlinx.android.synthetic.main.fragment.*
import java.text.DecimalFormat

class addFragment : androidx.fragment.app.Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentBinding>(inflater,R.layout.fragment,container,false)
        binding.conversationApplication= ViewModelProviders.of(this).get(DataModel::class.java)
        binding.setLifecycleOwner(this)
        return binding.root
    }


}
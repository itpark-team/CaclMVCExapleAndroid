package com.example.caclmvcexaple.controllers

import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.caclmvcexaple.R
import com.example.caclmvcexaple.views.MainActivity

class ControllerMainActivity {
    private lateinit var buttonCalculateSum: Button
    private lateinit var editTextA: EditText
    private lateinit var editTextB: EditText
    private lateinit var editTextResult: EditText

    private lateinit var mainActivity: MainActivity

    constructor(mainActivity: MainActivity) {
        this.mainActivity = mainActivity

        editTextA = mainActivity.findViewById(R.id.editTextA)
        editTextB = mainActivity.findViewById(R.id.editTextB)
        editTextResult = mainActivity.findViewById(R.id.editTextResult)

        buttonCalculateSum = mainActivity.findViewById(R.id.buttonCalculateSum)
        buttonCalculateSum.setOnClickListener(buttonCalculateSumClickListener)
    }

    private var buttonCalculateSumClickListener = View.OnClickListener {
        var a = editTextA.text.toString().toDouble()
        var b = editTextB.text.toString().toDouble()

        var result = a + b

        editTextResult.setText(result.toString())
    }

}
package com.example.practice18

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.widget.TextView
import org.w3c.dom.Text
import kotlin.io.path.fileVisitor

class FirstFragment : Fragment() {

    override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
    ): View? {

        val v = inflater.inflate(R.layout.fragment_first, container, false)

        v.findViewById<TextView>(R.id.textView)

        return v
    }

    fun m1(view: View) {
        va
    }
}
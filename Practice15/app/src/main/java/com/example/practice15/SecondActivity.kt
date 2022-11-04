package com.example.practice15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val textView: TextView = findViewById(R.id.textView)
        var dog: dog = dog()
        val arguments: Bundle? = intent.extras
        if (arguments != null) {
            dog =
                arguments.getParcelable<dog>(dog.javaClass.simpleName) as dog
            textView.text =
                "Месяц рождения: ${dog.getMonth()}\n" +
                        "Год рождения: ${dog.getYear()}\nПорода: ${dog.getName()}"
        }
    }

    class dog() : Parcelable {
        private var name: String = ""
        private var year: String = ""
        private var month: String = ""

        constructor(parcel: Parcel) : this() {
            name = parcel.readString().toString()
            year = parcel.readString().toString()
            month = parcel.readString().toString()
        }

        companion object CREATOR : Parcelable.Creator<dog> {
            override fun createFromParcel(parcel: Parcel): dog {
                return dog(parcel)
            }

            override fun newArray(size: Int): Array<dog?> {
                return arrayOfNulls(size)
            }
        }

        constructor(_name: String, _year: String, _month: String) : this() {
            name = _name
            year = _year
            month = _month
        }

        fun setMonth(_month: String) {
            month = _month
        }

        fun getMonth(): String {
            return month
        }

        fun setName(_name: String) {
            name = _name
        }

        fun getName(): String {
            return name
        }

        fun setYear(_year: String) {
            year = _year
        }

        fun getYear(): String {
            return year
        }

        override fun describeContents(): Int {
            return 0
        }

        override fun writeToParcel(dest: Parcel?, flags: Int) {
            dest?.writeString(month)
            dest?.writeString(year)
            dest?.writeString(name)
        }
    }
}
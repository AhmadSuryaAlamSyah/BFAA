package com.Alam.submission.view

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.Alam.submission.R
import com.Alam.submission.service.Reminder
import kotlinx.android.synthetic.main.activity_setting.*

class SettingActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var reminder: Reminder

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)
        reminder = Reminder()
        btn_on.setOnClickListener(this)
        btn_off.setOnClickListener(this)
        btn_test.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_on -> reminder.setRepeatingAlarm(this)

            R.id.btn_off -> reminder.cancelAlarm(this)

            R.id.btn_test -> reminder.showAlarmNotification(this)

        }
    }
}
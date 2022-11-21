package com.example.lyceumapp.viewmodel

import android.app.Application
import android.os.CountDownTimer
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.lyceumapp.Const
import com.example.lyceumapp.json.schools.SchoolJson

//every time NoResponseActivity.onCreate() method runs, we kinda 'create' our viewModel through ViewModelProvider and NoResponseViewModelFactory
//But although actually viewModel creates only the one time - when activity creates the first time, we still need to pass params to this constructor every
//every NoResponseActivity.onCreate() call.
//I don't know how to pass params into viewModel constructor only one time - that's why I save amountAttemptsToConnect and in onSaveInstanceState()
class NoResponseViewModel(application: Application, var amountAttemptsToConnect: Int): AndroidViewModel(application) {
    var noResponseType = Const.NoResponseType.GetSchools
    val liveDataCountDownTimerSeconds = MutableLiveData<Int?>()
    //'late init' var in Kotlin works like declared, but hasn't initialized yet variable. For example, in Java it would be like: int a; (and below somewhere 'a = 0;')
    lateinit var chosenSchool: SchoolJson

    init{
        //we need to show timer (like against ddos-attack) only when user has sent lots of requests to server
        if(amountAttemptsToConnect>=Const.AMOUNT_ATTEMPTS_TO_CONNECT_BEFORE_TIMING) {
            //it is very simple and cool Android built-in class for timer creating
            object: CountDownTimer(Const.DELAY_SECONDS_MANY_ATTEMPTS_TO_CONNECT.toLong(), 1000) {
                override fun onTick(p0: Long) {
                    //onTick() calls every second of out timer
                    liveDataCountDownTimerSeconds.value = (p0/1000).toInt()
                }

                override fun onFinish() {
                    liveDataCountDownTimerSeconds.value = null //null implies that timer has finished
                }
            }.start()
        }
    }

}
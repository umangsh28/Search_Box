package ug.sharma.takeaway_search_box.viewmodel

import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.schedulers.Schedulers
import ug.sharma.takeaway_search_box.MainUIModel
import ug.sharma.takeaway_search_box.model.ResponseDTO
import ug.sharma.takeaway_search_box.repo.Mrepositary
import kotlin.coroutines.coroutineContext

class MainViewModel :ViewModel() {

    private val mrepositary=Mrepositary()

    private val mutableLiveData=MutableLiveData<MainUIModel>()

    val liveData:LiveData<MainUIModel> =mutableLiveData

    private lateinit var disposable: Disposable

    fun CallByViewModel(query:String,city:String){
        mrepositary.getDataByRepo(query,city).subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object: Observer<ResponseDTO>{
                override fun onSubscribe(d: Disposable) {
                    disposable=d
                }

                override fun onNext(t: ResponseDTO) {
                   mutableLiveData.value=MainUIModel.OnSucess(t)
                }

                override fun onError(e: Throwable) {
                    mutableLiveData.postValue(null)
                }

                override fun onComplete() {
                    Log.d("umang","message is")
                }
            })

    }










}
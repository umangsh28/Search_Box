package ug.sharma.takeaway_search_box

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.Menu
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager

import ug.sharma.takeaway_search_box.model.ResponseDTO
import ug.sharma.takeaway_search_box.recycler.Vadapter
import ug.sharma.takeaway_search_box.viewmodel.MainViewModel
import android.widget.MultiAutoCompleteTextView

import android.widget.AutoCompleteTextView
import android.widget.ArrayAdapter

import android.widget.MultiAutoCompleteTextView.CommaTokenizer

import android.view.View
import androidx.appcompat.widget.SearchView
import androidx.lifecycle.Transformations.distinctUntilChanged
import androidx.lifecycle.Transformations.map
import ug.sharma.takeaway_search_box.databinding.ActivityMainBinding
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.ObservableOnSubscribe

import io.reactivex.rxjava3.schedulers.Schedulers

import io.reactivex.rxjava3.core.ObservableSource
import io.reactivex.rxjava3.functions.Predicate
import java.lang.Exception
import java.util.concurrent.TimeUnit
import io.reactivex.rxjava3.subjects.PublishSubject


class MainActivity : AppCompatActivity() {

    private lateinit var activityMainBinding: ActivityMainBinding

    private lateinit var mainViewModel: MainViewModel

    private lateinit var viewAdapter: Vadapter

    private var list: ResponseDTO? = null

    private val COUNTRIES = arrayOf(
        "kanpur",
        "lucknow",
        "delhi",
        "mumbai",
        "uttar pradesh",
        "kannoj",
        "dolavira",
        "lalbagh",
        "uttrakahand",
        "manipur",
        "delhi-south",
        "chennai",
        "rajasthan"
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

//
        val adapter: ArrayAdapter<String> = ArrayAdapter<String>(
            this,
            R.layout.support_simple_spinner_dropdown_item, COUNTRIES
        )
        val textView = findViewById<AutoCompleteTextView>(R.id.city)
        textView.setAdapter(adapter)


        searchEditText()

    }

    private fun searchEditText() {

        activityMainBinding.city.addTextChangedListener(object :
            TextWatcher {    /// normal edit text function
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                callapi(s.toString())
            }

            override fun afterTextChanged(s: Editable?) {

            }

        })


    }

    @SuppressLint("NotifyDataSetChanged")
    private fun callapi(city: String) {

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        mainViewModel.CallByViewModel("airtel", city)

        mainViewModel.liveData.observe(this, {
            when (it) {
                is MainUIModel.OnSucess -> {
                    list = it.responseDTO
                    setRecycler()

                }
                is MainUIModel.OnError -> {
                    Log.d("umang", "error == ${it.error}")
                }
            }
            viewAdapter.notifyDataSetChanged()

        })
    }

    private fun setRecycler() {

        //sort by update
        viewAdapter = Vadapter(list!!)
        val gridLayoutManager = LinearLayoutManager(this)
        Log.d("umang", gridLayoutManager.toString())
        activityMainBinding.recycler.adapter = viewAdapter
        activityMainBinding.recycler.layoutManager = gridLayoutManager

    }


}
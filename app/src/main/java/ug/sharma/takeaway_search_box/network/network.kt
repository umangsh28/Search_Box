package ug.sharma.takeaway_search_box.network

import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import ug.sharma.takeaway_search_box.api.api_client

object network {
   private val base_url=" https://digi-api.airtel.in/"

    fun getDataByNetwork():api_client{
        val retrofit=Retrofit.Builder()
            .baseUrl(base_url)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .build()

        return retrofit.create(api_client::class.java)
    }
}
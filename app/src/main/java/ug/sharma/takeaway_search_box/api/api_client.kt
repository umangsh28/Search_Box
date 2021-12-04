package ug.sharma.takeaway_search_box.api

import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET
import retrofit2.http.Query
import ug.sharma.takeaway_search_box.model.ResponseDTO

interface api_client {

    // https://digi-api.airtel.in/compassLocation/rest/address/autocomplete?queryString=airtel&city=gurgaon

    @GET("compassLocation/rest/address/autocomplete")
    fun getDataByApi(@Query("queryString") queryString: String,
                     @Query("city")city:String):Observable<ResponseDTO>
}
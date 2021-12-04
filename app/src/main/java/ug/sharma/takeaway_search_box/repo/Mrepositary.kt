package ug.sharma.takeaway_search_box.repo

import io.reactivex.rxjava3.core.Observable
import ug.sharma.takeaway_search_box.model.ResponseDTO
import ug.sharma.takeaway_search_box.network.network

class Mrepositary {

    fun getDataByRepo(query:String,city:String):Observable<ResponseDTO>{

        return network.getDataByNetwork().getDataByApi(query,city)
    }
}
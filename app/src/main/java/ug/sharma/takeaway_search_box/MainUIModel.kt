package ug.sharma.takeaway_search_box

import ug.sharma.takeaway_search_box.model.ResponseDTO

sealed class MainUIModel{

    data class OnSucess(var responseDTO: ResponseDTO):MainUIModel()

    data class OnError(var error:String):MainUIModel()

}

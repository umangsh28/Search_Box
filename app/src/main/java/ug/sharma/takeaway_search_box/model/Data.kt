package ug.sharma.takeaway_search_box.model


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("addressList")
    val addressList: List<Address>,
    @SerializedName("autoCompleteRequestString")
    val autoCompleteRequestString: String,
    @SerializedName("focusWord")
    val focusWord: String,
    @SerializedName("totalFindByRSUHits")
    val totalFindByRSUHits: Int,
    @SerializedName("totalNoRSUReturned")
    val totalNoRSUReturned: Int
)
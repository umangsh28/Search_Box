package ug.sharma.takeaway_search_box.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'\u00a8\u0006\b"}, d2 = {"Lug/sharma/takeaway_search_box/api/api_client;", "", "getDataByApi", "Lio/reactivex/rxjava3/core/Observable;", "Lug/sharma/takeaway_search_box/model/ResponseDTO;", "queryString", "", "city", "app_debug"})
public abstract interface api_client {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "compassLocation/rest/address/autocomplete")
    public abstract io.reactivex.rxjava3.core.Observable<ug.sharma.takeaway_search_box.model.ResponseDTO> getDataByApi(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "queryString")
    java.lang.String queryString, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "city")
    java.lang.String city);
}
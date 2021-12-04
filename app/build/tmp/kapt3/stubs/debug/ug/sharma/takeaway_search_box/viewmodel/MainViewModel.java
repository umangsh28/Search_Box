package ug.sharma.takeaway_search_box.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lug/sharma/takeaway_search_box/viewmodel/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "disposable", "Lio/reactivex/rxjava3/disposables/Disposable;", "liveData", "Landroidx/lifecycle/LiveData;", "Lug/sharma/takeaway_search_box/MainUIModel;", "getLiveData", "()Landroidx/lifecycle/LiveData;", "mrepositary", "Lug/sharma/takeaway_search_box/repo/Mrepositary;", "mutableLiveData", "Landroidx/lifecycle/MutableLiveData;", "CallByViewModel", "", "query", "", "city", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final ug.sharma.takeaway_search_box.repo.Mrepositary mrepositary = null;
    private final androidx.lifecycle.MutableLiveData<ug.sharma.takeaway_search_box.MainUIModel> mutableLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<ug.sharma.takeaway_search_box.MainUIModel> liveData = null;
    private io.reactivex.rxjava3.disposables.Disposable disposable;
    
    public MainViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<ug.sharma.takeaway_search_box.MainUIModel> getLiveData() {
        return null;
    }
    
    public final void CallByViewModel(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    java.lang.String city) {
    }
}
package ug.sharma.takeaway_search_box;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0003J\u0012\u0010\u0012\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0010H\u0002J\b\u0010\u0016\u001a\u00020\u0010H\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lug/sharma/takeaway_search_box/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "COUNTRIES", "", "", "[Ljava/lang/String;", "activityMainBinding", "Lug/sharma/takeaway_search_box/databinding/ActivityMainBinding;", "list", "Lug/sharma/takeaway_search_box/model/ResponseDTO;", "mainViewModel", "Lug/sharma/takeaway_search_box/viewmodel/MainViewModel;", "viewAdapter", "Lug/sharma/takeaway_search_box/recycler/Vadapter;", "callapi", "", "city", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "searchEditText", "setRecycler", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private ug.sharma.takeaway_search_box.databinding.ActivityMainBinding activityMainBinding;
    private ug.sharma.takeaway_search_box.viewmodel.MainViewModel mainViewModel;
    private ug.sharma.takeaway_search_box.recycler.Vadapter viewAdapter;
    private ug.sharma.takeaway_search_box.model.ResponseDTO list;
    private final java.lang.String[] COUNTRIES = {"kanpur", "lucknow", "delhi", "mumbai", "uttar pradesh", "kannoj", "dolavira", "lalbagh", "uttrakahand", "manipur", "delhi-south", "chennai", "rajasthan"};
    
    public MainActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void searchEditText() {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    private final void callapi(java.lang.String city) {
    }
    
    private final void setRecycler() {
    }
}
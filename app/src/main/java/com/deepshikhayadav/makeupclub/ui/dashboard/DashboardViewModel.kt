package com.deepshikhayadav.makeupclub.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.deepshikhayadav.makeupclub.model.MyResponse
import com.deepshikhayadav.makeupclub.retrofit.RetrofitBuilder
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

@DelicateCoroutinesApi
class DashboardViewModel : ViewModel() {
    private val _status = MutableLiveData<String>()
    private val _properties = MutableLiveData<List<MyResponse>>()
    private val _img = MutableLiveData<String>()


    val properties: LiveData<List<MyResponse>>
        get()=_properties

    val status: LiveData<String>
        get()=_status

    val img: LiveData<String>
        get()=_img

    private val cons: Int=1

    init {
        makeupResponse("annabelle",cons)
    }

    @DelicateCoroutinesApi
    public fun makeupResponse(brand : String, no: Int) {
        GlobalScope.launch(Dispatchers.Main){
            val myData:List<MyResponse> = if(no>0){
                RetrofitBuilder.buildService().getData2(brand)
            } else{
                RetrofitBuilder.buildService().getData3(brand)
            }

            if(myData.isNotEmpty()){
                _properties.value=myData
            }



        }

    }


}
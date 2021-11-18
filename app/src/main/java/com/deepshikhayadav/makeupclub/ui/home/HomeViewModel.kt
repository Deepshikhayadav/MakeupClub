package com.deepshikhayadav.makeupclub.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.deepshikhayadav.makeupclub.model.MyResponse
import com.deepshikhayadav.makeupclub.retrofit.MyServices
import com.deepshikhayadav.makeupclub.retrofit.RetrofitBuilder
import kotlinx.coroutines.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import kotlin.contracts.CallsInPlace

@DelicateCoroutinesApi
class HomeViewModel : ViewModel() {
    private val _status = MutableLiveData<String>()
    private val _properties = MutableLiveData<List<MyResponse>>()
    private val _img = MutableLiveData<String>()


    val properties: LiveData<List<MyResponse>>
    get()=_properties

    val status: LiveData<String>
        get()=_status

    val img: LiveData<String>
        get()=_img



    init {
       makeupResponse()
    }

    @DelicateCoroutinesApi
    private fun makeupResponse() {
     GlobalScope.launch(Dispatchers.Main){
          val myData= RetrofitBuilder.buildService().getData()
        /* val dmyData =myData.get(0).imageLink
         _img.value=dmyData*/

         //if(myData.isSuccessful){
             /* if(myData.isNotEmpty()){
                  _properties.value=myData
              }*/
              //for(obj in myData.body()!!){
            //  _text.value="Success: ${myData.body().toString()}  Product retrieved"
              //  }

        /*  }
          else{
            //  _text.value="Error occured"
          }*/
      }
/*
 val myData= RetrofitBuilder.buildService().getData()
                if(myData.isSuccessful){
                    //for(obj in myData.body()!!){
                        _text.value="Success: ${myData.body().toString()}  Product retrieved"
                  //  }

                }
                else{
                    _text.value="Error occured"
                }

* */
    }

}
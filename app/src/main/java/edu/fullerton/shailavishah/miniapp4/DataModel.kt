package edu.fullerton.shailavishah.miniapp4
import android.graphics.Color
import android.hardware.camera2.params.ColorSpaceTransform
import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.lang.Double
import java.lang.Exception
import java.text.DecimalFormat
import java.util.*

class DataModel : ViewModel(){

    val networkspeed = MutableLiveData<String>()
    val fileSize = MutableLiveData<String>()

    var time = MutableLiveData<String>()

    fun onTextChanged(speed:String?,file:String?) {
        try {
            networkspeed.value = speed
            fileSize.value = file
            if (networkspeed!!.value.toString().length > 0 && fileSize!!.value.toString().length > 0) {
                val dblNetworkSpeed = Double.parseDouble(networkspeed!!.value)
                val dblFileSize = Double.parseDouble(fileSize!!.value)
                // time!!.setTextColor(Color.parseColor())
                time!!.value = "Computed transfer time in seconds: " + DecimalFormat("##.#").format(dblFileSize * 1024.0 * 1024.0 * 8.0 / (dblNetworkSpeed * 1000000))
            } else {
                //time!!.setTextColor("#ffffff".toColor())
                time!!.value = "Please enter above mentioned value"
            }
        }catch (e:Exception){

        }
    }

}
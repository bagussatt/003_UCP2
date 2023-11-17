package com.example.exe2

import androidx.lifecycle.ViewModel
import com.example.exe2.Data.DataStateUI
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update


class skripsiViewModel: ViewModel() {
    private val _stateUI = MutableStateFlow(DataStateUI())
    val stateUI: StateFlow<DataStateUI> = _stateUI.asStateFlow()

   // fun setData(listData: MutableList<String>) {
        //_stateUI.update //{ sekarang ->
            //sekarang.copy(
              //  name = listData[0],
                //nim = listData[1],
                //kosen = listData[2],
                //jdls = listData[3]
 //           )
        }
   // }
//}






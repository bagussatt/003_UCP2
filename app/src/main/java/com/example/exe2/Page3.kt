package com.example.exe2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.exe2.Data.DataStateUI


@Composable
fun page3(
    contactUiState: DataStateUI,
    onBackButtonClicked: () -> Unit,
){
    Column (
        verticalArrangement = Arrangement.Center,

        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ){
        Text(text = "Nama")
        Text(text = contactUiState.nama)
        Divider()

        Text(text = "NIM")
        Text(text = contactUiState.nim)
        Divider()

        Text(text = "Kosentrasi")
        Text(text = contactUiState.kosen)

        Text(text = "Judul Skripsi")
        Text(text = contactUiState.jdls)
        Divider()


        Spacer(modifier = Modifier.padding(16.dp))

        Row (
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
        ){
            Button(onClick = { onBackButtonClicked}) {
                Text(text = "Kembali")
            }
        }

    }
}

@Preview
@Composable
fun Page3Preview() {
    page3(DataStateUI()) {

    }
}
package com.example.exe2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.TopStart
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Page2(
    onSubmitButtonClicked: (MutableList<String>) -> Unit
){
    var name by rememberSaveable { mutableStateOf("") }
    var NIM by rememberSaveable { mutableStateOf("") }
    var kosen by rememberSaveable { mutableStateOf("") }
    var jdls by rememberSaveable { mutableStateOf("") }
    var ListData: MutableList<String> = mutableListOf(name, NIM, jdls,kosen)

    Column (
        horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Formulir Pengajuan Skripsi", modifier = Modifier
            .padding(16.dp)
            .align(alignment = Alignment.CenterHorizontally)
        )


        OutlinedTextField(value = name, onValueChange = {name = it}, label = { Text(text = "Nama")})
        OutlinedTextField(value = NIM, onValueChange = {NIM = it}, label = { Text(text = "NIM")})
        OutlinedTextField(value = kosen, onValueChange = {kosen = it}, label = { Text(text = "Kosentrasi")})
        OutlinedTextField(value = jdls, onValueChange = {jdls = it}, label = { Text(text = "Judul Skripsi")})

        Row (modifier = Modifier
            .align(alignment = Alignment.Start)
            .padding(16.dp)
            ){
          Text(text = "Dosen Pembimbing 1")

        }
        Row (modifier = Modifier
            .align(alignment = Alignment.End)
            .padding(16.dp)){
            Text(text = "Dosen Pembimbing 2")

        }

        Spacer(modifier = Modifier.padding(16.dp))
        Button(onClick = { onSubmitButtonClicked(ListData) }) {
            Text(text = "Submit")
        }
    }
}

@Preview
@Composable
fun Page2Preview() {
    Page2({})

}
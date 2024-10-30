package com.example.pratikum.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment

@Preview(showBackground = true)
@Composable

fun MainScreen(
    modifier: Modifier = Modifier,
) {
    var nama by rememberSaveable { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf<String>(value = "") }
    var noHP by remember { mutableStateOf("") }
    var selectedGender by remember { mutableStateOf("") }
    var jenisKelamin = listOf("Laki-laki", "Perempuan")

    var namaUser by rememberSaveable { mutableStateOf("") }
    var emailUser by remember { mutableStateOf("") }
    var alamatUser by remember { mutableStateOf("") }
    var noHPUser by remember { mutableStateOf("") }
    var selectedGenderUser by remember { mutableStateOf("") }
    var jenisKelaminUser = listOf("Laki-laki", "Perempuan")

    Column(Modifier.fillMaxSize().padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        OutlinedTextField(
            value = nama,
            onValueChange = { nama = it },
            placeholder = { Text("Masukkan Nama") },
            label = { Text(text = "Nama") },
            modifier = Modifier.fillMaxWidth().padding(5.dp)
        )

        Row() {
            jenisKelamin.forEach { item ->
                Row(verticalAlignment = Alignment.CenterVertically) {
                    RadioButton(selected = selectedGender == item,
                        onClick = { selectedGender = item }
                    )
                }
                Text(item)
            }
        }

        Button(onClick = {}){
            namaUser = nama
            jenisKelaminUser = jenisKelamin
            alamatUser = alamat
            noHPUser = noHP
        }

        Card(modifier.size(height = 50.dp, width = 150.dp), ){
            CardSection(judulParam = "Nama", isiParam = namaUser)
            CardSection(judulParam = "Jenis Kelamin", isiParam = jenisKelaminUser)
            CardSection(judulParam = "Alamat", isiParam = alamatUser)
            CardSection(judulParam = "Nomor HP", isiParam = noHPUser)

        }



        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            placeholder = { Text("Masukkan Email") },
            label = { Text("Email") },
            modifier = Modifier.fillMaxWidth().padding(5.dp)
        )

        OutlinedTextField(
            value = alamat,
            onValueChange = { alamat = it },
            placeholder = { Text("Masukkan Alamat") },
            label = { Text("Alamat") },
            modifier = Modifier.fillMaxWidth().padding(5.dp)
        )

        OutlinedTextField(
            value = noHP,
            onValueChange = { noHP = it },
            placeholder = { Text("Masukkan Nomor HP") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            label = { Text("Nomor HP") },
            modifier = Modifier.fillMaxWidth().padding(5.dp)
        )
    }
}

@Composable
fun CardSection(JudulParam: String, isiParam: String ) {
    Column() {
        Row {

        }
    }
}


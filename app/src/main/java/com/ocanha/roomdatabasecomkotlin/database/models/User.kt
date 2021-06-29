package com.ocanha.roomdatabasecomkotlin.database.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @ColumnInfo(name = "first_name") val firstName: String,
    @ColumnInfo(name = "last_name") val lastName: String
){
    @PrimaryKey(autoGenerate = true)
    var uid : Int = 0
}

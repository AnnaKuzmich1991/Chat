package com.sapon.chat.data

import java.util.Date

data class User(
    val id:String,
    val name: String,
    val lastUpdate: Date,
    private var myContacts : MutableList<User> = ArrayList()
)

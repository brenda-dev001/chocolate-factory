package com.example.factory_chocolate.data.dao

import android.content.ContentValues
import com.example.factory_chocolate.data.database.DataBaseHelper
import com.example.factory_chocolate.data.model.Customer

class CustomerDao {

    fun insertCustomer(bank: DataBaseHelper, customer: Customer): Boolean{
        val db = bank.writableDatabase
        val values = ContentValues().apply {
            put("cpf", customer.cpf)
            put("name", customer.name)
            put("email", customer.email)
            put("phone", customer.phone)
            put("age", customer.age)
        }

        val result = db.insert("customer", null, values)
        return result != -1L
    }
}
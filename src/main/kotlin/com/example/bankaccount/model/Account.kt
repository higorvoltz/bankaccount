/*
package com.example.bankaccount.model

import com.example.bankaccount.exception.InsufficientBalanceException
import com.example.bankaccount.exception.NegativeValueException
import com.example.bankaccount.exception.SystemAccessException

abstract class Account(
    val id: Long,
    val holder: String,
    val number: Int
) : Authenticable {
    var balance = 0.0
        protected set

    fun deposit(value: Double) {
        if (value > 0.0) {
            balance += value
        } else {
            throw NegativeValueException("value cannot be negative !")
        }
    }

    abstract fun withdraw(value: Double)

    fun transfer(value: Double, destinyAccount: Account, password: Int) {
        if (balance < value) {
            throw InsufficientBalanceException("insufficient balance")
        }
        if (!authenticate(password)) {
            throw SystemAccessException("incorrect password")
        }

        balance -= value
        destinyAccount.withdraw(value)
    }
}*/

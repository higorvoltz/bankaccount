/*
package com.example.bankaccount.model

import com.example.bankaccount.exception.InsufficientBalanceException
@Entity
data class checkingAccount(
    val id: Long,
    val holder: Client,
    val number: Int
): Account(
    holder = holder,
    number = number
) {
    override fun withdraw(value: Double) {
        val taxValue = value + 0.1
        if (this.balance > taxValue){
            this.balance -= taxValue
        } else if (this.balance < 0){
            throw InsufficientBalanceException("you cannot withdraw, zero balance")
        }
    }

    override fun authenticate(password: Int): Boolean {
        return holder.authenticate(password)
    }
}*/

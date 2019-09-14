package com.v1ack.myapplication

enum class TransactionType {
    REMITTANCE,
    PAYMENT,
    PURCHASE
}

data class Transaction(
    val type: TransactionType,
    val organization: String,
    val listOfMoney: Array<Int>
)
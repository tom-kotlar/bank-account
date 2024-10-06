package com.example.bankaccountstatment

class BankAccount(var accountHolder: String, var balance: Double) {

    private val transactionHistory = mutableListOf<String>()

    fun deposit(amount: Double) {
        balance += amount
        transactionHistory.add("$accountHolder deposited $$amount. New balance: $$balance")
    }

    fun withdraw(amount: Double) {
        if (amount <= balance) {
            balance -= amount
            transactionHistory.add("$accountHolder withdrew $$amount. New balance: $$balance")
        } else {
            println("YOU DON'T HAVE ENOUGH FUNDS TO WITHDRAW.")
        }
    }

    fun displayBalance() {
        println("Transaction history for $accountHolder:")

        if (transactionHistory.isEmpty()) {
            println("No transactions made.")
        } else {
            for (transaction in transactionHistory) {
                println(transaction)
            }
        }
    }

    fun actualBalance(): String {
        return "$accountHolder has a balance of $$balance"
    }
}
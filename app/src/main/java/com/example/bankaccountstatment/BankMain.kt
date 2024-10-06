package com.example.bankaccountstatment

fun main() {

    val myBankAccount = BankAccount("Tom", 0.0)

    myBankAccount.deposit(20.0)
    myBankAccount.deposit(123.20)
    myBankAccount.withdraw(3.20)


    myBankAccount.displayBalance()
    println(myBankAccount.actualBalance())
//println("${myBankAccount.accountHolder} balance ${myBankAccount.balance}")
}
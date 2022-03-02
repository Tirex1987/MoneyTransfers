package ru.netology

fun main() {
    val amount = 10_000_00
    val commissionPercentage = 0.75
    val commissionMinimum = 35_00

    val calculatedCommission = (amount * commissionPercentage / 100).toInt()
    val realCommission = if (calculatedCommission < commissionMinimum)
        commissionMinimum else calculatedCommission
    println("Перевод на сумму $amount коп. Комиссия за перевод: $realCommission коп.")
}
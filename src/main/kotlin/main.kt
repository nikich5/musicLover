fun main() {
    val lastPurchaseAmount = 15000
    val purchaseAmount = 1500.0
    var purchaseSum: Double
    val regularCustomer = true

    if (lastPurchaseAmount < 1000) {
        purchaseSum = purchaseAmount
        println("Сумма покупки составит: $purchaseSum")
    } else if (lastPurchaseAmount > 1000 && lastPurchaseAmount < 10000 && purchaseAmount >= 1000) {
        purchaseSum = purchaseAmount - 100
        println("Вам предоставлена скидка 100 рублей, сумма покупки составит $purchaseSum рублей")
    } else {
        purchaseSum = purchaseAmount * 0.95
        println("Вам предоставлена скидка 5%, сумма покупки составит $purchaseSum рублей")
    }

    if (regularCustomer) {
        purchaseSum *= 0.99
        println("Дополнительно со скидкой постоянного клиента, сумма составит: $purchaseSum")
    }
}
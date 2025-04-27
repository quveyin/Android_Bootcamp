package com.example.firstproject.fonksiyonlar

// Ödev 2: Fonksiyon Oluşturma
// Soru 1 - Dereceyi Fahrenheit'a çeviren metod
fun soru1(celsius: Double): Double {
    return (celsius * 1.8) + 32
}

// Soru 2 - Dikdörtgenin çevresini hesaplayan metod
fun soru2(kenar1: Int, kenar2: Int): Int {
    return 2 * (kenar1 + kenar2)
}

// Soru 3 - Sayının faktöriyelini hesaplayan metod
fun soru3(sayi: Int): Int {
    var sonuc = 1
    for (i in 1..sayi) {
        sonuc *= i
    }
    return sonuc
}

// Soru 4 - Kelime içindeki 'a' harfi sayısını bulan metod
fun soru4(kelime: String): Int {
    return kelime.count { it == 'a' || it == 'A' }
}

// Soru 5 - Kenar sayısına göre iç açılar toplamını hesaplayan metod
fun soru5(kenarSayisi: Int): Int {
    return (kenarSayisi - 2) * 180
}

// Soru 6 - Gün sayısına göre maaş hesaplayan metod
fun soru6(gunSayisi: Int): Int {
    val saatlikUcret = 10
    val mesaiSaatlikUcret = 20
    val toplamSaat = gunSayisi * 8

    return if (toplamSaat <= 160) {
        toplamSaat * saatlikUcret
    } else {
        val normalSaat = 160
        val mesaiSaat = toplamSaat - 160
        (normalSaat * saatlikUcret) + (mesaiSaat * mesaiSaatlikUcret)
    }
}

// Soru 7 - Kota miktarına göre ücret hesaplayan metod
fun soru7(kota: Int): Int {
    val sabitUcret = 100
    val kotaLimiti = 50
    val fazlaKotaBirimUcret = 4

    return if (kota <= kotaLimiti) {
        sabitUcret
    } else {
        sabitUcret + (kota - kotaLimiti) * fazlaKotaBirimUcret
    }
}

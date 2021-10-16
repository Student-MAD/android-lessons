package com.example.juiceadvicer

class JuiceAdvicer {
    fun getJuices(brand: String): List<String> {
        return when(brand) {
            "J7" -> {
                listOf("Яблочный", "Апельсиновый")
            }
            "Добрый" -> {
                listOf("Морковный", "Вишневый")
            }
            "Rich" -> {
                listOf("Грейпфрут", "Персиковый")
            }
            else -> listOf()
        }
    }
}
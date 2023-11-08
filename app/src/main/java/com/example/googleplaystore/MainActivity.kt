package com.example.googleplaystore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

val categoryList = listOf(
    "Đề Xuất Cho Bạn",
    "Ứng Dụng Phổ Biến",
    "Ứng Dụng Giáo Dục",
    "Ứng Dụng Có Tính Phí",
    "Sức Khoẻ Và Thể Dục",
    "Tăng Năng Suất"
)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv: RecyclerView = findViewById(R.id.rv)
        rv.layoutManager = LinearLayoutManager(this)

        rv.adapter = Category(categoryList)
    }
}
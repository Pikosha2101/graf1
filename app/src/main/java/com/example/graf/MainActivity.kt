package com.example.graf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.mikephil.charting.charts.BarChart
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import com.github.mikephil.charting.utils.ColorTemplate

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val entries = ArrayList<BarEntry>()
        entries.add(BarEntry(4f, 0))
        entries.add(BarEntry(8f, 1))
        entries.add(BarEntry(6f, 2))
        entries.add(BarEntry(12f, 3))
        entries.add(BarEntry(18f, 4))
        entries.add(BarEntry(9f, 5))
        val dataset = BarDataSet(entries,"")

        val labels = ArrayList<String>()
        labels.add("January")
        labels.add("February")
        labels.add("March")
        labels.add("April")
        labels.add("May")
        labels.add("June")

        val chart = BarChart(this)
        setContentView(chart)
        dataset.setColors(ColorTemplate.COLORFUL_COLORS)
        val data = BarData(labels, dataset)
        chart.data = data

        chart.setDescription("Диаграмма")
    }
}
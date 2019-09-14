package com.v1ack.myapplication

import android.os.Bundle
import android.widget.Adapter
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var recycleView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    private lateinit var myData: List<*>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myData = arrayOf(
            Transaction(TransactionType.PAYMENT, "Антон Плетнев", arrayOf(100000)),
            Transaction(TransactionType.PAYMENT, "Антон Плетнев", arrayOf(100000)),
            Transaction(TransactionType.PAYMENT, "Антон Плетнев", arrayOf(100000)),
            Transaction(TransactionType.PAYMENT, "Антон Плетнев", arrayOf(100000)),
            Transaction(TransactionType.PAYMENT, "Антон Плетнев", arrayOf(100000)),
            Transaction(TransactionType.PAYMENT, "Антон Плетнев", arrayOf(100000)),
            Transaction(TransactionType.PAYMENT, "Антон Плетнев", arrayOf(100000)),
            Transaction(TransactionType.PAYMENT, "Антон Плетнев", arrayOf(100000)),
            Transaction(TransactionType.PAYMENT, "Антон Плетнев", arrayOf(100000)),
            Transaction(TransactionType.PAYMENT, "Антон Плетнев", arrayOf(100000)),
            Transaction(TransactionType.PAYMENT, "Антон Плетнев", arrayOf(100000))
        )

        viewManager = LinearLayoutManager(this)
        viewAdapter = TransactionAdapter(myData)

        recycleView = findViewById<RecyclerView>(R.id.recycler).apply {
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = viewAdapter
        }

    }
}

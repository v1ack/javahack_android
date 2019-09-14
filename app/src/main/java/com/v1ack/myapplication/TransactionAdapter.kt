package com.v1ack.myapplication

import android.content.res.Resources
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TransactionAdapter(val dataset: Array<Transaction>) :
    RecyclerView.Adapter<TransactionAdapter.MyViewHolder>() {
    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(dataset[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val card = LayoutInflater.from(parent.context).inflate(R.layout.card_transaction, parent, false) as View
        return MyViewHolder(card)
    }

    inner class MyViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val type: TextView = view.findViewById(R.id.tvTransactionType)
        val organization: TextView = view.findViewById(R.id.tvOrganisation)
        val icon: ImageView = view.findViewById(R.id.ivIcon)

        fun bind(transaction: Transaction) {
            type.text = when (transaction.type) {
                TransactionType.REMITTANCE -> "Перевод"
                TransactionType.PAYMENT -> "Платеж"
                TransactionType.PURCHASE -> "Покупка"
            }

            organization.text = transaction.organization

            icon.setImageResource(when(transaction.type) {
                TransactionType.REMITTANCE -> R.drawable.ic_card
                TransactionType.PAYMENT -> R.drawable.ic_card
                TransactionType.PURCHASE -> R.drawable.ic_card

            })
        }
    }


}
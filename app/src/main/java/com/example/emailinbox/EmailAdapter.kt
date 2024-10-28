package com.example.emailinbox

import android.graphics.PorterDuff
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EmailAdapter(private val emails: List<EmailItem>) :
    RecyclerView.Adapter<EmailAdapter.EmailViewHolder>() {

    class EmailViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val avatarText: TextView = view.findViewById(R.id.avatarText)
        private val senderText: TextView = view.findViewById(R.id.senderText)
        private val subjectText: TextView = view.findViewById(R.id.subjectText)
        private val previewText: TextView = view.findViewById(R.id.previewText)
        private val timeText: TextView = view.findViewById(R.id.timeText)

        fun bind(email: EmailItem) {
            avatarText.text = email.sender.first().toString().uppercase()
            avatarText.background.setColorFilter(email.color, PorterDuff.Mode.SRC_IN)

            senderText.text = email.sender
            subjectText.text = email.subject
            previewText.text = email.preview
            timeText.text = email.time
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_email, parent, false)
        return EmailViewHolder(view)
    }

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        holder.bind(emails[position])
    }

    override fun getItemCount() = emails.size
}
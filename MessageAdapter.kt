 

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class MessageAdapter(
    private val lista: List<Message>
) : Adapter<MessageAdapter.MessageViewHolder>() {

    inner class MessageViewHolder(
        val itemView: View
    ) : ViewHolder( itemView )  {

        val textName: TextView = itemView.findViewById(R.id.text_name)
        val textMessage: TextView = itemView.findViewById(R.id.text_message)
        val textTime: TextView = itemView.findViewById(R.id.text_time)

    }

    
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {

        val layoutInflater = LayoutInflater.from(
            parent.context
        )

        val itemView = layoutInflater.inflate(
            R.layout.item_list, parent, false
        )

        return MessageViewHolder( itemView )

    }


    override fun onBindViewHolder(messageViewHolder: MessageViewHolder, position: Int) {

        val message = list[position]
        messageViewHolder.textNome.text = message.name
        messageViewHolder.textUltima.text = message.messages
        messageViewHolder.textHorario.text = message.time

    }

 
    override fun getItemCount(): Int {
        return list.size
    }

}
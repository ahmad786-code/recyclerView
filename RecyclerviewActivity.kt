 

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class RecyclerviewActivity : AppCompatActivity() {

    private lateinit var rvLista: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview)

        val list = listOf(
            Message("jamilton", "Hello?", "10:45"),
            Message("ana", "Lorem ipsum dolorem sit amet, dolor sit amet ipsum dolorem, dolor sit amet ipsum doloremLorem ipsum dolorem sit amet, dolor sit amet ipsum dolorem, dolor sit amet ipsum dolorem", "00:45"),
            Message("maria", "How are you", "06:03"),
            Message("pedro", "Whatsup", "15:32"),
        )

        rvList = findViewById(R.id.rv_list)
        rvList.adapter = MessageAdapter( lista ) 

rv_list.layoutManager = LinearLayoutManager(this)
         
       

    }
}
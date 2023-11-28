import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.reklama3.User.User
import com.example.reklama3.databinding.ItemRvBinding
import java.util.ArrayList

class Adapter (private var list: ArrayList<User>): RecyclerView.Adapter<Adapter.Vh>() {

    inner class Vh(private val itemRvBinding: ItemRvBinding) : RecyclerView.ViewHolder(itemRvBinding.root) {

        fun onBind(user: User) {
            itemRvBinding.img1.setImageResource(user.photo1)
            itemRvBinding.img2.setImageResource(user.photo2)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemRvBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])
    }

}
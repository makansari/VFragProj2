package navdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.vfragproj2.R
import kotlinx.android.synthetic.main.blue_frag.*
import kotlinx.android.synthetic.main.blue_frag.view.*

class BlueNavFrag  : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var v = inflater.inflate(R.layout.blue_frag,container,false)
        return v
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var myNavCon = Navigation.findNavController(view)

        buttonBluePassdata.setOnClickListener {
            Toast.makeText(activity,"Testing",Toast.LENGTH_LONG).show()
            myNavCon.navigate(R.id.action_blueNavFrag_to_redNavFrag)
        }
    }
}
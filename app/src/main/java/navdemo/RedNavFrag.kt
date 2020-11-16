package navdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.vfragproj2.R
import kotlinx.android.synthetic.main.red_frag.*
import kotlinx.android.synthetic.main.red_frag.view.*

class RedNavFrag : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var v = inflater.inflate(R.layout.red_frag,container,false)

        return v
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var mynav = Navigation.findNavController(view)

        textViewRedResult.setOnClickListener {

            mynav.navigate(R.id.action_redNavFrag_to_greenNavFrag2)
        }
    }

}
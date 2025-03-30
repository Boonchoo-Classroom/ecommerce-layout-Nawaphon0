package scisrc.mobiledev.ecommercelayout.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import scisrc.mobiledev.ecommercelayout.databinding.FragmantProfileBinding
import scisrc.mobiledev.ecommercelayout.databinding.FragmentHomeBinding
import scisrc.mobiledev.ecommercelayout.databinding.FragmentProductsBinding

class ProfileFragment : Fragment() {

    private var _binding: FragmantProfileBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // ONLY inflate layout here
        _binding = FragmantProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    // function to do the action in this fragment
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}
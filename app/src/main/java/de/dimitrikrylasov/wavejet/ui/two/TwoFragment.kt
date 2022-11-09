package de.dimitrikrylasov.wavejet.ui.two

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import de.dimitrikrylasov.wavejet.MainViewModel
import de.dimitrikrylasov.wavejet.databinding.FragmentTwoBinding

/**
 * Fragment 2
 */
class TwoFragment : Fragment() {

    /* -------------------- Klassen Variablen -------------------- */

    /** Bindet das XML-View mit der Klasse um auf die Elemente zugreifen zu können */
    private lateinit var binding: FragmentTwoBinding

    /** Das ViewModel zu diesem Fragment */
    private val viewModel: MainViewModel by activityViewModels()

    /* -------------------- Lifecycle -------------------- */
    /**
     * Lifecycle Methode wenn das View erstellt wird
     *
     * @param inflater                Layout Inflater
     * @param container               View Gruppe
     * @param savedInstanceState      Eventuelle saveStates
     */
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTwoBinding.inflate(inflater)

        return binding.root
    }
}

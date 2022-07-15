package emsi.pfa.pambouparis.ui.produit;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import emsi.pfa.pambouparis.adapter.productAdapter;
import emsi.pfa.pambouparis.beans.Vetement;
import emsi.pfa.pambouparis.databinding.FragmentProductBinding;

public class HomeFragment extends Fragment {

    private FragmentProductBinding binding;

    private Adapter adapter;

    private String[] listproduct = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"};
    public static HomeFragment newInstance(){return new HomeFragment();}
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        //this inflates the fragement_mains to the view group
        //this next line use the listitemview to get the recycleview

        binding = FragmentProductBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final ListView recycle = binding.listproducts;
        //this actually loads the list items
        List<Vetement> vetements = new ArrayList<>();
        vetements.add(new Vetement(1, "nom", "description", "image", 12, 12, 12, 12, 12));
        vetements.add(new Vetement(1, "nom", "description", "image", 12, 12, 12, 12, 12));
        vetements.add(new Vetement(1, "nom", "description", "image", 12, 12, 12, 12, 12));
        productAdapter pA = new productAdapter(getActivity(), vetements);
        binding.listproducts.setAdapter(pA);


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
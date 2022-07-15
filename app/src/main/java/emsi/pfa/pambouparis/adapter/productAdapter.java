package emsi.pfa.pambouparis.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import emsi.pfa.pambouparis.R;
import emsi.pfa.pambouparis.beans.Vetement;

public class productAdapter extends ArrayAdapter<Vetement> {


    public productAdapter(Context context, List<Vetement> machines) {
        super(context, R.layout.itemvetement, machines);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Vetement ferme = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.itemvetement, parent, false);
        }
        TextView idferme = convertView.findViewById(R.id.title);
        //load image from url--------------------------------------
        //CircleImageView fimage = convertView.findViewById(R.id.fermeimages);
        //InputStream in = null;
        //TextView fnbrparcelle = convertView.findViewById(R.id.fnbrparcelle);
        //idferme.setText(ferme.getId() + "");
        //  fimage.setImageResource(machine.getPrix()+"");
        //fnbrparcelle.setText(ferme.getNumParcel() + "");
        return convertView;
    }
}

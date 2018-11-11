package cl.firewatch.firewatch;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class HumoAdapter extends RecyclerView.Adapter<HumoAdapter.ViewHolderSectores> {

    ArrayList<String> sectores;

    public HumoAdapter(ArrayList<String> sectores) {
        this.sectores = sectores;
    }

    @NonNull
    @Override
    public ViewHolderSectores onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.list_humo,null,false);
        ViewHolderSectores viewHolderSectores =new ViewHolderSectores(view);
        return viewHolderSectores;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderSectores holder, int position) {
        holder.setSectores(sectores.get(position));
    }

    @Override
    public int getItemCount() {//tamaño total de la lista
        return sectores.size();
    }

    public class ViewHolderSectores extends RecyclerView.ViewHolder {

        TextView tv_sectores;

        public ViewHolderSectores(View itemView) {
            super(itemView);
            tv_sectores=itemView.findViewById(R.id.tv_sectores);
        }

        public void setSectores(String sector) {
            tv_sectores.setText(sector);
        }
    }
}

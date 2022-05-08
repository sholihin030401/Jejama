package com.dikasihnama.jejama.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dikasihnama.jejama.R;

import java.util.List;

public class ModelAdapter extends RecyclerView.Adapter<ModelAdapter.ModelHolder> {

    public static final String TAG = "ModelAdapter";
    List<ModelItem> itemList;

    public ModelAdapter(List<ModelItem> itemList) {
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public ModelAdapter.ModelHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.menu_item,parent,false);

        return new ModelHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ModelAdapter.ModelHolder holder, int position) {
        ModelItem items = itemList.get(position);
        holder.title.setText(items.getTitle());
        holder.imageView.setImageResource(items.getIcon());
        holder.description.setText(items.getDesc());
        holder.txbutton.setText(items.getTextbutton());
        boolean isexpanded = itemList.get(position).isExpand();
        holder.expandLayout.setVisibility(isexpanded ? View.VISIBLE : View.GONE);
        holder.imgArrow.setImageResource(isexpanded ? R.drawable.ic_arrow_down : R.drawable.ic_arrow_up);
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class ModelHolder extends RecyclerView.ViewHolder {

        public static final String TAG = "ModelAdapter";
        TextView title, description, txbutton;
        ImageView imageView, imgArrow;
        RelativeLayout expandLayout, clickedLayout;

        public ModelHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.tx1);
            description = itemView.findViewById(R.id.desc);
            imageView = itemView.findViewById(R.id.img_solution);
            imgArrow = itemView.findViewById(R.id.arrow_expand);
            txbutton = itemView.findViewById(R.id.intentdialog);
            expandLayout = itemView.findViewById(R.id.expand_menu);
            clickedLayout = itemView.findViewById(R.id.clicklayout);

            clickedLayout.setOnClickListener(v -> {
                ModelItem item = itemList.get(getAdapterPosition());
                item.setExpand(!item.isExpand());
                notifyItemChanged(getAdapterPosition());
            });
        }
    }
}

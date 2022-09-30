package najfi.ali67.packagesapp.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import najfi.ali67.packagesapp.Models.Package;
import najfi.ali67.packagesapp.R;

public class PackageAdpater extends RecyclerView.Adapter<PackageAdpater.PackageViewHolder> {

    List<Package> list;
    OnItemClickListener onItemClickListener;
    OnItemButtonClickListener btnClickListener;
    Context context;

    public PackageAdpater(List<Package> list, Context context) {
        this.list = list;
        this.context = context;
    }

   public void setOnItemClickListener(OnItemClickListener onItemClickListener){
        this.onItemClickListener = onItemClickListener;

   }
    public void setOnItemButtonClickListener(OnItemButtonClickListener onItemButtonClickListener){
        btnClickListener = onItemButtonClickListener;

    }



    @NonNull
    @Override
    public PackageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.row_layout, parent, false);
        return new PackageViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull PackageViewHolder holder, int position) {

        Package data = list.get(position);
        holder.tvSms.setText(data.getSms());
        holder.tvMbs.setText(data.getInternet());
        holder.tvValidity.setText(data.getValidity());
        holder.tvOfNetMints.setText(data.getOffNet());
        holder.tvOnNetMints.setText(data.getOnNet());
        holder.tvPackageName.setText(data.getTitle());
        holder.tvPrice.setText(data.getPrice());
        holder.ivImage.setImageResource(data.getImageResId());


    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    class PackageViewHolder extends RecyclerView.ViewHolder {
        TextView tvSms, tvMbs, tvOnNetMints, tvOfNetMints, tvValidity,
                tvPrice, tvPackageName;
        Button btnSubscribe;
        ImageView ivImage;

        public PackageViewHolder(@NonNull View itemView) {
            super(itemView);
            ivImage = itemView.findViewById(R.id.ivIcon);
            tvSms = itemView.findViewById(R.id.tvsms);
            tvMbs = itemView.findViewById(R.id.tvMbs);
            tvOnNetMints = itemView.findViewById(R.id.tvOnnetmints);
            tvOfNetMints = itemView.findViewById(R.id.tvOffnetMints);
            tvValidity = itemView.findViewById(R.id.tvValidity);
            tvPrice = itemView.findViewById(R.id.tvPrice);
            tvPackageName = itemView.findViewById(R.id.tvPackageName);
            btnSubscribe = itemView.findViewById(R.id.btnSubsribe);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (onItemClickListener != null){
                        int position = getAdapterPosition();
                        onItemClickListener.onItemClick(position);
                    }
                    String mbs = tvMbs.getText().toString();

                }
            });
           btnSubscribe.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                    if (btnClickListener != null){
                        btnClickListener.onItemButtonViewClick(btnSubscribe,getAdapterPosition());
                    }


               }
           });
        }

    }

  public   interface OnItemClickListener {
        void onItemClick(int position);
    }

   public interface OnItemButtonClickListener {
        void onItemButtonViewClick(Button btn, int position);
    }
}
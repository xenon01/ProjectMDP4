package surya.com.projectmdp;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class RangkingDota2Adapter extends RecyclerView.Adapter<RangkingDota2Adapter.ViewHolder> {
    private ArrayList<RangkingDota2> RangkingDota2List;

    public RangkingDota2Adapter(ArrayList<RangkingDota2> rangkingDota2List) {
        RangkingDota2List = rangkingDota2List;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View v = inflater.inflate(R.layout.list_rangking,viewGroup,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        if(i%2==0){
            viewHolder.llRangking.setBackgroundColor(Color.parseColor("#62acff"));
            viewHolder.tvNamaTeam.setText(RangkingDota2List.get(i).getTvNamaTeam());
        }
        else{
            viewHolder.llRangking.setBackgroundColor(Color.parseColor("#62ffeb"));
            viewHolder.tvNamaTeam.setText(RangkingDota2List.get(i).getTvNamaTeam());
        }

    }

    @Override
    public int getItemCount() {
        return (RangkingDota2List!=null)?RangkingDota2List.size():0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvNamaTeam;
        private LinearLayout llRangking;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNamaTeam = itemView.findViewById(R.id.tvNamaTeam);
            llRangking = itemView.findViewById(R.id.llRangking);
        }
    }
}

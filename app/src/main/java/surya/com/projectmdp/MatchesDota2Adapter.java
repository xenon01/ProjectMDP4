package surya.com.projectmdp;

import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MatchesDota2Adapter extends RecyclerView.Adapter<MatchesDota2Adapter.ViewHolder>{
    private ArrayList<MatchesDota2> MatchesDota2List;

    public MatchesDota2Adapter(ArrayList<MatchesDota2> matchesDota2List) {
        MatchesDota2List = matchesDota2List;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View v = inflater.inflate(R.layout.list_item, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        //viewHolder.llMatch.setBackgroundColor(Color.parseColor("#62acff"));
        viewHolder.tvTeamA.setText(MatchesDota2List.get(i).getTvTeamA());
        viewHolder.tvTeamB.setText(MatchesDota2List.get(i).getTvTeamB());
        viewHolder.ivTeamA.setImageResource(MatchesDota2List.get(i).getImageViewA());
        viewHolder.ivTeamB.setImageResource(MatchesDota2List.get(i).getImageViewB());
    }

    @Override
    public int getItemCount() {
        return (MatchesDota2List!=null)?MatchesDota2List.size():0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvTeamA,tvTeamB;
        private ImageView ivTeamA, ivTeamB;
        private LinearLayout llMatch;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTeamA = itemView.findViewById(R.id.tvTeamA);
            tvTeamB = itemView.findViewById(R.id.tvTeamB);
            ivTeamA = itemView.findViewById(R.id.ivTeamA);
            ivTeamB = itemView.findViewById(R.id.ivTeamB);
            llMatch = itemView.findViewById(R.id.llMatch);
        }
    }
}

package surya.com.projectmdp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class ResultDota2Adapter extends RecyclerView.Adapter<ResultDota2Adapter.ViewHolder> {
    private ArrayList<ResultDota2> ResultDota2List;

    public ResultDota2Adapter(ArrayList<ResultDota2> resultDota2List) {
        ResultDota2List = resultDota2List;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View v = inflater.inflate(R.layout.list_result,viewGroup,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.tvEvent.setText(ResultDota2List.get(i).getTvEvent());
        viewHolder.tvTeamA.setText(ResultDota2List.get(i).getTvTeamA());
        viewHolder.tvTeamB.setText(ResultDota2List.get(i).getTvTeamB());
        viewHolder.tvWin.setText(ResultDota2List.get(i).getTvWin());
        viewHolder.tvLose.setText(ResultDota2List.get(i).getTvLose());
        viewHolder.tvTeamAPlayer1.setText(ResultDota2List.get(i).getTvTeamAPlayer1());
        viewHolder.tvTeamAPlayer2.setText(ResultDota2List.get(i).getTvTeamAPlayer2());
        viewHolder.tvTeamAPlayer3.setText(ResultDota2List.get(i).getTvTeamAPlayer3());
        viewHolder.tvTeamAPlayer4.setText(ResultDota2List.get(i).getTvTeamAPlayer4());
        viewHolder.tvTeamAPlayer5.setText(ResultDota2List.get(i).getTvTeamAPlayer5());
        viewHolder.tvTeamBPlayer1.setText(ResultDota2List.get(i).getTvTeamBPlayer1());
        viewHolder.tvTeamBPlayer2.setText(ResultDota2List.get(i).getTvTeamBPlayer2());
        viewHolder.tvTeamBPlayer3.setText(ResultDota2List.get(i).getTvTeamBPlayer3());
        viewHolder.tvTeamBPlayer4.setText(ResultDota2List.get(i).getTvTeamBPlayer4());
        viewHolder.tvTeamBPlayer5.setText(ResultDota2List.get(i).getTvTeamBPlayer5());


    }

    @Override
    public int getItemCount() {
        return (ResultDota2List!=null)?ResultDota2List.size():0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvTeamA,tvTeamB,tvEvent,tvWin,tvLose;
        private TextView tvTeamAPlayer1,tvTeamAPlayer2,tvTeamAPlayer3,tvTeamAPlayer4,tvTeamAPlayer5;
        private TextView tvTeamBPlayer1,tvTeamBPlayer2,tvTeamBPlayer3,tvTeamBPlayer4,tvTeamBPlayer5;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTeamA = itemView.findViewById(R.id.tvResultTeamA);
            tvTeamB = itemView.findViewById(R.id.tvResultTeamB);
            tvEvent = itemView.findViewById(R.id.tvResultEvent);
            tvWin = itemView.findViewById(R.id.tvWin);
            tvLose = itemView.findViewById(R.id.tvLose);
            tvTeamAPlayer1 = itemView.findViewById(R.id.tvTeamAPlayer1);
            tvTeamAPlayer2 = itemView.findViewById(R.id.tvTeamAPlayer2);
            tvTeamAPlayer3 = itemView.findViewById(R.id.tvTeamAPlayer3);
            tvTeamAPlayer4 = itemView.findViewById(R.id.tvTeamAPlayer4);
            tvTeamAPlayer5 = itemView.findViewById(R.id.tvTeamAPlayer5);
            tvTeamBPlayer1 = itemView.findViewById(R.id.tvTeamBPlayer1);
            tvTeamBPlayer2 = itemView.findViewById(R.id.tvTeamBPlayer2);
            tvTeamBPlayer3 = itemView.findViewById(R.id.tvTeamBPlayer3);
            tvTeamBPlayer4 = itemView.findViewById(R.id.tvTeamBPlayer4);
            tvTeamBPlayer5 = itemView.findViewById(R.id.tvTeamBPlayer5);
        }
    }
}

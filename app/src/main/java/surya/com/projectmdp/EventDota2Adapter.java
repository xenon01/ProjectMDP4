package surya.com.projectmdp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class EventDota2Adapter extends RecyclerView.Adapter<EventDota2Adapter.ViewHolder> {
    private ArrayList<EventDota2> EventDota2List;

    public EventDota2Adapter(ArrayList<EventDota2> eventDota2List) {
        EventDota2List = eventDota2List;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View v = inflater.inflate(R.layout.list_event_dota2,viewGroup,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.tvEvent.setText(EventDota2List.get(i).getTvEventDota2());
        viewHolder.ivEvent.setImageResource(EventDota2List.get(i).getIvEventDota2());
    }

    @Override
    public int getItemCount() {
        return (EventDota2List!=null)?EventDota2List.size():0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvEvent;
        private ImageView ivEvent;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvEvent = itemView.findViewById(R.id.tvEvent);
            ivEvent = itemView.findViewById(R.id.ivEvent);
        }
    }
}

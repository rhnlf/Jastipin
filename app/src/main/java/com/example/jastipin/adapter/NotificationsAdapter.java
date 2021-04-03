package com.example.jastipin.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.jastipin.Notifications;
import com.example.jastipin.R;

import java.util.ArrayList;

public class NotificationsAdapter extends RecyclerView.Adapter<NotificationsAdapter.NotificationsViewHolder> {

    private ArrayList<Notifications> listNotifications;

    public NotificationsAdapter(ArrayList<Notifications> listNotifications) {
        this.listNotifications = listNotifications;
    }

    @NonNull
    @Override
    public NotificationsAdapter.NotificationsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_notifications, parent, false);
        return new NotificationsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NotificationsAdapter.NotificationsViewHolder holder, int position) {
        holder.tvNama.setText(listNotifications.get(position).getNama());
        holder.tvAktivitas.setText(listNotifications.get(position).getAktivitas());
    }

    @Override
    public int getItemCount() {
        return listNotifications.size();
    }

    public class NotificationsViewHolder extends RecyclerView.ViewHolder{

        private TextView tvNama, tvAktivitas;

        public NotificationsViewHolder(View view){
            super(view);

            tvNama = view.findViewById(R.id.tv_nama);
            tvAktivitas = view.findViewById(R.id.tv_aktivitas);
        }
    }
}

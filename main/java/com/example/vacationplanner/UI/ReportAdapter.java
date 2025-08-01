package com.example.vacationplanner.UI;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.vacationplanner.entities.Vacation;
import com.example.vacationplanner.R;

import java.util.List;

public class ReportAdapter extends RecyclerView.Adapter<ReportAdapter.ReportViewHolder> {

    private Context context;
    private List<Vacation> vacationList;

    public ReportAdapter(Context context, List<Vacation> vacationList) {
        this.context = context;
        this.vacationList = vacationList;
    }

    @Override
    public ReportViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.report_list_item, parent, false);
        return new ReportViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ReportViewHolder holder, int position) {
        Vacation vacation = vacationList.get(position);
        holder.titleView.setText("Title: " + vacation.getTitle());
        holder.hotelView.setText("Hotel: " + vacation.getHotel());
        holder.dateRangeView.setText("Dates: " + vacation.getStartDate() + " to " + vacation.getEndDate());
    }

    @Override
    public int getItemCount() {
        return vacationList.size();
    }

    public static class ReportViewHolder extends RecyclerView.ViewHolder {
        TextView titleView, hotelView, dateRangeView;

        public ReportViewHolder(View itemView) {
            super(itemView);
            titleView = itemView.findViewById(R.id.reportTitleView);
            hotelView = itemView.findViewById(R.id.reportHotelView);
            dateRangeView = itemView.findViewById(R.id.reportDateRangeView);
        }
    }
}

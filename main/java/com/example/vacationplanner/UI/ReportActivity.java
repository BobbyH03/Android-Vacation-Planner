package com.example.vacationplanner.UI;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vacationplanner.database.Repository;
import com.example.vacationplanner.entities.Vacation;
import com.example.vacationplanner.R;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ReportActivity extends AppCompatActivity {

    private EditText searchInput;
    private TextView reportTimestamp;
    private RecyclerView reportRecycler;
    private ReportAdapter adapter;
    private Repository repo;
    private List<Vacation> allVacations = new ArrayList<>();
    private List<Vacation> filteredVacations = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        searchInput = findViewById(R.id.searchField);
        reportTimestamp = findViewById(R.id.reportTimestamp);
        reportRecycler = findViewById(R.id.reportRecyclerView);
        reportRecycler.setLayoutManager(new LinearLayoutManager(this));

        adapter = new ReportAdapter(this, filteredVacations);
        reportRecycler.setAdapter(adapter);

        repo = new Repository(getApplication());
        allVacations = repo.getmAllVacations();

        filteredVacations.addAll(allVacations);
        adapter.notifyDataSetChanged();

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy h:mm a");
        reportTimestamp.setText("Generated: " + now.format(formatter));

        searchInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                filterVacations(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) { }
        });
    }

    private void filterVacations(String query) {
        filteredVacations.clear();
        for (Vacation v : allVacations) {
            if (v.getTitle().toLowerCase().contains(query.toLowerCase()) ||
                    v.getHotel().toLowerCase().contains(query.toLowerCase())) {
                filteredVacations.add(v);
            }
        }
        adapter.notifyDataSetChanged();
    }
}
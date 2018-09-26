package training.ipb.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCategory;
    private ArrayList<Motor>list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCategory = (RecyclerView)findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(MotorData.getListData());

        showRecyclerList();
    }

    private void showRecyclerList(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListMotorAdapter listMotorAdapter = new ListMotorAdapter(this);
        listMotorAdapter.setListPresident(list);
        rvCategory.setAdapter(listMotorAdapter);
        ItemClickSupport.addTo(rvCategory).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                showSelectedMotor(list.get(position));
            }
        });

    }
    private void showSelectedMotor(Motor motor){
        Toast.makeText(this, "Kamu memilih "+motor.getName(), Toast.LENGTH_SHORT).show();
    }
}

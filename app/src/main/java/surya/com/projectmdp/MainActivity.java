package surya.com.projectmdp;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MatchesDota2Fragment.OnFragmentInteractionListener,
    MatchesCSGOFragment.OnFragmentInteractionListener,
    RangkingDota2Fragment.OnFragmentInteractionListener,RangkingCSGOFragment.OnFragmentInteractionListener,
    ResultDota2Fragment.OnFragmentInteractionListener,ResultCSGOFragment.OnFragmentInteractionListener,
    EventDota2Fragment.OnFragmentInteractionListener,EventCSGOFragment.OnFragmentInteractionListener{
    Button btnDota2,btnCSGO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDota2 = findViewById(R.id.button);
        btnCSGO = findViewById(R.id.button2);

        FragmentTransaction ft;
        ft = getSupportFragmentManager().beginTransaction().replace(R.id.mainFrame,new MatchesDota2Fragment());
        ft.commit();
    }

    public void btnPopupMenuDota2(View v){
        PopupMenu popupDota2 = new PopupMenu(MainActivity.this,btnDota2);
        popupDota2.getMenuInflater().inflate(R.menu.popup_menu_dota,popupDota2.getMenu());
        popupDota2.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if(item.getItemId()==R.id.matches){
                    FragmentTransaction ft;
                    ft = getSupportFragmentManager().beginTransaction().replace(R.id.mainFrame,new MatchesDota2Fragment());
                    ft.commit();
                }
                if(item.getItemId()==R.id.rangkings){
                    FragmentTransaction ft;
                    ft = getSupportFragmentManager().beginTransaction().replace(R.id.mainFrame,new RangkingDota2Fragment());
                    ft.commit();
                }
                if(item.getItemId()==R.id.result){
                    FragmentTransaction ft;
                    ft = getSupportFragmentManager().beginTransaction().replace(R.id.mainFrame,new ResultDota2Fragment());
                    ft.commit();
                }
                if(item.getItemId()==R.id.event){
                    FragmentTransaction ft;
                    ft = getSupportFragmentManager().beginTransaction().replace(R.id.mainFrame,new EventDota2Fragment());
                    ft.commit();
                }
                return true;
            }
        });
        popupDota2.show();
    }

    public void btnPopupMenuCSGO(View v){
        PopupMenu popupCSGO = new PopupMenu(MainActivity.this,btnCSGO);
        popupCSGO.getMenuInflater().inflate(R.menu.popup_menu_csgo,popupCSGO.getMenu());
        popupCSGO.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if(item.getItemId()==R.id.matches){
                    FragmentTransaction ft;
                    ft = getSupportFragmentManager().beginTransaction().replace(R.id.mainFrame,new MatchesCSGOFragment());
                    ft.commit();
                }
                if(item.getItemId()==R.id.rangkings){
                    FragmentTransaction ft;
                    ft = getSupportFragmentManager().beginTransaction().replace(R.id.mainFrame,new RangkingCSGOFragment());
                    ft.commit();
                }
                if(item.getItemId()==R.id.result){
                    FragmentTransaction ft;
                    ft = getSupportFragmentManager().beginTransaction().replace(R.id.mainFrame,new ResultCSGOFragment());
                    ft.commit();
                }
                if(item.getItemId()==R.id.event){
                    FragmentTransaction ft;
                    ft = getSupportFragmentManager().beginTransaction().replace(R.id.mainFrame,new EventCSGOFragment());
                    ft.commit();
                }
                return true;
            }
        });
        popupCSGO.show();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}

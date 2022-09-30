package najfi.ali67.packagesapp.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;

import najfi.ali67.packagesapp.R;
import najfi.ali67.packagesapp.databinding.ActivityZongBinding;

public class ZongActivity extends AppCompatActivity {
    ActivityZongBinding  binding;
    public ActionBarDrawerToggle toggle;
    public static final String MY_VALUE = "Zong";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityZongBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        toggle = new ActionBarDrawerToggle(this,binding.drawerLayoutZong,
                R.string.nav_open,R.string.nav_close);

        binding.drawerLayoutZong.addDrawerListener(toggle);
        toggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        binding.zongHybridPackages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ZongActivity.this, PackageDetails.class);
                intent.putExtra("KEY", MY_VALUE);
                intent.putExtra("Number", 1);
                startActivity(intent);
            }
        });

        binding.zongSmsOffer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ZongActivity.this, PackageDetails.class);
                intent.putExtra("KEY", MY_VALUE);
                intent.putExtra("Number", 2);
                startActivity(intent);
            }
        });
        binding.zongInternetOffer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ZongActivity.this, PackageDetails.class);
                intent.putExtra("KEY", MY_VALUE);
                intent.putExtra("Number", 3);
                startActivity(intent);
            }
        });

        binding.zongLoactionbaseOffer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ZongActivity.this, PackageDetails.class);
                intent.putExtra("KEY", MY_VALUE);
                intent.putExtra("Number", 5);
                startActivity(intent);
            }
        });

        binding.zongOtherOffer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ZongActivity.this, PackageDetails.class);
                intent.putExtra("KEY", MY_VALUE);
                intent.putExtra("Number", 4);
                startActivity(intent);
            }
        });


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (toggle.onOptionsItemSelected(item)) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.zong_fvrt_menu,menu);
        return true;
    }



}

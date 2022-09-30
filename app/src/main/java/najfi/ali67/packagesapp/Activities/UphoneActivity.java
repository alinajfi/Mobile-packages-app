package najfi.ali67.packagesapp.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import najfi.ali67.packagesapp.R;
import najfi.ali67.packagesapp.databinding.ActivityUphoneBinding;

public class UphoneActivity extends AppCompatActivity {

    ActivityUphoneBinding binding;
    public ActionBarDrawerToggle toggle;
    public static final String MY_VALUE_UPHONE = "Uphone";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityUphoneBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        toggle = new ActionBarDrawerToggle(UphoneActivity.this,binding.drawerLayoutUphone,
         R.string.nav_open,R.string.nav_close);

        binding.drawerLayoutUphone.addDrawerListener(toggle);
        toggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


       binding.uphoneCallPackages.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(UphoneActivity.this,PackageDetails.class);
               intent.putExtra("KEY", MY_VALUE_UPHONE);
               intent.putExtra("Number",1);
               startActivity(intent);


           }
       });

        binding.uphoneSmsOffer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UphoneActivity.this,PackageDetails.class);
                intent.putExtra("KEY", MY_VALUE_UPHONE);
                intent.putExtra("Number",2);
                startActivity(intent);

            }
        });

  binding.uphoneInternetOffer.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
          Intent intent = new Intent(UphoneActivity.this,PackageDetails.class);
          intent.putExtra("KEY", MY_VALUE_UPHONE);
          intent.putExtra("Number",3);
          startActivity(intent);

      }
  });


  binding.uphoneOtherOffer.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
          Intent intent = new Intent(UphoneActivity.this,PackageDetails.class);
          intent.putExtra("KEY", MY_VALUE_UPHONE);
          intent.putExtra("Number",4);
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

}
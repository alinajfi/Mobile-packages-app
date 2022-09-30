package najfi.ali67.packagesapp.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import najfi.ali67.packagesapp.R;
import najfi.ali67.packagesapp.databinding.ActivityJazzBinding;

public class JazzActivity extends AppCompatActivity {
   ActivityJazzBinding binding;
    public static final String MY_VALUE_JAZZ = "Jazz";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityJazzBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.jazzCallPackages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JazzActivity.this,PackageDetails.class);
                intent.putExtra("KEY", MY_VALUE_JAZZ);
                intent.putExtra("Number",1);
                startActivity(intent);


            }
        });

        binding.jazzSmsOffer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JazzActivity.this,PackageDetails.class);
                intent.putExtra("KEY", MY_VALUE_JAZZ);
                intent.putExtra("Number",2);
                startActivity(intent);

            }
        });

        binding.jazzInternetOffer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JazzActivity.this,PackageDetails.class);
                intent.putExtra("KEY", MY_VALUE_JAZZ);
                intent.putExtra("Number",3);
                startActivity(intent);

            }
        });


        binding.jazzOtherOffer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JazzActivity.this,PackageDetails.class);
                intent.putExtra("KEY", MY_VALUE_JAZZ);
                intent.putExtra("Number",4);
                startActivity(intent);
            }
        });


    }
}
package najfi.ali67.packagesapp.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import najfi.ali67.packagesapp.R;
import najfi.ali67.packagesapp.databinding.ActivityJazzBinding;
import najfi.ali67.packagesapp.databinding.ActivityTelenorBinding;

public class TelenorActivity extends AppCompatActivity {
    ActivityTelenorBinding binding;
    public static final String MY_VALUE_TELENOR = "Telenor";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTelenorBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.telenorCallPackages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelenorActivity.this,PackageDetails.class);
                intent.putExtra("KEY", MY_VALUE_TELENOR);
                intent.putExtra("Number",1);
                startActivity(intent);


            }
        });

        binding.telenorSmsOffer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelenorActivity.this,PackageDetails.class);
                intent.putExtra("KEY", MY_VALUE_TELENOR);
                intent.putExtra("Number",2);
                startActivity(intent);

            }
        });

        binding.telenorInternetOffer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelenorActivity.this,PackageDetails.class);
                intent.putExtra("KEY", MY_VALUE_TELENOR);
                intent.putExtra("Number",3);
                startActivity(intent);

            }
        });


        binding.telenorOtherOffer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelenorActivity.this,PackageDetails.class);
                intent.putExtra("KEY", MY_VALUE_TELENOR);
                intent.putExtra("Number",4);
                startActivity(intent);
            }
        });




    }
}
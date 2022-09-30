package najfi.ali67.packagesapp.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import najfi.ali67.packagesapp.R;
import najfi.ali67.packagesapp.databinding.ActivityMasterBinding;

public class MasterActivity extends AppCompatActivity {
    ActivityMasterBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMasterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String onnet = intent.getStringExtra("onnet");
        String offnet = intent.getStringExtra("offnet");
        String internet = intent.getStringExtra("internet");
        String validity = intent.getStringExtra("validity");
        String price = intent.getStringExtra("price");
        String code = intent.getStringExtra("code");
        binding.tvPackageMasterTitle.setText(title);
        binding.tvOnNet.setText(onnet);
        binding.tvOffNet.setText(offnet);
        binding.tvInternet.setText(internet);
        binding.tvValidity.setText(validity);
        binding.tvPrice.setText(price);
        //binding.tvCode.setText(code);

        binding.btnActivatePackage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + code));
                startActivity(intent);
            }
        });


    }
}
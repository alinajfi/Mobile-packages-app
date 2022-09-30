package najfi.ali67.packagesapp.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import najfi.ali67.packagesapp.Adapters.PackageAdpater;
import najfi.ali67.packagesapp.Models.Package;
import najfi.ali67.packagesapp.R;
import najfi.ali67.packagesapp.data.DataProvider;

public class PackageDetails extends AppCompatActivity {
    RecyclerView recyclerView;
    PackageAdpater packageAdpater;
    DataProvider dataProvider;
    List<Package> myList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        dataProvider = new DataProvider();
        myList = new ArrayList<>();


        if (getIntent().getStringExtra("KEY").equals(ZongActivity.MY_VALUE)) {
            int number = getIntent().getIntExtra("Number", -1);
            switch (number) {
                case 1:
                    myList = dataProvider.getCallZongPackages();
                    setTitle("Zong Call/Hybrid Offers");
                    break;
                case 2:
                    myList = dataProvider.getSMSZongPackages();
                    setTitle("Zong Sms Offers");
                    break;
                case 3:
                    myList = dataProvider.getInternetZongPackages();
                    setTitle("Zong Internet Offers");
                    break;

                case 4:
                    myList = dataProvider.getLocationBasedZongPackages();
                    setTitle("Zong Location Offers");
                    break;
                case 5:
                    myList = dataProvider.getOtherZongPackages();
                    setTitle("Zong Other Offers");
                    break;
            }
        } else if (getIntent().getStringExtra("KEY").equals(UphoneActivity.MY_VALUE_UPHONE)) {
            int number = getIntent().getIntExtra("Number", -1);
            switch (number) {
                case 1:
                    myList = dataProvider.getCallUFONEPackages();
                    setTitle("Uphone Call Offers");
                    break;
                case 2:
                    myList = dataProvider.getSMSUFONEPackages();
                    setTitle("Uphone Sms offers");
                    break;
                case 3:
                    myList = dataProvider.getInternetUFONEPackages();
                    setTitle("Uphone Internet offers");
                    break;

                case 4:
                    myList = dataProvider.getOtherUFONEPackages();
                    setTitle("Uphone Other  offers");
                    break;

            }

        } else if (getIntent().getStringExtra("KEY").equals(TelenorActivity.MY_VALUE_TELENOR)) {
            int number = getIntent().getIntExtra("Number", -1);
            switch (number) {
                case 1:
                    myList = dataProvider.getCallTelenorPackages();
                    setTitle("Telenor Call Offers");
                    break;
                case 2:
                    myList = dataProvider.getSMSTelenorPackages();
                    setTitle("Telenor Sms offers");
                    break;
                case 3:
                    myList = dataProvider.getInternetTelenorPackages();
                    setTitle("Telenor Internet offers");
                    break;

                case 4:
                    myList = dataProvider.getOtherTelenorPackages();
                    setTitle("Telenor Other  offers");
                    break;

            }

        } else if (getIntent().getStringExtra("KEY").equals(JazzActivity.MY_VALUE_JAZZ)) {
            int number = getIntent().getIntExtra("Number", -1);
            switch (number) {
                case 1:
                    myList = dataProvider.getCallJazzPackages();
                    setTitle("Jazz Call Offers");
                    break;
                case 2:
                    myList = dataProvider.getSMSJazzPackages();
                    setTitle("Jazz Sms offers");
                    break;
                case 3:
                    myList = dataProvider.getInternetJazzPackages();
                    setTitle("Jazz Internet offers");
                    break;

                case 4:
                    myList = dataProvider.getOtherJazzPackages();
                    setTitle("Jazz Other  offers");
                    break;

            }

        } else {
            Toast.makeText(this, "Something went wrong", Toast.LENGTH_LONG).show();
        }


        packageAdpater = new PackageAdpater(myList, this);
        packageAdpater.setOnItemButtonClickListener(new PackageAdpater.OnItemButtonClickListener() {
            @Override
            public void onItemButtonViewClick(Button btn, int position) {
                AlertDialog.Builder builder = new AlertDialog.Builder(PackageDetails.this);
                builder.setTitle("Confirmation...!");
                builder.setMessage("Would You Like To Subscribe This Package");
                builder.setCancelable(true);

                builder.setPositiveButton(
                        "Yes",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent intent = new Intent();
                                intent.setAction(Intent.ACTION_DIAL);
                                intent.setData(Uri.parse("tel:" + myList.get(position).getCode()));
                                startActivity(intent);


                            }
                        });

                builder.setNegativeButton(
                        "No",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });

                AlertDialog alert = builder.create();
                alert.show();


            }
        });

        packageAdpater.setOnItemClickListener(new PackageAdpater.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Intent intent = new Intent(PackageDetails.this, MasterActivity.class);
                intent.putExtra("title", myList.get(position).getTitle());
                intent.putExtra("onnet", myList.get(position).getOnNet());
                intent.putExtra("offnet", myList.get(position).getOffNet());
                intent.putExtra("internet", myList.get(position).getInternet());
                intent.putExtra("validity", myList.get(position).getValidity());
                intent.putExtra("price", myList.get(position).getPrice());
                intent.putExtra("code", myList.get(position).getCode());

                startActivity(intent);

            }
        });


        recyclerView = findViewById(R.id.rcZong);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(packageAdpater);
        recyclerView.setHasFixedSize(true);


    }


}
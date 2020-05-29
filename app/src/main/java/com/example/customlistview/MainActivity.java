package com.example.customlistview;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String buildName[] = {"$400 Build", "$700-800 Build", "$1000+ Build", "My Build", "Linus Tech Tips Sized Budget"};
    String buildDescription[] = {"CPU: Ryzen 3 3100 \nGPU: AMD RX 570 4GB \nRAM: 2x4GB DDR4 (8GB) \nMotherboard: B450 Chipset Motherboard \nStorage: WD Blue 1TB 7200 RPM \nPSU: EVGA 400W \nCase: A Cardboard Box",
            "CPU: Ryzen 5 3600 \nGPU: AMD RX 5700XT or nVIDIA RTX 2060 \nRAM: 2x8GB DDR4 (16GB) \nMotherboard: X570 Chipset Motherboard \nStorage: Kingston 120GB SSD + WD Blue 1TB 7200RPM \nPSU: EVGA 600W 80+ Bronze \nCase: Fractcal Design",
            "CPU: RYzen 7 3700X \n GPU: nVIDIA RTX 2070 SUPER \nRAM: 4x8GB DDR4 (32GB) \nMotherboard: ASUS Prime X570 \nStorage: Samsung 860 EVO 250GB nVME SSD + Seagate Barracuda 2TB 7200 RPM \nPSU: EVGA SUPERNOVA G2 850W 80+ Gold \nCase: Cooler Master H500",
            "CPU: Ryzen 9 3900X \nGPU: EVGA GTX 1080 Classified \nRAM: 2x16GB DDR4 (32GB) \nMotherboard: ASUS Crosshair VIII Hero X570 \nStorage: ADATA XPG SX8200 PRO 1TB + 2x Seagate Barracuda 2TB 7200RPM \nPSU: EVGA SUPERNOVA G3 750W 80+ Gold \nCase: Cooler Master H500P Mesh",
            "CPU: 2x Intel Xeon Platinum OEM QS 8180 Processor \n8x nVIDIA Titan V 12GB HBM2 \nRAM: Kingston 384GB ECC DDR4 \nSupermicro MBD-X11DAI-N-O Dual Socket LGA 3647 Motherboard \nStorage: 2x Intel Optane 905P 1.5TB + 8x WD Red NAS 10TB 5400RPM \nCase: Caselabs Custom Ordered Case"};
    int images[] = {R.drawable.b400build, R.drawable.b7800build, R.drawable.b1000build, R.drawable.bmybuild, R.drawable.blinusbudget};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        MyAdapter adapter = new MyAdapter(this, buildName, buildDescription, images);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    Intent intent = new Intent(getApplicationContext(), DescriptionActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[0]);
                    intent.putExtras(bundle);
                    intent.putExtra("title", buildName[0]);
                    intent.putExtra("description", buildDescription[0]);
                    intent.putExtra("position", ""+0);
                    startActivity(intent);


                }
                if (position == 1) {
                    Intent intent = new Intent(getApplicationContext(), DescriptionActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[1]);
                    intent.putExtras(bundle);
                    intent.putExtra("title", buildName[1]);
                    intent.putExtra("description", buildDescription[1]);
                    intent.putExtra("position", ""+1);
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(getApplicationContext(), DescriptionActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[2]);
                    intent.putExtras(bundle);
                    intent.putExtra("title", buildName[2]);
                    intent.putExtra("description", buildDescription[2]);
                    intent.putExtra("position", ""+2);
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(getApplicationContext(), DescriptionActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[3]);
                    intent.putExtras(bundle);
                    intent.putExtra("title", buildName[3]);
                    intent.putExtra("description", buildDescription[3]);
                    intent.putExtra("position", ""+3);
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(getApplicationContext(), DescriptionActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[4]);
                    intent.putExtras(bundle);
                    intent.putExtra("title", buildName[4]);
                    intent.putExtra("description", buildDescription[4]);
                    intent.putExtra("position", ""+4);
                    startActivity(intent);
                }
            }
        });
    }

    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String rTitle[];
        String rDescription[];
        int rImages[];

        MyAdapter (Context context, String title[], String description[], int images[]) {
            super(context, R.layout.row, R.id.textView1, title);
            this.context = context;
            this.rTitle = title;
            this.rDescription = description;
            this.rImages = images;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View row = layoutInflater.inflate(R.layout.row, parent, false);

            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textView1);
            TextView myDescription = row.findViewById(R.id.textView2);

            images.setImageResource(rImages[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);

            return row;
        }
    }
}

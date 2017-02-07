package net.atlassc.shinchven.sharedelementtransitionsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class EndActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);


        Glide
                .with(this)
                .load("https://pic3.zhimg.com/v2-216c478388195211c1ebc808b7a6bcce.jpg").diskCacheStrategy(DiskCacheStrategy.SOURCE)
                .centerCrop()
                .crossFade()
                .into((ImageView) findViewById(R.id.image));


        View image = findViewById(R.id.image);
        image.setTransitionName(getString(R.string.shared_element));



    }
    public void onClick(View view){
        onBackPressed();
    }
}

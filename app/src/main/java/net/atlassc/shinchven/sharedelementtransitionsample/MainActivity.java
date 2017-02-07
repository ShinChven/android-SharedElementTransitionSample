package net.atlassc.shinchven.sharedelementtransitionsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Glide
                .with(this)
                .load("https://pic3.zhimg.com/v2-216c478388195211c1ebc808b7a6bcce.jpg").diskCacheStrategy(DiskCacheStrategy.SOURCE)
                .centerCrop()
                .crossFade()
                .into((ImageView) findViewById(R.id.image));

    }

    public void onClick(View view) {

        View image = findViewById(R.id.image);

        Intent intent = new Intent(this, EndActivity.class);

        image.setTransitionName(getString(R.string.shared_element));
        Pair<View, String> pair = Pair.create(image, image.getTransitionName());

        ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, pair);
        startActivity(intent, options.toBundle());

    }
}

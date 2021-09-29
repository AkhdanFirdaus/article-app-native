package com.bsoandroid.articleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView articleContentText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        articleContentText = findViewById(R.id.article_content);

        String dummyText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ultrices dui sapien eget mi proin sed libero enim sed. Et malesuada fames ac turpis egestas integer. Purus in massa tempor nec feugiat nisl pretium. Ultrices neque ornare aenean euismod. Suspendisse potenti nullam ac tortor vitae. Pellentesque pulvinar pellentesque habitant morbi tristique senectus et. Quis viverra nibh cras pulvinar mattis nunc sed blandit. Velit dignissim sodales ut eu sem integer vitae justo eget. Sollicitudin aliquam ultrices sagittis orci a scelerisque. Etiam dignissim diam quis enim. Ultrices neque ornare aenean euismod elementum nisi quis eleifend. Amet luctus venenatis lectus magna fringilla urna. Elementum curabitur vitae nunc sed velit. Quisque sagittis purus sit amet volutpat consequat.\n" +
                "\n" +
                "Elit eget gravida cum sociis natoque penatibus et magnis dis. Eget arcu dictum varius duis at consectetur. Eget magna fermentum iaculis eu. Lectus arcu bibendum at varius vel pharetra. Justo nec ultrices dui sapien eget mi proin. Quisque egestas diam in arcu cursus euismod quis. Mi proin sed libero enim sed faucibus turpis in eu. Nascetur ridiculus mus mauris vitae. Tincidunt vitae semper quis lectus nulla at. Et molestie ac feugiat sed lectus vestibulum mattis. Tincidunt eget nullam non nisi est. Convallis aenean et tortor at risus. Amet nulla facilisi morbi tempus iaculis urna. Odio eu feugiat pretium nibh ipsum consequat nisl.\n" +
                "\n" +
                "Suscipit tellus mauris a diam. Nec ullamcorper sit amet risus nullam eget felis. Dignissim diam quis enim lobortis scelerisque fermentum. Sed augue lacus viverra vitae congue. Arcu dictum varius duis at consectetur. Dui nunc mattis enim ut tellus. Arcu non odio euismod lacinia at quis risus sed vulputate. Fames ac turpis egestas maecenas pharetra. Nam at lectus urna duis convallis convallis. Enim facilisis gravida neque convallis a cras semper auctor. Lectus vestibulum mattis ullamcorper velit sed ullamcorper morbi. Amet risus nullam eget felis eget. Etiam dignissim diam quis enim lobortis scelerisque fermentum dui faucibus. Mattis enim ut tellus elementum sagittis vitae et. Quis lectus nulla at volutpat diam ut venenatis tellus in. Fames ac turpis egestas maecenas pharetra convallis posuere morbi leo.";
        articleContentText.setText(dummyText);
    }
}
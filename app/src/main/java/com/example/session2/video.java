package com.example.session2;


        import android.net.Uri;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.VideoView;

        import androidx.appcompat.app.AppCompatActivity;

public class video extends AppCompatActivity {

    VideoView videoPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        videoPlayer = findViewById(R.id.videoPlayer);
        Uri myVideoUri= Uri.parse( "android.resource://" + getPackageName() + "/" + R.raw.videva);
        videoPlayer.setVideoURI(myVideoUri);

    }

    public void play(View view){
        videoPlayer.start();
    }

    public void pause(View view){
        videoPlayer.pause();
    }

    public void stop(View view){
        videoPlayer.stopPlayback();
        videoPlayer.resume();
    }
}
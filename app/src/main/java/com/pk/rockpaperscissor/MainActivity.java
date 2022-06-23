package com.pk.rockpaperscissor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView computerIv, playerIv;
    private LinearLayout rockll, paperll, scissorll;
    private TextView computerScoreTv, playerScoreTv,playerwonTv;
    private int computermove, playerscore, computerscore;
    private Button restartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        computerIv=(ImageView) findViewById(R.id.idIvComputer);
        playerIv=(ImageView) findViewById(R.id.idIvPlayer);
        rockll=(LinearLayout) findViewById(R.id.idllRock);
        paperll=(LinearLayout) findViewById(R.id.idllPaper);
        scissorll=(LinearLayout) findViewById(R.id.idllScissor);
        computerScoreTv=(TextView) findViewById(R.id.idTvComputerScore);
        playerScoreTv=(TextView) findViewById(R.id.idTvPlayerScore);
        playerwonTv=(TextView) findViewById(R.id.idTVPlayerwon);
        restartButton =(Button) findViewById(R.id.idTvRestartbtn);
        playerscore=0;
        computerscore=0;

        rockll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playerIv.setImageDrawable(getResources().getDrawable(R.drawable.rock));
                Random random=new Random();
                computermove=random.nextInt(4-1)+1;

                if (computermove==1)
                {
                    //rock
                    computerIv.setImageDrawable(getResources().getDrawable(R.drawable.rock));
                    playerwonTv.setText("Draw");
                }else if (computermove==2)
                {
                    //paper
                    computerIv.setImageDrawable(getResources().getDrawable(R.drawable.paper1));
                    playerwonTv.setText("Computer Won");
                    computerscore+=1;
                    computerScoreTv.setText(""+ computerscore);
                }else {
                    //scissor
                    computerIv.setImageDrawable(getResources().getDrawable(R.drawable.scissor));
                    playerwonTv.setText("Player Won");
                    playerscore+=1;
                    playerScoreTv.setText(""+ playerscore);
                }

            }
        });

        paperll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                playerIv.setImageDrawable(getResources().getDrawable(R.drawable.paper1));
                Random random=new Random();
                computermove=random.nextInt(4-1)+1;

                if (computermove==1)
                {
                    //rock
                    computerIv.setImageDrawable(getResources().getDrawable(R.drawable.rock));
                    playerwonTv.setText("Player Won");
                    playerscore+=1;
                    playerScoreTv.setText(""+ playerscore);


                }else if (computermove==2)
                {
                    //paper
                    computerIv.setImageDrawable(getResources().getDrawable(R.drawable.paper1));
                    playerwonTv.setText("Draw");


                }else {
                    //scissor
                    computerIv.setImageDrawable(getResources().getDrawable(R.drawable.scissor));
                    playerwonTv.setText("Computer Won");
                    computerscore+=1;
                    computerScoreTv.setText(""+ computerscore);

                }

            }
        });

        scissorll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                playerIv.setImageDrawable(getResources().getDrawable(R.drawable.scissor));
                Random random=new Random();
                computermove=random.nextInt(4-1)+1;

                if (computermove==1)
                {
                    //rock
                    computerIv.setImageDrawable(getResources().getDrawable(R.drawable.rock));
                    playerwonTv.setText("Computer Won");
                    computerscore+=1;
                    computerScoreTv.setText(""+ computerscore);


                }else if (computermove==2)
                {
                    //paper
                    computerIv.setImageDrawable(getResources().getDrawable(R.drawable.paper1));
                    playerwonTv.setText("Player Won");
                    playerscore+=1;
                    playerScoreTv.setText(""+ playerscore);




                }else {
                    //scissor
                    computerIv.setImageDrawable(getResources().getDrawable(R.drawable.scissor));
                    playerwonTv.setText("Draw");

                }

            }
        });

        restartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computerScoreTv.setText("0");
                playerScoreTv.setText("0");
                playerwonTv.setText("");
                playerscore=0;
                computerscore=0;
                playerIv.setImageDrawable(getResources().getDrawable(R.drawable.question));
                computerIv.setImageDrawable(getResources().getDrawable(R.drawable.question));
            }
        });


    }
}
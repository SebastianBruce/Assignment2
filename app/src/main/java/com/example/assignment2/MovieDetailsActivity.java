package com.example.assignment2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class MovieDetailsActivity extends AppCompatActivity {

    private ImageView moviePosterImageView;
    private TextView movieTitleTextView, movieYearTextView, movieRatedTextView, movieMetascoreTextView,
            movieReleasedTextView, movieRuntimeTextView, movieGenreTextView, movieDirectorTextView,
            movieWriterTextView, movieActorsTextView, moviePlotTextView;
    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);

        //Bind views to variables
        moviePosterImageView = findViewById(R.id.moviePosterImageView);
        movieTitleTextView = findViewById(R.id.movieTitleTextView);
        movieYearTextView = findViewById(R.id.movieYearTextView);
        movieRatedTextView = findViewById(R.id.movieRatedTextView);
        movieMetascoreTextView = findViewById(R.id.movieMetascoreTextView);
        movieReleasedTextView = findViewById(R.id.movieReleasedTextView);
        movieRuntimeTextView = findViewById(R.id.movieRuntimeTextView);
        movieGenreTextView = findViewById(R.id.movieGenreTextView);
        movieDirectorTextView = findViewById(R.id.movieDirectorTextView);
        movieWriterTextView = findViewById(R.id.movieWriterTextView);
        movieActorsTextView = findViewById(R.id.movieActorsTextView);
        moviePlotTextView = findViewById(R.id.moviePlotTextView);
        backButton = findViewById(R.id.backButton);

        //Get the Movie object from the Intent
        Intent intent = getIntent();
        Movie movie = (Movie) intent.getSerializableExtra("movie");

        if (movie != null) {
            //Set data to the views
            movieTitleTextView.setText(movie.getTitle());
            movieYearTextView.setText("Year: " + movie.getYear());
            movieRatedTextView.setText("Rated: " + movie.getRated());
            movieMetascoreTextView.setText("Metascore: " + movie.getMetascore());
            movieReleasedTextView.setText("Released: " + movie.getReleased());
            movieRuntimeTextView.setText("Runtime: " + movie.getRuntime());
            movieGenreTextView.setText("Genre: " + movie.getGenre());
            movieDirectorTextView.setText("Director: " + movie.getDirector());
            movieWriterTextView.setText("Writer: " + movie.getWriter());
            movieActorsTextView.setText("Actors: " + movie.getActors());
            moviePlotTextView.setText("Plot: " + movie.getPlot());

            //Load the movie poster
            Glide.with(this).load(movie.getPoster()).into(moviePosterImageView);
        }

        //Back button to finish the activity and go back
        backButton.setOnClickListener(v -> finish());
    }
}

package com.mausukses.movieinfoservice.resources;

import com.mausukses.movieinfoservice.models.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieResource {

  @RequestMapping("/{movieId}")
  public Movie getMovie(@PathVariable(name = "movieId")String movieId){
    return new Movie(movieId,"Test name");
  }
}

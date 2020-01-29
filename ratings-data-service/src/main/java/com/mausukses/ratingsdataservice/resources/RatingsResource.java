package com.mausukses.ratingsdataservice.resources;

import com.mausukses.ratingsdataservice.models.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {

  @RequestMapping("/{movieId}")
  public Rating getRating(@PathVariable(name = "movieId")String movieId){
    return new Rating(movieId,4);
  }
}

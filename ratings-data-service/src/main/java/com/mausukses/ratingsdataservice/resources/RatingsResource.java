package com.mausukses.ratingsdataservice.resources;

import com.mausukses.ratingsdataservice.models.Rating;
import com.mausukses.ratingsdataservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {

  @RequestMapping("users/{userId}")
  public UserRating getUserRating(@PathVariable("userId") String userId){
    List<Rating> ratings = Arrays.asList(
        new Rating("1234",4),
        new Rating("5678",3)
    );
    UserRating userRating = new UserRating();
    userRating.setUserRatings(ratings);
    return userRating;
  }

  @RequestMapping("/{movieId}")
  public Rating getRating(@PathVariable(name = "movieId")String movieId){
    return new Rating(movieId,4);
  }
}

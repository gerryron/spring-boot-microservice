package com.mausukses.moviecatalogservice.resources;

import com.mausukses.moviecatalogservice.models.CatalogItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

  @RequestMapping("/{userId}")
  public List<CatalogItem> getCatalog (@PathVariable(name = "userId") String userId){
    return Collections.singletonList(
        new CatalogItem("Transformer","Desc",4)
    );
  }
}

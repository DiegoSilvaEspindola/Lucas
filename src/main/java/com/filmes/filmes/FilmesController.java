package com.filmes.filmes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class FilmesController {
public String m ="Hello";

/*@GetMapping
    public void getHello(){
    System.out.println(m);
}*/
  @GetMapping
  public String getHello(){
      return m;
  }



}

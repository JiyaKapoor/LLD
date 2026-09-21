package com.example.demo.BookMyShow.Service;
import java.util.*;
import com.example.demo.BookMyShow.Entity.Theatre;
import org.springframework.stereotype.Service;

@Service
public class TheatreService {
    //serves as a singleton bean to orchestrate all the available theatres
    private final List<Theatre> avalTheatres=new ArrayList<>();
    public void addTheatre(Theatre theatre){
        avalTheatres.add(theatre);
    }
}

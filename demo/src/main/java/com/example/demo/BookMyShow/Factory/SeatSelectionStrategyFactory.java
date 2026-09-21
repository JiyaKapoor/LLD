package com.example.demo.BookMyShow.Factory;

import com.example.demo.BookMyShow.Entity.AutomaticSelection;
import com.example.demo.BookMyShow.Entity.ManualSelection;
import com.example.demo.BookMyShow.Entity.SeatSelectionStrategy;

public class SeatSelectionStrategyFactory {
    public SeatSelectionStrategy createSelectionStrategy(String selectionStrategy){
        if(selectionStrategy.equals("MANUAL")){
            return new ManualSelection();
        }
        else{
            return new AutomaticSelection();
        }
    }
}

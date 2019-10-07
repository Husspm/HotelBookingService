package com.company.hotelbookingservice.controller;

import com.company.hotelbookingservice.service.ServiceLayer;
import com.company.hotelbookingservice.viewModel.BookingViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookingServiceController {

    @Autowired
    ServiceLayer serviceLayer;

    /**
     * Route to return the booking info view model for a given room, calculations are based on rewards member
     * status and if that particular day is a double point day
     * request params are not required and will default to false
     * ex http get request - http://localhost:8236/hotelRewards/123?rewardsMember=true&doubleBonusDay=true
     *                                             path variable ^ rp:name ^ value ^    rp:name ^ value ^
     */

    @GetMapping("/hotelRewards/{roomId}")
    @ResponseStatus(HttpStatus.OK)
    public BookingViewModel getBookingInfo(
             @PathVariable Integer roomId,
             @RequestParam(name = "rewardsMember", defaultValue = "false") boolean rewardsMember,
             @RequestParam(name = "doubleBonusDay", defaultValue = "false") boolean doubleBonusDay
    )

    {
        //print to the console to see what was gathered from the path
        System.out.println("roomId = " + roomId);
        System.out.println("rewardsMember = " + rewardsMember);
        System.out.println("doubleBonusDay = " + doubleBonusDay);
        //service layer code will go here
        return null;
    }

}

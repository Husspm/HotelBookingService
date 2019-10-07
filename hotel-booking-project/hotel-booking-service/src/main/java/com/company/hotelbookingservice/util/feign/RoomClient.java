package com.company.hotelbookingservice.util.feign;


import com.company.hotelbookingservice.model.Room;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient( name = "room-service")
public interface RoomClient {
    @GetMapping(value = "/room/{number}")
    Room getRoom();

    @GetMapping(value = "/room")
    List<Room> getAllRooms();
}

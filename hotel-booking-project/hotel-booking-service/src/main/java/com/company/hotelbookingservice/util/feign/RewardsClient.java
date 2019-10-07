package com.company.hotelbookingservice.util.feign;


import com.company.hotelbookingservice.model.Rewards;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "rewards-service")
public interface RewardsClient {
    @GetMapping(value = "/rewards/type/{roomType}")
    Rewards getRewards(String roomType);

    @GetMapping(value = "/rewards")
    List<Rewards> getAllRewards(); 
}

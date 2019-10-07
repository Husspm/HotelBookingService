package com.company.hotelbookingservice.controller;

import com.company.hotelbookingservice.service.ServiceLayer;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
@RunWith(SpringRunner.class)
public class BookingServiceControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    ServiceLayer serviceLayer;

    @Test
    public void testGetBookingInfo() throws Exception {

        mockMvc.perform(get("/hotelRewards/4"))
                .andDo(print()).andExpect(status().isOk());
    }

}
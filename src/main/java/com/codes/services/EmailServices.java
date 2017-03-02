package com.codes.services;

import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by amold on 06/01/17.
 */
@Service
public class EmailServices {

    public void sendMain(){
        System.out.println("Mail Sent at: "+ new Date());
    }
}

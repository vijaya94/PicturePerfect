/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.BookingDetails;
import java.sql.ResultSet;

/**
 *
 * @author nihar
 */
public class BookingController {
    public ResultSet readBookingDetails(BookingDetails bd){
        return bd.readBookingDetails(bd);
    }    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.BookingEventDetails;
import java.sql.ResultSet;
import model.VVendorBookingDetails;

/**
 *
 * @author nihar
 */
public class BookingEventController {
//    public ResultSet readBookingDetails(BookingEventDetails bed){
//        return bed.readBookingDetails(bed);
//    }  
    
    public int insertBookingDetails(BookingEventDetails bed){
         return bed.insertBookingEventDetails(bed);
    }
    
    public int getVendorId(VVendorBookingDetails vendorbookingDetails){
       return vendorbookingDetails.getVendorId();
    }
    
//    public int updateBookingDetails(BookingEventDetails bed){
//         return bed.updateBookingDetails(bed);
//    }
}

package com.zmex.multithreading.lessons.lesson3_Synchronization;

import com.zmex.multithreading.lessons.resource.HotelReceptionist;
import com.zmex.multithreading.lessons.resource.VisitorJournal;

/**
 * Synchronized methods based on locks
 */

public class SynchronizationExample {

    public static void main(String[] args) throws InterruptedException {

        VisitorJournal visitorJournal = new VisitorJournal();

        HotelReceptionist hotelReceptionist1 = new HotelReceptionist();
        HotelReceptionist hotelReceptionist2 = new HotelReceptionist();
        HotelReceptionist hotelReceptionist3 = new HotelReceptionist();

        hotelReceptionist1.setVisitorJournal(visitorJournal);
        hotelReceptionist2.setVisitorJournal(visitorJournal);
        hotelReceptionist3.setVisitorJournal(visitorJournal);

        hotelReceptionist1.start();
        hotelReceptionist2.start();
        hotelReceptionist3.start();

        hotelReceptionist1.join();
        hotelReceptionist2.join();
        hotelReceptionist3.join();

        System.out.println("Total visitor counter " + visitorJournal.getVisitorCounter());
    }
}

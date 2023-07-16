package org.upgrad.coursework.crashcourse;

/**
 *  General interview question for Low level Design (LLD)
 */
public class ParkingLot {

    int[] slots;
    int occupiedSlots;
    int parkingCharges;

    ParkingLot(int[] slots, int occupiedSlots){
        this.occupiedSlots = occupiedSlots;
        this.slots = slots;
    }

    void whenCarArrives() {
        if(occupiedSlots != slots.length){
            slots[occupiedSlots] = 0;
            occupiedSlots++;
        }
    }

    void whenCarLeaves() {
        if(occupiedSlots > 0){
            slots[occupiedSlots] = 0;
            occupiedSlots--;
        }
    }
}

/**
 *   Questions that the interviewer is trying to guage:
 *  1. Is the dev able to identify classes, it's attributes, objects, and functions
 * 2. Is the dev able to identify interaction between objects
 * 3. Is the design loosely coupled? (able to change without radical rework)
 *
 * Missed a bunch. Rework this solution into something that satisfies the above
 */

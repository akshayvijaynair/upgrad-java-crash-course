package org.upgrad.coursework.crashcourse;

/**
 *  @Note General interview question for Low level Design (LLD)
 *
 *  @ExpectedOutcomes Questions that the interviewer is trying to gauge:
 *   1. Is the dev able to identify classes, it's attributes, objects, and functions
 *   2. Is the dev able to identify interaction between objects
 *   3. Is the design loosely coupled? (able to change without radical rework)
 *
 * TODO -> Missed a bunch. Rework this solution into something that satisfies the above
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

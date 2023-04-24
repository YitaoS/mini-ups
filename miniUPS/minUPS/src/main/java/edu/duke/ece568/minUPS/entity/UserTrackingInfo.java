package edu.duke.ece568.minUPS.entity;

import javax.persistence.*;

@Entity
@Table
public class UserTrackingInfo {
    @Id
    @SequenceGenerator(
            name = "user_tracking_info_sequence",
            sequenceName = "user_tracking_info_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_tracking_info_sequence"
    )
    private Integer userID;
    private Long shipInfoID;

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Long getShipInfoID() {
        return shipInfoID;
    }

    public void setShipInfoID(Long shipInfoID) {
        this.shipInfoID = shipInfoID;
    }
}

package edu.duke.ece568.minUPS.entity;

import javax.persistence.*;

@Entity
@Table
public class Package {
    @Id
    private Long packageID;

    @Column(nullable = false)
    @ManyToOne
    @JoinColumn(name = "truckID", referencedColumnName = "truckID")
    private Truck truck;
    @Column(nullable = false)
    private Integer userID;
    @Column(nullable = false)
    private String details;
    @Column(nullable = false)
    private Integer destinationX;
    @Column(nullable = false)
    private Integer destinationY;

    public enum Status {
        IDLE("create"),
        ROUTING("truck in route package"),
        WAITING("truck waiting for package"),
        DELIVERING("delivering"),
        DELIVERED("delivered");

        private String text;

        Status(String str) {
            this.text = str;
        }

        public String getText() {
            return text;
        }

        public static Package.Status fromString(String text) {
            for (Package.Status s : Package.Status.values()) {
                if (s.text.equalsIgnoreCase(text)) {
                    return s;
                }
            }
            throw new IllegalArgumentException("No such enum " + text);
        }
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Integer getDestinationX() {
        return destinationX;
    }

    public void setDestinationX(Integer destinationX) {
        this.destinationX = destinationX;
    }

    public Integer getDestinationY() {
        return destinationY;
    }

    public void setDestinationY(Integer destinationY) {
        this.destinationY = destinationY;
    }

    public Long getPackageID() {
        return packageID;
    }

    public void setPackageID(Long pid) {
        this.packageID = pid;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String description) {
        this.details = description;
    }

}


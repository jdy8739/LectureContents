package com.example.demo.entity.artistAuth;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name="concert_request")
public class ConcertRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "concert_request_no")
    private Long concertRequestNo;

    @Column(name = "member_no")
    private Long memberNo;

    @Column(length = 20, nullable = false)
    private String regName;

    @Column(length = 30, nullable = false)
    private String artistName;

    @Column(length = 30, nullable = false)
    private String venueName;

    @Column(length = 30, nullable = false)
    private String concertName;

    @Column(length = 25, nullable = false)
    private Date dateOfConcert;

    @Column(length = 30, nullable = false)
    private String timeOfConcert;

    @Column(length = 3, nullable = true)
    private String approvedOrNot;

    @CreationTimestamp
    private Date regDate;

    @UpdateTimestamp
    private Date updDate;

    public ConcertRequest(Long memberNo, String regName, String artistName, String venueName, String concertName, Date dateOfConcert, String timeOfConcert) {
        this.memberNo = memberNo;
        this.regName = regName;
        this.artistName = artistName;
        this.venueName = venueName;
        this.concertName = concertName;
        this.dateOfConcert = dateOfConcert;
        this.timeOfConcert = timeOfConcert;
    }
}

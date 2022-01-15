package com.homework3.repository.watchlist;


import com.homework3.repository.member.MemberEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "watchlist")
public class WatchListEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    private MemberEntity member;

}

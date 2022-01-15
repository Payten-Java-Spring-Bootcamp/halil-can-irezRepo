package com.homework3.repository.member;


import com.homework3.repository.watchlist.WatchListEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@Entity
@Table(name = "member")
public class MemberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false)
    Long name;

    @OneToMany(mappedBy = "member")
    private List<WatchListEntity> watchLists ;
}

package com.homework3.repository.member;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class MemberDaoImp implements MemberDao {
    private final MemberRepository memberRepository;

    @Override
    public MemberEntity retrieve(Long memberId){

        Optional<MemberEntity> optionalMemberEntity =  memberRepository.findById(memberId);

        if (optionalMemberEntity.isPresent())
            return optionalMemberEntity.get();
        else
            throw new RuntimeException();

}


}

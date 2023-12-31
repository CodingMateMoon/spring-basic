package com.example.springbasic.service;

import com.example.springbasic.domain.Member;
import com.example.springbasic.repository.MemberRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }


    public Long join(Member member) {

        long start = System.currentTimeMillis();

        //try {
            // 같은 이름이 있는 중복 회원 X
            validateDuplicateMember(member);
            memberRepository.save(member);
            return member.getId();
        //} finally {
            //long finish = System.currentTimeMillis();
            //long timeMs = finish - start;
            //System.out.println("join = " + timeMs + "ms");
        //}
    }

    private void validateDuplicateMember(Member member) {
        memberRepository.findByName(member.getName()).ifPresent(m -> {
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        });
    }

    /**
     * 전체 회원 조회
     * @return
     */
    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

    public Optional<Member> findOne(Long memberId) {
        return memberRepository.findById(memberId);
    }


}

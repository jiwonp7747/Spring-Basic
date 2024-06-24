package hello.hello_spring.repository;

import hello.hello_spring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id); //Optional은 함수에서 null이 발생했을 때를 위함
    Optional<Member> findByName(String name);
    List<Member> findAll();
}

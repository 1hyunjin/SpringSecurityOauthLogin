package tutorial.oauthlogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tutorial.oauthlogin.domain.Member;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByOauthId(String id);
}

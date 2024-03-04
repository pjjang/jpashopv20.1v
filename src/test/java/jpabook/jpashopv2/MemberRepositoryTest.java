package jpabook.jpashopv2;

import jpabook.jpashopv2.domain.Member;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;


@SpringBootTest
public class MemberRepositoryTest {

    //@Autowired
    //MemberRepository memberRepository;

    @Test
    @Transactional
    @Rollback(value = false)
    public void test() throws Exception {
        //given
        Member member = new Member();
        member.setName("memberA");

//        System.out.println("arrayList? : " + member.getOrders().getClass());
//
//        System.out.println("arrayList? : " + member.getOrders().getClass());
        //when
//        Long saveId = memberRepository.save(member);
//        Member findMember = memberRepository.find(saveId);
//
//        //then
//        Assertions.assertThat(findMember.getId()).isEqualTo(member.getId());
//        Assertions.assertThat(findMember.getUsername()).isEqualTo(member.getUsername());
//        Assertions.assertThat(findMember).isEqualTo(member);

    }

}
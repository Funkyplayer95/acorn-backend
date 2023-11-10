package hello.hellospring.repository;

import hello.hellospring.domain.Member;

//import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class MemoryMemberRepositoryTest {

    MemoryMemberRepository repository = new MemoryMemberRepository();

    @AfterEach
    public void afterEach(){
        repository.clearStore();
    }


    @Test
    public void save() {
        Member member = new Member();
        member.setName("spring");

        repository.save(member);

        //리턴 반환값 보는 단축키 = ctrl + alt + V
        Member result = repository.findById(member.getId()).get();

        //출력해보는 방법 1. System.out.println("result = " + (result==member));
        //출력해보는 방법 2. Assertions.assertEquals(member, result); => Assertions - jupiter 사용

        //출력해보는 방법 3.  => Assertions - assertj 사용
        //Assertions.assertThat(member).isEqualTo(result); 이렇게 출력하는 방법도 있지만, import static(9번줄)을 이용하여
        assertThat(member).isEqualTo(result); //앞으로 assertThat만 작성해도 가능하게 가능.

    }

    @Test
    public void findByName() {
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member(); // shift + F6 = 연관 단어 한번에 고치기
        member2.setName("spring2");
        repository.save(member2);

        Member result = repository.findByName("spring1").get();

        assertThat(result).isEqualTo(member1);
    }

    @Test
    public void findAll(){
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        List<Member> result = repository.findAll();

        assertThat(result.size()).isEqualTo(2);
    }
}

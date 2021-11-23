package hellojpa;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {

  public static void main(String[] args) {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
    EntityManager em = emf.createEntityManager();
    EntityTransaction tx = em.getTransaction();

    tx.begin();

    try {
      // 회원 등록
//      Member member = new Member();
//      member.setId(2L);
//      member.setName("HelloB");
//      em.persist(member);

      // 회원 단 건 조회
//      Member findMember = em.find(Member.class, 1L);
//      System.out.println("findMembers.id = " + findMember.getId());
//      System.out.println("findMembers.name = " + findMember.getName());

      // 회원 삭제
//      em.remove(findMember);

      // 회원 수정
//      findMember.setName("HelloJPA");

      // 쿼리 작성
      List<Member> result = em.createQuery("select m from Member as m", Member.class)
          .setFirstResult(5)
          .setMaxResults(8)
          .getResultList();

      for (Member member : result) {
        System.out.println("member.name = " + member.getName());
      }

      tx.commit();
    } catch (Exception e) {
      tx.rollback();
    } finally {
      em.close();
    }

    emf.close();
  }
}

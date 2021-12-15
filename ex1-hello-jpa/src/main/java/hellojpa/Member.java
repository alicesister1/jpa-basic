package hellojpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
//@SequenceGenerator(name = "MEMBER_SEQ_GENERATOR",
//    sequenceName = "MEMBER_SEQ",
//    initialValue = 1, allocationSize = 1)
public class Member {

  @Id
//  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MEMBER_SEQ_GENERATOR")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "name")
  private String username;
//
//  private Integer age;
//
//  @Enumerated(EnumType.STRING)
//  private RoleType roleType;
//
//  @Temporal(TemporalType.TIMESTAMP)
//  private Date createdDate;
//
//  @Temporal(TemporalType.TIMESTAMP)
//  private Date lastModifiedDate;
//
//  @Lob
//  private String description;
//
//  @Transient
//  private Integer temp;

  public Member() {
  }
}

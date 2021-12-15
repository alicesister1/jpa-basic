package hellojpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Entity
@TableGenerator(
    name = "MEMBER_SEQ_GENERATOR",
    table = "MY_SEQUENCES",
    pkColumnValue = "MEMBER_SEQ", allocationSize = 1)
public class Member {

  @Id
  @GeneratedValue(strategy = GenerationType.TABLE, generator = "MEMBER_SEQ_GENERATOR")
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

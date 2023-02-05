package kg.mega.OnlineStore.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Table(name = "tb_account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String password;
    private String email;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    @JsonIgnore
    @ManyToOne(cascade = CascadeType.MERGE,fetch = FetchType.LAZY)
    private Users user;
    @Column(name = "is_active", columnDefinition = "boolean default true")
    private boolean isActive;
    @OneToMany(mappedBy = "account")
    private List<Order> orders;

    public Account(String login, String password, String email, LocalDateTime startDate) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.startDate = startDate;
        this.endDate = startDate.plusYears(100);
        this.isActive = true;
    }
}

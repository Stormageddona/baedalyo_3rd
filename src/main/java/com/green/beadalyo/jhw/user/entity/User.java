package com.green.beadalyo.jhw.user.entity;

import com.green.beadalyo.jhw.user.model.UserInfoPatchDto;
import com.green.beadalyo.jhw.user.model.UserSignUpPostReq;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_pk")
    private Long userPk;

    @Column(name = "user_id", nullable = false, unique = true)
    private String userId;

    @Column(name = "user_pw", nullable = false)
    private String userPw;

    @Column(name = "user_name", nullable = false)
    private String userName;

    @Column(name = "user_nickname", unique = true, nullable = false)
    private String userNickname;

    @Column(name = "user_pic", nullable = false)
    private String userPic;

    @Column(name = "user_phone" ,length = 30, unique = true, nullable = false)
    private String userPhone;

    @Column(name = "user_email", length = 50, unique = true, nullable = false)
    private String userEmail;

    @Column(name = "user_role", length = 20, nullable = false)
    private String userRole;

    @ColumnDefault("1")
    @Column(name = "user_state", nullable = false)
    private int userState;

    @ColumnDefault("1")
    @Column(name = "user_login_type",nullable = false)
    private Integer userLoginType ;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    public User(UserSignUpPostReq p) {
        this.userId = p.getUserId();
        this.userPw = p.getUserPw();
        this.userName = p.getUserName();
        this.userNickname = p.getUserNickname();
        this.userPhone = p.getUserPhone();
        this.userEmail = p.getUserEmail();
        this.userRole = p.getUserRole();
        this.userLoginType = p.getUserLoginType();
    }

    public void update(UserInfoPatchDto p) {
        if(p.getUserNickname() != null && !p.getUserNickname().isEmpty()) {
            this.userNickname = p.getUserNickname();
        }
        if(p.getUserPhone() != null && !p.getUserPhone().isEmpty()) {
            this.userPhone = p.getUserPhone();
        }
        if(p.getUserPic() != null && !p.getUserPic().isEmpty()) {
            this.userPic = p.getUserPic();
        }
    }

}

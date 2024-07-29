package com.green.beadalyo.jhw.useraddr.repository;

import com.green.beadalyo.jhw.user.model.UserSignUpPostReq;
import com.green.beadalyo.jhw.useraddr.Entity.UserAddr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserAddrRepository extends JpaRepository<UserAddr, Long> {

}

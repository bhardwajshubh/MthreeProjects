package com.mthree.repositories;


import com.mthree.dtos.UserDTO;
import com.mthree.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Users , Integer> {

    @Query("select new com.mthree.dtos.UserDTO(u.userId , u.personName , u.age , u.occupation , e.eventId) from Events e inner join e.users u on e.eventId = u.event.eventId where e.eventId=:eventId")
    public List<UserDTO> findUsersByEventId(@Param("eventId") int eventId);
}

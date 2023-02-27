package net.javaguides.dbms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.dbms.entity.Rooms;

public interface RoomRepo extends JpaRepository<Rooms, Long>{

}

package net.javaguides.dbms.service;

import java.util.List;

import net.javaguides.dbms.entity.Rooms;

public interface RoomService {

	public List<Rooms> getAllRooms();
	
	public Rooms getRoomById(Long id);
	
	public Rooms updateRoom(Rooms rooms);
}

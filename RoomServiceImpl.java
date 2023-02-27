package net.javaguides.dbms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.dbms.entity.Rooms;
import net.javaguides.dbms.repository.RoomRepo;
import net.javaguides.dbms.service.RoomService;

@Service
public class RoomServiceImpl implements RoomService {

	private RoomRepo roomRepo;
	
	public RoomServiceImpl(RoomRepo roomRepo) {
		super();
		this.roomRepo = roomRepo;
	}

	@Override
	public List<Rooms> getAllRooms() {
		return roomRepo.findAll();
	}


	@Override
	public Rooms getRoomById(Long id) {
		return roomRepo.findById(id).get();
	}

	@Override
	public Rooms updateRoom(Rooms rooms) {
		return roomRepo.save(rooms);
	}

}

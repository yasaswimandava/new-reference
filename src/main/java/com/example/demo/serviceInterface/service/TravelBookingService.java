package com.example.demo.serviceInterface.service;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dto.TravelDto;
import com.example.demo.dto.UserDto;
import com.example.demo.entity.TravelBooking;
import com.example.demo.entity.User;
import com.example.demo.repository.TravelBookingRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.serviceInterface.TravelBookingInterface;

@Service
public class TravelBookingService implements TravelBookingInterface{
	
	@Autowired
	TravelBookingRepository travelRepo;
	@Autowired
	UserRepository userRepo;

	@Override
	public void addTravelDetails(TravelBooking book, int userId) {
		User u= userRepo.findById(userId).orElse(null);
		book.setUser(u);
		userRepo.save(u);
		travelRepo.save(book);	
	}
	
	@Override
	public List<User> getAllUsers() {
		
		return userRepo.findAll();
	}

	@Override
	public List<TravelDto> getBooking(UserDto userdto) {
		ModelMapper mp=new ModelMapper();
		List<TravelBooking> travellist=userdto.getUser().getTravellist();
		List<TravelBooking> tralist=travellist.stream().filter(e->e.getTravelFrom().equalsIgnoreCase(userdto.getTravelFrom())).collect(Collectors.toList());
		List<TravelDto> traveldto =new ArrayList<TravelDto>();
		tralist.forEach(e->traveldto.add(mp.map(e,TravelDto.class)));
		return traveldto;
	}

	@Override
	public TravelBooking getBookingByid(int bookingId) {
		
		return travelRepo.findById(bookingId).orElse(null);
	}

	

}
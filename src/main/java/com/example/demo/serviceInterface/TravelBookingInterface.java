package com.example.demo.serviceInterface;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.dto.TravelDto;
import com.example.demo.dto.UserDto;
import com.example.demo.entity.TravelBooking;
import com.example.demo.entity.User;

@Service
public interface TravelBookingInterface  {

	void addTravelDetails(TravelBooking book, int userId);

	List<User> getAllUsers();

	List<TravelDto> getBooking(UserDto userdto);

	TravelBooking getBookingByid(int id);


}

package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.dto.TravelDto;
import com.example.demo.dto.UserDto;
import com.example.demo.entity.TravelBooking;
import com.example.demo.entity.User;
import com.example.demo.serviceInterface.TravelBookingInterface;
import com.example.demo.serviceInterface.UserInterface;
@Controller
public class TravelBookingController {
	@Autowired
	TravelBookingInterface travelInterface;
	@Autowired
	UserInterface userInterface;

	@RequestMapping("/travelbooking")
	public String travelreg(Model model) {
	
		List<User> user=userInterface.listAllUsers();
		model.addAttribute("user",user );
		TravelBooking book=new TravelBooking();
		model.addAttribute("travelbooking", book);
		return "travelbooking";
	}
		@RequestMapping(value="/book",method=RequestMethod.POST)
		public String save (@RequestParam("userId") int userId,@ModelAttribute("travelbooking") TravelBooking book)
		{
			travelInterface.addTravelDetails(book,userId);
			return "redirect:";
			
		}
		
		@RequestMapping("/showdetails")
		public ModelAndView showdetails()
		{
			ModelAndView mav =new ModelAndView("bookingdetails");
			List<User> userlist=travelInterface.getAllUsers();
			mav.addObject("userlist", userlist);
			mav.addObject("date", new UserDto());
			return mav;
			
		}
		@RequestMapping("/getdetails")
		public ModelAndView getbookingslist(@ModelAttribute("date") UserDto userdto)
		{
			ModelAndView mav =new ModelAndView("bookingdetails");
			List<User> userlist=travelInterface.getAllUsers();
			mav.addObject("userlist", userlist);
			List<TravelDto> travellist=travelInterface.getBooking(userdto);	
			mav.addObject("travellist", travellist);
			return mav;
			
		}
		@RequestMapping("/update/{id}")
		public ModelAndView update(@PathVariable int id)
		{
			ModelAndView mav=new ModelAndView("updatebooking");
			TravelBooking travelbook=travelInterface.getBookingByid(id);
			mav.addObject("travelbooking", travelbook);
			return mav;
			
		}
		@RequestMapping(value="/updatedetails",method=RequestMethod.POST)
		public String updatedetails(@RequestParam("userId") int userId,@ModelAttribute("travelbooking")TravelBooking book)
		{
			travelInterface.addTravelDetails(book, userId);
			return "redirect:/showdetails";
			
		}
		
		
		
		
		
	}
	
	
	
	
	



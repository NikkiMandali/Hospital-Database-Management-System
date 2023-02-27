package net.javaguides.dbms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.javaguides.dbms.entity.Employee;
import net.javaguides.dbms.entity.Patient;
import net.javaguides.dbms.entity.Rooms;
import net.javaguides.dbms.service.PatientService;
import net.javaguides.dbms.service.RoomService;
import net.javaguides.dbms.service.EmployeeService;

@Controller
public class AppController {
	
	private EmployeeService employeeService;
	
	private PatientService patientService;
	
	private RoomService roomService;
	
	public AppController(EmployeeService employeeService, PatientService patientService, RoomService roomService) {
		super();
		this.employeeService = employeeService;
		this.patientService = patientService;
		this.roomService = roomService;
	}
	
	@GetMapping("/home")
	public String homePage() {
		return "HomePage";
	}
	
	@GetMapping("/employees")
	public String listEmployees(Model model) {
		model.addAttribute("employees", employeeService.getAllEmployees());
		return "employees";
	}
	
	@GetMapping("/patients")
	public String listPatients(Model model) {
		model.addAttribute("patients", patientService.getAllPatients());
		return "patients";
	}
	
	@GetMapping("/rooms")
	public String listRooms(Model model) {
		model.addAttribute("rooms", roomService.getAllRooms());
		return "rooms";
	}
	
	@GetMapping("/employees/new")
	public String createEmployeeForm(Model model) {
		
		// create student object to hold student form data
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "create_Employee";
		
	}
	
	@GetMapping("/patients/new")
	public String createPatientForm(Model model) {
		
		// create student object to hold student form data
		Patient patient = new Patient();
		model.addAttribute("patient", patient);
		return "create_student";
		
	}
	
	@GetMapping("/patient-details/{id}")
	public String viewPatientDetails(@PathVariable Long id, Model model) {
		
		Patient patient = new Patient();
		patientService.getPatientById(id);
		model.addAttribute("patient", patient);
		return "patients-details";
	}
	
	@PostMapping("/employees")
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		employeeService.saveEmployee(employee);
		return "redirect:/employees";
	}
	
	@PostMapping("/patients")
	public String savePatient(@ModelAttribute("patient") Patient patient) {
		patientService.savePatient(patient);
		return "redirect:/patients";
	}
	
	@GetMapping("/employees/edit/{id}")
	public String editEmployeeForm(@PathVariable Long id, Model model) {
		model.addAttribute("employee", employeeService.getEmployeeById(id));
		return "edit_employee";
	}
	
	@GetMapping("/patients/edit/{id}")
	public String editPatientForm(@PathVariable Long id, Model model) {
		model.addAttribute("patient", patientService.getPatientById(id));
		return "edit_patient";
	}
	
	@GetMapping("/rooms/edit/{id}")
	public String editRoom(@PathVariable Long id, Model model) {
		model.addAttribute("rooms", roomService.getRoomById(id));
		return "edit_room";
	}
	
	@PostMapping("/employees/{id}")
	public String updateEmployee(@PathVariable Long id,
			@ModelAttribute("employee") Employee employee,
			Model model) {
		
		// get Employee from database by id
		Employee existingEmployee = employeeService.getEmployeeById(id);
		existingEmployee.setName(employee.getName());
		existingEmployee.setAddress(employee.getAddress());
		existingEmployee.setJob(employee.getJob());
		existingEmployee.setSalary(employee.getSalary());
		existingEmployee.setPhoneNumber(employee.getPhoneNumber());
		
		// save updated employee object
		employeeService.updateEmployee(existingEmployee);
		return "redirect:/employees";		
	}
	
	@PostMapping("/patients/{id}")
	public String updatePatient(@PathVariable Long id,
			@ModelAttribute("patient") Patient patient, Model model) {
		
		// get Patient from database by id
		Patient existingPatient = patientService.getPatientById(id);
		existingPatient.setPatientName(patient.getPatientName());
		existingPatient.setAddress(patient.getAddress());
		existingPatient.setBloodGroup(patient.getBloodGroup());
		existingPatient.setAge(patient.getAge());
		existingPatient.setGender(patient.getGender());
		existingPatient.setPhoneNumber(patient.getPhoneNumber());
		existingPatient.setAdmitDate(patient.getAdmitDate());
		existingPatient.setRoomNumber(patient.getRoomNumber());
		
		// save updated employee object
		patientService.updatePatient(existingPatient);
		return "redirect:/patients";		
	}
	
	@PostMapping("/rooms/{id}")
	public String updateRoom(@PathVariable Long id,
			@ModelAttribute("rooms") Rooms rooms, Model model) {
		
		// get Patient from database by id
		Rooms existingRoom = roomService.getRoomById(id);
		existingRoom.setId(rooms.getId());
		existingRoom.setType(rooms.getType());
		existingRoom.setCost(rooms.getCost());
		existingRoom.setAvailability(rooms.getAvailability());
		
		// save updated employee object
		roomService.updateRoom(existingRoom);
		return "redirect:/rooms";		
	}
	
	@GetMapping("/employees/{id}")
	public String deleteEmployees(@PathVariable Long id) {
		employeeService.deleteEmployee(id);
		return "redirect:/employees";
	}
	
	@GetMapping("/patients/{id}")
	public String deletePatients(@PathVariable Long id) {
		patientService.deletePatient(id);
		return "redirect:/patients";
	}
	
}

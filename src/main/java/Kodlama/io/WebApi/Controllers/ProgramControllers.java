package Kodlama.io.WebApi.Controllers;

import Kodlama.io.Devs.Business.Abstract.ProgramService;

import Kodlama.io.Devs.Entities.Concrete.Program;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController //annotation
@RequestMapping("/api/programs")
public class ProgramControllers {
 private ProgramService _programService;
 
 
 
 @Autowired
 public ProgramControllers(ProgramService programService) {
	 _programService = programService;
 }
 
 @GetMapping("/getall")
 public List<Program> getAll(){
	 return _programService.getAll();
 }
 
}

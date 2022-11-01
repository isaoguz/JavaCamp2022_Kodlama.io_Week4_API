package Kodlama.io.Devs.DataAccess.Concrete;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.DataAccess.Abstract.ProgramRepository;
import Kodlama.io.Devs.Entities.Concrete.Program;

@Repository
public class InMemoryProgramRepository implements ProgramRepository {


	public List<Program> programs;

	
	public InMemoryProgramRepository( ) {
		  programs = new ArrayList<Program>();
		  programs.add(new Program(1,"Java"));
		  programs.add(new Program(1,"C#"));
		  programs.add(new Program(1,"Pyhton"));
		  programs.add(new Program(1,"PHP"));
		  programs.add(new Program(1,"Laravel"));
		  programs.add(new Program(1,"React"));
		  programs.add(new Program(1,"C++"));

	}
	
	
	
	
	
	@Override
	public void add(Program program) {
	
		programs.add(program);
		
	}

	@Override
	public void delete(int id) {
		programs.remove(id);
		
	}

	@Override
	public void update(Program program) {
	for(Program program1:programs) {
		if(program1.getId()==program.getId()) {
			program.setName(program.getName());
		}
	}
	
	}

	@Override
	public List<Program> getAll() {
		
		return programs;
	}

	@Override
	public Program getById(int id) {
		for(Program program:programs) {
			if (program.getId()==id) {
				return program;
			}
		}
		return null;

	}

	@Override
	public Program getByName(String name) {
		for(Program program:programs) {
			if (program.getName()==name) {
				return program;
			}
		}
		return null;
	}

}

package Kodlama.io.Devs.Business.Concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.Business.Abstract.ProgramService;
import Kodlama.io.Devs.DataAccess.Abstract.ProgramRepository;
import Kodlama.io.Devs.DataAccess.Concrete.InMemoryProgramRepository;
import Kodlama.io.Devs.Entities.Concrete.Program;

@Service
public class ProgramManager implements ProgramService {

	
	
	private ProgramRepository _programRepository;
	private InMemoryProgramRepository _inMemoryProgramRepository;
	private List<Program> _program;
	
	@Autowired
	public ProgramManager(ProgramRepository programRepository,InMemoryProgramRepository inMemoryProgramRepository,List<Program> program) {
		_programRepository = programRepository;
		_inMemoryProgramRepository = inMemoryProgramRepository;
		_program=program;
	}
	
	
	@Override
	public void add(Program program) {
		for(Program programs:_inMemoryProgramRepository.programs) {
			if (programs.getName().equals(program.getName())) {
				System.out.println("İsim tekrar edemez.");
			}if(programs.getName().isEmpty()) {
				System.out.println("İsim boş geçilemez");
			}
			else {
				_programRepository.add(program);				
			}
		}
		
	}

	@Override
	public void delete(int id) {
		_programRepository.delete(id);
		
	}

	@Override
	public void update(Program program) {
		_programRepository.update(program);
		
	}

	@Override
	public List<Program> getAll() {
		
		return _programRepository.getAll();
	}

	@Override
	public Program getById(int id) {
		
		return _programRepository.getById(id);
	}

	@Override
	public Program getByName(String name) {
		
		return _programRepository.getByName(name);
	}

}

package Kodlama.io.Devs.DataAccess.Abstract;

import java.util.List;



import Kodlama.io.Devs.Entities.Concrete.Program;


public interface ProgramRepository {
	
void add(Program program);
void delete(int id);
void update(Program program);
List<Program> getAll();
Program getById(int id);
Program getByName(String name);

}

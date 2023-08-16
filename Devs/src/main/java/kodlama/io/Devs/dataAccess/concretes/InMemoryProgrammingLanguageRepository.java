package kodlama.io.Devs.dataAccess.concretes;


import kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository //bu sınıf bir dataAccess nesnesidir.
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {

    List<ProgrammingLanguage> programmingLanguages;

    public InMemoryProgrammingLanguageRepository() {
        programmingLanguages = new ArrayList<ProgrammingLanguage>();

        programmingLanguages.add(new ProgrammingLanguage(1,"C#"));
        programmingLanguages.add(new ProgrammingLanguage(2,"Java"));
        programmingLanguages.add(new ProgrammingLanguage(3,"Python"));
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguages;
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) {

    }

    @Override
    public void upDate(ProgrammingLanguage programmingLanguage) {

    }

    @Override
    public void delete(int id) {

    }
}

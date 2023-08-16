package kodlama.io.Devs.business.abstracts;

import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageService {
    List<ProgrammingLanguage> getAll();

    void add(ProgrammingLanguage programmingLanguage);

    void upDate(ProgrammingLanguage programmingLanguage);

    void delete(int id);
}

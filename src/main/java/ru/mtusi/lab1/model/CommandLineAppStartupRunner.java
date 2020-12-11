package ru.mtusi.lab1.model;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.mtusi.lab1.dao.Repository;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {

        private final Repository repository;
        @Autowired
        public CommandLineAppStartupRunner(Repository repository)
        {
            this.repository = repository;
        }
        @Override
        public void run(String...args) throws Exception{

            System.out.println(repository.findById(1L).get());
        }

}


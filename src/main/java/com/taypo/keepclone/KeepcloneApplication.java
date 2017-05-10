package com.taypo.keepclone;

import com.taypo.keepclone.note.Note;
import com.taypo.keepclone.note.NoteRepo;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KeepcloneApplication implements InitializingBean {

	@Autowired
	NoteRepo noteRepo;

	public static void main(String[] args) {
		SpringApplication.run(KeepcloneApplication.class, args);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		noteRepo.save(new Note("Title1", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."));
		noteRepo.save(new Note("Title2", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."));
		noteRepo.save(new Note("Title3", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."));
		noteRepo.save(new Note("Title4", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."));
		noteRepo.save(new Note("Title5", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."));
	}
}

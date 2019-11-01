package br.com.codenation.Aplication;

import br.com.codenation.Aplication.annotation.Method;
import br.com.codenation.Aplication.entity.Usuario;
import br.com.codenation.Aplication.service.impl.FileStreamService;
import org.apache.catalina.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class AplicationApplicationTests {

	@Test
	void contextLoads() {
		Class<FileStreamService> file = FileStreamService.class;

//		for (Method declaredMethod : file.getDeclaredMethod()) {
//			Assertions.assertEquals(declaredMethod.getAno);
//		}
	}
}
